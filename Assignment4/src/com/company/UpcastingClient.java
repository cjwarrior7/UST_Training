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
        System.out.println("Downcasting Example");
        Upcasting1 up1= (Upcasting1) up;
        System.out.println(up1.d);
        System.out.println(up1.d1);
        up1.fun();
        up1.fun2();
        up1.fun1();



    }
}
