package com.company;

public class BankAccount {
    BankAccount bacc;
    long bal=500;
    public synchronized void deposit(long amount){
        System.out.println("Depositing in account");
        bal=bal+amount;
        notify();
    }
    public synchronized void withdraw(long amount ) throws InterruptedException {
        if(amount>=bal){
            System.out.println("wait for deposit");
            wait();
        }
        bal=bal-amount;
        System.out.println("Transaction1 withdrawn Successfull");

    }

}
