package com.MultiThreading;

/**
 * Created by aojha on 6/14/17.
 */

class Customer{
    int amount=10000;

    synchronized void withdraw(int amount){
        System.out.println("Going to withdraw the amount");

        if(this.amount < amount){
            System.out.println("Less Balance wait for deposit");
        }

        try {
            wait();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        this.amount = this.amount -amount;
        System.out.println("Withdraw completed");
    }

    synchronized void deposit(int amount){
        System.out.println("Going to deposit");

        this.amount = this.amount + amount;

        System.out.println("Deposit completed");
        notify();
    }
}
public class InterThreadCommunication {
    public static void main(String[] args) {
        final Customer c = new Customer();

        new Thread(){
            @Override
            public void run() {
                c.withdraw(20000);
            }
        }.start();

        new Thread(){
            @Override
            public void run() {
                c.deposit(15000);
            }
        }.start();
    }
}
