package com.Test;

/**
 * Created by aojha on 6/13/17.
 */
public class Complex {

    int re, im;

    Complex(int re, int im){
        this.re = re;
        this.im = im;
    }

    @Override
    public boolean equals(Object obj) {
        if(this == obj)
            return true;

        if(!(obj instanceof Complex))
            return false;

        Complex c = (Complex) obj;

        return Double.compare(re, c.re) == 0 && Double.compare(im, c.im) ==0;
    }
}

class ComplexMain{
    public static void main(String[] args) {
        Complex c1 = new Complex(10, 20);
        Complex c2 = new Complex(10, 20);

        if(c1.equals(c2)){
            System.out.println("Equal");
        }
        else{
            System.out.println("Not Equal");
        }
    }
}
