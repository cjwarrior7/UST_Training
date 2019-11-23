package com.company;

public class Client {
    public static void main(String[] args) {
        Atm_services atm_ser=ServiceProvider.getServices("pnb");
        atm_ser.withdraw();
        atm_ser.printminiStatement();
        Atm_services atm_ser2=ServiceProvider.getServices("sbi");
        atm_ser2.withdraw();
        atm_ser2.printminiStatement();


    }
}
