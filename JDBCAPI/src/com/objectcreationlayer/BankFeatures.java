package com.objectcreationlayer;

public interface BankFeatures {
    void deposit(double amt,int pin);
    void withdraw(double amt,int pin);
    void checkbalance(int pin);

}
