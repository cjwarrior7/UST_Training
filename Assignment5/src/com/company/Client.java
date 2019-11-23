package com.company;

public class Client {
    public static void main(String[] args) {
        Singleton d1=Singleton.getObject();
        Singleton d2=Singleton.getObject();
        System.out.println(d1);
        System.out.println(d2);
    }
}
