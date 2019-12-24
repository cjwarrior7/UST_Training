package com.comapny.collectionpractical;

public class Account implements Comparable {
    int Account_id;
    String Account_holder_name;
    double Bal;
    int Age;
    String Ac_Type;

    public Account(int account_id, String account_holder_name, int age, String ac_Type) {
        Account_id = account_id;
        Account_holder_name = account_holder_name;
        Bal = 5000;
        Age = age;
        Ac_Type = ac_Type;
    }

    @Override
    public int hashCode() {
        return Account_id;
    }

    @Override
    public String toString() {
        return "Account id:" + Account_id + " Account_holder_name:" + Account_holder_name + " Balance:" + Bal + " Age:" + Age + " Type:" + Ac_Type;

    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Account) {
            Account temp = (Account) obj;
            if (this.Account_id == temp.Account_id)
                return true;
        }
        return false;
    }

    @Override
    public int compareTo(Object o) {
        return this.hashCode()-o.hashCode();
    }
}
