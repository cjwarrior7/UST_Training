package com.company;

public class EncapsulClient {
    public static void main(String[] args) {
       Encapsulation encapsulation=new Encapsulation("admin1234","password");
       encapsulation.printdetails();
       encapsulation.setPassword("pass1234");
       encapsulation.setUsername("Beta432");
       System.out.println(encapsulation.getUsername());
       System.out.println(encapsulation.getPassword());
        encapsulation.printdetails();


    }

}
