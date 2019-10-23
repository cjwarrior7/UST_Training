package com.company;

public class PnbBank implements Atm_services{
    @Override
    public void withdraw() {
        System.out.println("WELCOME TO PNB WITHDRAW SERVICE");
    }

    @Override
    public void balanceEnquiry() {
        System.out.println("WELCOME TO PNB BALANCE ENQUIRY SERVICE");
    }

    @Override
    public void depositMoney() {
        System.out.println("WELCOME TO PNB DEPOSIT MONEY SERVICE");
    }
    public void printminiStatement() {
        System.out.println("PLEASE WAIT WE ARE PRINTING MINI STATEMENT");
    }
}
