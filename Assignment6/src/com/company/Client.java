package com.company;

public class Client {
    public static void main(String[] args) {
        Atm_services mg=ServiceProvider.getServices("sbi");
        mg.withdraw();
        mg.printminiStatement();


    }
}
