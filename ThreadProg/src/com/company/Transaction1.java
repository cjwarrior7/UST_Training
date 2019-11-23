package com.company;

public class Transaction1 extends Thread {
    BankAccount bacc;
    long amount;

    public Transaction1(BankAccount bacc, long amount) {
        this.bacc = bacc;
        this.amount = amount;
    }

    @Override
    public void run(){
        try {
            bacc.withdraw(amount);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
