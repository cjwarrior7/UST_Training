package com.company.bank;

import java.util.Scanner;

public class Client {
    public static void main(String[] args) {
        System.out.println("How much money you want?");
        Scanner sc=new Scanner(System.in);

        double amt=sc.nextDouble();
        BankOperation bankop=new BankOperation(amt);
        bankop.request();
    }
}
