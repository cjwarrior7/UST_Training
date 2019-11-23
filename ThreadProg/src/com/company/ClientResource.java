package com.company;

public class ClientResource {
    public static void main(String[] args) {
        Resource r = new Resource();
        MyThread thread1 = new MyThread(r);
        thread1.setName("thread1");
        MyThread thread2 = new MyThread(r);
        thread2.setName("thread2");
        thread1.start();
        thread2.start();

    }
}

