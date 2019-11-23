package com.company;

public class Resource {
    void print(){

        for (int i = 1; i <=4 ; i++) {
            System.out.println("thread name:"+Thread.currentThread());
        }
    }
}
