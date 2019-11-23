package com.company;

public class Transaction2 extends Thread {
    BankAccount bacc;
    long amount;

    public Transaction2(BankAccount bacc,int amount) {
        this.bacc = bacc;
        this.amount=amount;
    }

    @Override
    public void run() {
        bacc.deposit(amount);
    }
}
