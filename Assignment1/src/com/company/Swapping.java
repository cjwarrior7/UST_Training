package com.company;

import java.util.Scanner;

public class Swapping {
    public static void swapWithout(int a ,int b){
       a=a+b;
       b=a-b;
       a=a-b;
        System.out.println(a);
        System.out.println(b);
    }
    public static void swapWithThird(int a,int b){
        int temp=a;
        a=b;
        b=temp;
        System.out.println(a);
        System.out.println(b);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        swapWithout(a,b);
        swapWithThird(a,b);
    }
}
