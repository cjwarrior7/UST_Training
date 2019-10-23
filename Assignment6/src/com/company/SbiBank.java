package com.company;

public class SbiBank implements Atm_services {
    @Override
    public void withdraw() {
        System.out.println("WELCOME TO SBI WITHDRAW SERVICE");
    }

    @Override
    public void balanceEnquiry() {
        System.out.println("WELCOME TO SBI BALANCE ENQUIRY SERVICE");
    }

    @Override
    public void depositMoney() {
        System.out.println("WELCOME TO SBI DEPOSIT MONEY SERVICE");
    }

    @Override
    public void printminiStatement() {
        System.out.println("PLEASE WAIT WE ARE PRINTING MINI STATEMENT");
    }
}
