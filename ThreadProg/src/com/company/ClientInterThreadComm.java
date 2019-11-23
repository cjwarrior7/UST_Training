package com.company;

public class ClientInterThreadComm {
    public static void main(String[] args) {
        BankAccount Bacc = new BankAccount();
        Transaction1 t1 = new Transaction1(Bacc, 2000);
        Transaction2 t2 = new Transaction2(Bacc, 2000);
        t1.start();
        t2.start();


    }
}
