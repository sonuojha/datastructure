package com.Test;

/**
 * Created by aojha on 6/13/17.
 */
class Test{
    int x, y;
}

class Test2 implements Cloneable{
    int a, b;
    Test t = new Test();

    public Object clone()throws CloneNotSupportedException{
        Test2 t = (Test2) super.clone();

        t.t = new Test();
        return t;
    }
}

public class DeepCopy{
    public static void main(String[] args) throws CloneNotSupportedException {
        Test2 t1 = new Test2();
        t1.a =10;
        t1.b = 20;
        t1.t.x = 30;
        t1.t.y = 40;

        Test2 t2 = (Test2) t1.clone();

        t2.a=100;
        t2.t.x=300;

        System.out.println(t1.a + " " + t1.b+" "+ t1.t.x + " " + t1.t.y);
        System.out.println(t2.a + " " + t2.b+" "+ t2.t.x + " " + t2.t.y);
    }
}
