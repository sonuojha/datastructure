package com.MultiThreading;

/**
 * Created by aojha on 6/14/17.
 */
public class TestDeadLock {
    public static void main(String[] args) {
        final String resource1 = "Abhishek";
        final String resource2 = "Ojha";

        Thread t1 = new Thread(){
            @Override
            public void run() {
                synchronized (resource1) {
                    System.out.println("Thread-1 locked resource-1");

                    try {
                        Thread.sleep(50);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                    synchronized (resource2) {
                        System.out.println("Thread-1 locked resource-2");
                    }
                }
            }
        };


        Thread t2 = new Thread(){
            @Override
            public void run() {
                synchronized (resource2) {
                    System.out.println("Thread-2 locked resource-2");

                    try {
                        Thread.sleep(50);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                    synchronized (resource1) {
                        System.out.println("Thread-2 locked resource-1");
                    }
                }
            }
        };


        t1.start();
        t2.start();
    }
}
