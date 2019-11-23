package com.company;

public class MultiThread {
    public static void main(String[] args) {
        for (int i = 0; i <5 ; i++) {
            Thread thread1=new Thread(new MultiThreadingDemo());
            thread1.start();
        }


    }
}
