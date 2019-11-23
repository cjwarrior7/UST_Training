package com.objectcreationlayer;

import com.loancustomer.Loan;
import com.savingsacc.Saving;

public class Manager {
    public static BankFeatures createAcc(String acc_type,String name,int age){
        if(acc_type.equalsIgnoreCase("loan")){
            return new Loan(name,age);
        }
        else if(acc_type.equalsIgnoreCase("saving")){
            return new Saving(name,age);
        }
        return null;
    }
}
