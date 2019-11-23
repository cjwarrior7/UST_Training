package com.company;

public class TestThread {
    public static void main(String[] args) {
        Thread1 th1=new Thread1();
        th1.start();
        Thread2 th2=new Thread2();
        th2.start();
        //output cannot be predict sometime it will Thread1 output and sometime Thread2 you will see interlinked output.
    }
}
