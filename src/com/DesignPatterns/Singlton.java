package com.DesignPatterns;

/**
 * Created by aojha on 5/29/17.
 */


class ABC{
    private static ABC single = null;
    private ABC(){
        System.out.println("In Constructor");
    }

    public static ABC getInstance(){
        if(single == null) {
            synchronized (ABC.class) {
                if (single == null)
                    single = new ABC();
            }
        }
        return single;
    }

    public void show(){
        System.out.println("In Show method");
    }
}

public  class Singlton {
    public static void main(String args[]){
        ABC aObj = ABC.getInstance();
        ABC bObj = ABC.getInstance();
        aObj.show();
        bObj.show();
    }
}
