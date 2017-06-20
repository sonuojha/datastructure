package com.MultiThreading;

import java.util.LinkedList;

/**
 * Created by aojha on 6/14/17.
 */

class PC{
    LinkedList<Integer> list = new LinkedList<Integer>();
    int capacity = 2;

    public void produce() throws InterruptedException{
        int value = 0;

        while(true){
            synchronized (this){
                while (list.size() == capacity)
                    wait();

                System.out.println("Produced value: " + value);
                list.add(value++);
                notify();

                Thread.sleep(500);
            }
        }
    }

    public void consume() throws InterruptedException{
        while (true){
            synchronized (this){
                while (list.size() == 0)
                    wait();

                int value = list.removeFirst();
                System.out.println("Consumed: " + value);

                notify();

                Thread.sleep(500);
            }
        }
    }

}
public class ProducerConsumer {
    public static void main(String[] args) throws InterruptedException {

        final PC pc = new PC();

        Thread t1 = new Thread(){
            @Override
            public void run() {

                try {
                    pc.produce();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };

        Thread t2 = new Thread(){

            @Override
            public void run() {
                try {
                    pc.consume();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };

        t1.start();
        t2.start();

        t1.join();
        t2.join();
    }
}
