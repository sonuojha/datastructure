package com.MultiThreading;

/**
 * Created by aojha on 5/30/17.
 */

class ThreadSleep extends Thread{

    @Override
    public void run() {
        try {
            for(int i=0; i<5; i++) {
                //Thread.sleep(50);
                System.out.println(Thread.currentThread().getName()+" "+i + " " + Thread.currentThread().isDaemon());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

public class Multithreading {

    public static void main(String[] args) {
        ThreadSleep t1 =new ThreadSleep();
        ThreadSleep t2 = new ThreadSleep();
        ThreadSleep t3 = new ThreadSleep();
        t1.setName("Thread-1");
        t2.setName("Thread-2");
        t1.setDaemon(true);
        t1.start();
        try {
            t1.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        t2.start();

    }
}
