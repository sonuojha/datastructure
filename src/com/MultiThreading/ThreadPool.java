package com.MultiThreading;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Created by aojha on 6/14/17.
 */
public class ThreadPool implements Runnable{
    public void run() {
            System.out.println(Thread.currentThread().getName());
    }
}

class TestThreadPool{
    public static void main(String[] args) {
        ExecutorService executor = Executors.newFixedThreadPool(3);

        for(int i=0; i<5; i++){
            ThreadPool m = new ThreadPool();

            executor.execute(m);
        }
        executor.shutdown();

        while (!executor.isTerminated()){

        }
        System.out.println("Thread finished");
    }
}
