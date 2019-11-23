package com.loancustomer;

import com.objectcreationlayer.BankFeatures;

public class Loan implements BankFeatures {
    double bal = 50000;
    String name;
    int age;
    static String acc_type = "Loan";
    static String bank_name = "PMC BANK";

    public Loan(String name, int age) {
        this.name = name;
        this.age = age;
        this.acc_type = acc_type;

    }

    @Override
    public void deposit(double amt, int pin) {
        if (pin == 4321) {
            System.out.println("Name:" + name);
            System.out.println("Age:" + age);
            System.out.println("Acc_type:" + acc_type);
            System.out.println("Bank Name:" + bank_name);
            bal = bal - amt;
            System.out.println("Thanks you for Successful transaction");

        } else {
            System.out.println("wrong password");
        }

    }

    @Override
    public void withdraw(double amt, int pin) {
        if (pin == 4321 && amt<=50000) {
            System.out.println("Name:" + name);
            System.out.println("Age:" + age);
            System.out.println("Acc_type:" + acc_type);
            System.out.println("Bank Name:" + bank_name);
            bal = bal + amt;
            System.out.println("Thanks you for Successful transaction");

        } else {
            System.out.println("wrong password or withdraw limit exceed");
        }
    }


    @Override
    public void checkbalance(int pin) {
        if (pin == 4321) {
            System.out.println("Name:" + name);
            System.out.println("Age:" + age);
            System.out.println("Acc_type:" + acc_type);
            System.out.println("Bank Name:" + bank_name);
            System.out.println("Printing Balance...");
            System.out.println("Balance updated successfully:" + bal);
        } else {
            System.out.println("wrong password");
        }
    }

}

