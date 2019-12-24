package com.comapny.collectionpractical;


import java.util.*;

public class AllAccount {
    public static void main(String[] args) {
       /* Scanner sc=new Scanner(System.in);
        System.out.println("Enter the account number");
        int account_id=sc.nextInt();
        System.out.println("Enter name");
        String name=sc.next();
        System.out.println("Enter the Age");
        int age=sc.nextInt();
        System.out.println("Enter the Account Type(Loan/Saving)");
        String ac_type=sc.next();
        if(ac_type.equalsIgnoreCase("loan")){
            System.out.println("*************");
        }
        else if(ac_type.equalsIgnoreCase("saving")){
            System.out.println("*************");
        }
        else{
            System.out.println("Enter the valid loan or saving type");
            return;
        } */
        Set<Account> accounts = new HashSet<>();
        accounts.add(new Account(1, "dinga", 23, "savings"));
        accounts.add(new Account(1, "dinga", 26, "savings"));
        accounts.add(new Account(2, "dingi", 26, "Loan"));
        accounts.add(new Account(4, "rani", 32, "savings"));
        accounts.add(new Account(2, "dingi", 23, "Loan"));
        accounts.add(new Account(3, "raja", 29, "Loan"));
        accounts.add(new Account(3, "raja", 29, "Loan"));
        accounts.add(new Account(4, "rani", 32, "savings"));
        accounts.add(new Account(5, "rani1", 32, "savings"));
        System.out.println("Enter the account number or id");
        Scanner sc = new Scanner(System.in);
        int Account_id = sc.nextInt();
        Iterator it = accounts.iterator();
        while (it.hasNext()) {
            Object obj = it.next();
            Account ac = (Account) obj;
            if (ac.Account_id == Account_id) {
                System.out.println("1.Update existing account");
                System.out.println("2.Delete existing account");
                System.out.println("3.Search existing account");
                System.out.println("4.Display existing account");
                System.out.println("5.Depositing money existing account");
                System.out.println("6.withdrawing money from existing account");
                System.out.println("7.Sort the above user account on account id");
                System.out.println("8.Sort the above user account on account name");
                System.out.println("Enter the number from  above operation which has to be perform");
                int choice = sc.nextInt();
                switch (choice) {
                    case 1:
                        System.out.println("Enter the new fields");
                        System.out.println("Enter the updated account holder name:");
                        String new_ac_holder_name = sc.nextLine();
                        if ((new_ac_holder_name).length() > 0) {
                            ac.Account_holder_name = new_ac_holder_name;
                        }
                        System.out.println("Enter the updated Age:");
                        int new_age = sc.nextInt();
                        if (new_age > 0 && new_age < 100) {
                            ac.Age = new_age;
                        }
                        System.out.println("Enter the updated account type loan or saving:");
                        String new_ac_type = sc.next();
                        if (new_ac_type.equalsIgnoreCase("loan") || new_ac_type.equalsIgnoreCase("saving")) {
                            ac.Account_holder_name = new_ac_holder_name;
                        }
                        break;
                    case 2:
                        System.out.println("Deleting account");
                        System.out.println("Are you sure Enter the account number or id to delete");
                        int delete_id = sc.nextInt();

                        if (delete_id==Account_id) {
                            boolean account_id = accounts.remove("Account_id");
                            System.out.println("******deleted successfully******");
                        }
                        else{
                            System.out.println("wrong id input");
                        }
                        break;
                    case 3:
                        System.out.println("Search account");
                        if (accounts.contains("Account_id")) ;
                    {
                        System.out.println("Account find successfully");
                    }
                    break;
                    case 4:
                        System.out.println("Display all accounts");
                        for (Account acc : accounts
                        ) {
                            System.out.println("ac_id" + acc.Account_id + " ac_name:" + acc.Account_holder_name + " age:" + acc.Age + " acc_type:" + acc.Ac_Type);
                        }
                        break;
                    case 5:
                        System.out.println("how much money you want to add enter amount:");
                        double amt = sc.nextDouble();
                        ac.Bal = ac.Bal + amt;
                        break;
                    case 6:
                        System.out.println("how much money you want to withdraw enter amount:");
                        double withdraw_amt = sc.nextDouble();
                        if (ac.Bal > withdraw_amt) {
                            ac.Bal = ac.Bal - withdraw_amt;
                        }

                        break;
                    case 7:
                        System.out.println("7.Sort the above user account on account id");
                        List<Account> al=new ArrayList<>();
                        al.addAll(accounts);
                        Collections.sort(al);
                        accounts.addAll(al);
                        System.out.println(accounts);
                        break;



                    case 8:
                        System.out.println("8.Sort the above user account on account name");
                        Set<Account> account_temp=new TreeSet<>(new NameSort());
                        account_temp.addAll(accounts);
                        System.out.println(accounts);







                }
            }


        }

    }


}
