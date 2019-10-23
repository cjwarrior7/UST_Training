package com.company;

public class Instanceof_Ex {
    public static void main(String[] args) {
        String s="abcdef";
        boolean result=s instanceof String;
        boolean result1=s instanceof Object;
        System.out.println(result);
        System.out.println(result1);
    }
}
