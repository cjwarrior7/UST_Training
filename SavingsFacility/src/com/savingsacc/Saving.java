package com.savingsacc;

import com.objectcreationlayer.BankFeatures;

public class Saving implements BankFeatures {
    double bal = 5000;
    String name;
    int age;
    static String acc_type = "Saving";
    static String bank_name = "PMC BANK";

    public Saving( String name, int age) {
        this.name = name;
        this.age = age;

    }

    @Override
    public void deposit(double amt, int pin) {
        if (pin == 4321) {
            System.out.println("Name:" + name);
            System.out.println("Age:" + age);
            System.out.println("Acc_type:" + acc_type);
            System.out.println("Bank Name:" + bank_name);
            bal = bal + amt;
            System.out.println("Thanks you for Successful transaction");

        } else {
            System.out.println("Wrong Password");
        }

    }

    @Override
    public void withdraw(double amt, int pin) {
        if (pin == 4321 && amt< bal) {
            System.out.println("Name:" + name);
            System.out.println("Age:" + age);
            System.out.println("Acc_type:" + acc_type);
            System.out.println("Bank Name:" + bank_name);
            bal = bal - amt;
            System.out.println("Thanks you for Successful transaction");
        } else {
            System.out.println("Wrong Password");
        }
    }

    @Override
    public void checkbalance(int pin) {
        if (pin == 4321) {
            System.out.println("Name:" + name);
            System.out.println("Age:" + age);
            System.out.println("Acc_type:" + acc_type);
            System.out.println("Bank Name:" + bank_name);
            System.out.println("Printing Balance");
            System.out.println("Balance updated successfully:" + bal);
        } else {
            System.out.println("Wrong Password");
        }

    }
}
