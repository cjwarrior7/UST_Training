package com.company;

public class Client {
    public static void main(String[] args) {
        Watch obj=Shopkeeper.display();
        System.out.println(obj.brand);
        System.out.println(obj.price);
    }
}
