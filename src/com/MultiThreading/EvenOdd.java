package com.MultiThreading;

/**
 * Created by aojha on 6/14/17.
 */

public class EvenOdd{
    synchronized void even(){
        for(int i=0; i<10; i++){
            if(i%2==0){
                System.out.println("Even number: ");
            }
        }
    }
}


class EvenOddMain {
    public static void main(String[] args) {

        Thread t1 = new Thread(){
            @Override
            public void run() {
                super.run();
            }
        };

        Thread t2 = new Thread(){
            @Override
            public void run() {
                super.run();
            }
        };

        t1.start();
        t2.start();
    }
}
