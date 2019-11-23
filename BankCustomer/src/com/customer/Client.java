package com.customer;

import com.objectcreationlayer.*;

import java.util.Scanner;

public class Client {
    public static void main(String[] args) {
        System.out.println("Welcome");
        /*Scanner sc=new Scanner(System.in);
        System.out.println("Enter your name");
        String name=sc.nextLine();
        System.out.println("Enter the accoun type:Loan/Saving");
        String acc_type=sc.next();
        System.out.println("Enter your age");
        int age=sc.nextInt();*/
        BankFeatures customer=Manager.createAcc("LOAN","ram",56);
        customer.deposit(5000,4321);
        System.out.println("***********************");
        customer.withdraw(50000,4321);
        System.out.println("************************");
        customer.checkbalance(4321);
        System.out.println("************************");
    }
}
