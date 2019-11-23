package com.company;

public class MultiThreadingDemo implements Runnable {
    @Override
    public void run() {
        System.out.println("Thread "+Thread.currentThread().getName()+"is running");
        System.out.println("Thread id:"+Thread.currentThread().getId()+"is running");
    }
}
