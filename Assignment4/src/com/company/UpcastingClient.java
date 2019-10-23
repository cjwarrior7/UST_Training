package com.company;

public class UpcastingClient {
    public static void main(String[] args) {
        Upcasting up=(Upcasting) new Upcasting1();
        System.out.println(up.d);
        System.out.println(up.d1);
        //System.out.println(up.d2);//not able to access child class data member
        up.fun();
        up.fun1();
        //up.fun2();//not able to access child class function
    }
}
