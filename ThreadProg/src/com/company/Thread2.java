package com.company;

public class Thread2 extends Thread {
    @Override
    public void run() {
        for (int i = 5; i <10; i++) {
            System.out.println("I am Thread 2");
        }
    }
}
