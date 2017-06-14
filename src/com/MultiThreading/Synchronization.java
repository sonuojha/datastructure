package com.MultiThreading;

/**
 * Created by aojha on 6/14/17.
 */
class Table{
    synchronized static void printTable(int n){
            for(int i=1; i<=5; i++){
                System.out.println(n*i);
            }
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
}

 class Thread1 extends Thread{

     @Override
     public void run() {
         Table.printTable(5);
     }
 }

 class Thread2 extends Thread{
     @Override
     public void run() {
         Table.printTable(10);
     }
 }

class Thread3 extends Thread{
    @Override
    public void run() {
        Table.printTable(15);
    }
}

class Thread4 extends Thread{
    @Override
    public void run() {
        Table.printTable(20);
    }
}

public class Synchronization {
    public static void main(String[] args) {
        //final Table t = new Table();

        Thread t1 = new Thread(){
            @Override
            public void run() {
                Table.printTable(5);
            }
        };

        Thread t2 = new Thread(){
            @Override
            public void run() {
                Table.printTable(10);
            }
        };

        //Thread1 t1 = new Thread1();
        //Thread2 t2 = new Thread2();
        Thread3 t3 = new Thread3();
        Thread4 t4 = new Thread4();

        t1.start();
        t2.start();
        t3.start();
        t4.start();
    }
}
