package com.company.bill;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;


import java.util.List;
import java.util.Scanner;

public class Hotel_Oper {
    public static void mainmenu(Session ss) {


        Scanner sc = new Scanner(System.in);

        System.out.println("1.SHOW ITEMS");
        System.out.println("2.TAKE ORDER");
        System.out.println("3.OPERATE ITEMS ONLY FOR MANAGER");
        System.out.println("4.BILL PRINT");
        System.out.println("ENTER VALID OPTION");
        int[] user_item_code = new int[4];
        int[] user_item_quan = new int[4];
        int options = sc.nextInt();
        switch (options) {
            case 1:
                Hotel_Oper.showitem(ss);
                break;
            case 2:
                Hotel_Oper.takeorder(ss, user_item_code, user_item_quan);

                break;
            case 3:
                Hotel_Oper.operateonitem(ss);
                break;
            case 4:

                Hotel_Oper.totalbill(ss, user_item_code, user_item_quan);
                break;

            default:
                System.out.println("INVALID");
        }

    }

    public static void showitem(Session ss) {
        Scanner sc = new Scanner(System.in);
        Query query = ss.createQuery("from Hotel_Bill");
        List<Hotel_Bill> list = query.list();
        for (Hotel_Bill i : list) {
            System.out.println(i.getItem_Code() + i.getFood_Name() + i.getPrice());
        }
        System.out.println("PRESS 1 TO BACK TO MAIN MENU");
        int inp = sc.nextInt();
        if (inp == 1) {
            mainmenu(ss);
        } else {
            System.out.println("ENTER VALID OPTION");
            showitem(ss);
        }


    }

    public static void takeorder(Session ss, int[] user_item_code, int[] user_item_quan) {
        Scanner sc = new Scanner(System.in);
        //int[] user_item_code=new int[4];
        //int[] user_item_quan=new int[4];
        int i = 0;
        while (i < 4) {
            System.out.println("ENTER THE ITEM CODE");
            user_item_code[i] = sc.nextInt();
            System.out.println("ENTER THE QUANTITY");
            user_item_quan[i] = sc.nextInt();
            System.out.println("ENTER 0 TO EXIT 1 TO ADD MORE");
            int option = sc.nextInt();
            if (option == 0) {
                totalbill(ss, user_item_code, user_item_quan);
                break;
            }
            i++;
            System.out.println("*****ADD MORE ITEM*******");
        }
        if (i==4){
            totalbill(ss,user_item_code,user_item_quan);
        }


    }

    public static void operateonitem(Session ss) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER VALID OPTION");
        System.out.println("PRESS A TO ADD FOOD ITEM");
        System.out.println("PRESS B TO REMOVE FOOD ITEM");
        System.out.println("PRESS C TO MODIFY FOOD ITEM");
        char c = sc.next().charAt(0);
        switch (c) {
            case 'A':
                Hotel_Oper.addfooditem(ss);
                break;
            case 'B':
                Hotel_Oper.removefooditem(ss);
                break;
            case 'C':
                Hotel_Oper.modifyfooditem(ss);
                break;

            default:
                System.out.println("INVALID");
        }

    }

    public static void totalbill(Session ss, int[] user_item_code, int[] item_quantity) {
        double amt_pay = 0;

        for (int i = 0; i < user_item_code.length; i++) {
            Query query = ss.createQuery("from Hotel_Bill where Item_Code=:id");
            query.setParameter("id", user_item_code[i]);
            List<Hotel_Bill> list = query.list();
            System.out.println("list:"+list);
            if(list.isEmpty()){
                System.out.println("PLEASE GIVE ORDER FIRST ");
                break;
            }
            for (Hotel_Bill ele : list) {
                System.out.println(ele.getItem_Code() + ele.getFood_Name() + ele.getPrice());
                amt_pay = amt_pay + item_quantity[i] * ele.getPrice();
            }


        }
        System.out.println("*************************PLEASE PAY :" + amt_pay+"*********************************");


    }

    public static void addfooditem(Session ss) {
        Scanner sc = new Scanner(System.in);
        System.out.println("HOW MANY NEW ITEM YOU ADD IN MENU");
        int noitem = sc.nextInt();

        double[] user_item_price = new double[noitem];
        String[] user_item_name = new String[noitem];
        int i = 0;
        while (i < noitem) {
            System.out.println("ENTER THE ITEM NAME TO ADD");
            user_item_name[i] = sc.next();
            System.out.println("ENTER THE PRICE");
            user_item_price[i] = sc.nextDouble();
            Hotel_Bill dto = new Hotel_Bill();
            dto.setFood_Name(user_item_name[i]);
            dto.setPrice(user_item_price[i]);
            ss.save(dto);
            Transaction tx = ss.beginTransaction();
            tx.commit();
            i++;

        }
        mainmenu(ss);

    }

    public static void removefooditem(Session ss) {
        Scanner sc = new Scanner(System.in);
        System.out.println("HOW MANY NEW ITEM YOU REMOVE  IN MENU");
        int noitem = sc.nextInt();
        String[] user_item_name = new String[noitem];
        int i = 0;
        while (i < noitem) {
            System.out.println("ENTER THE ITEM NAME TO REMOVE");
            user_item_name[i] = sc.next();
            Query query = ss.createQuery("delete from Hotel_Bill where Food_Name=:Food_Name");
            query.setParameter("Food_Name", user_item_name[i]);
            int deleted = query.executeUpdate();
            System.out.println("Deleted: " + deleted + " user");
            Transaction tx = ss.beginTransaction();
            tx.commit();

            i++;

        }
        mainmenu(ss);


    }

    public static void modifyfooditem(Session ss) {
        Scanner sc = new Scanner(System.in);
        String user_item_name;
        double price;
        System.out.println("WANT TO UPDATE PRICE PRESS 1 OR ITEM NAME PRESS 2");
        int option = sc.nextInt();
        if (option == 1) {
            System.out.println("ENTER THE FOOD ITEM NAME ");
            user_item_name = sc.next();

            System.out.println("ENTER THE FOOD ITEM PRICE TO CHANGE");
            price = sc.nextDouble();

            Query query = ss.createQuery("Update From Hotel_Bill set  Price=:Price where Food_Name=:Food_Name  Price=:Price");
            query.setParameter("Price", price);
            query.setParameter("Food_Name", user_item_name);

            int updated = query.executeUpdate();
            System.out.println("Updated: " + updated + " item");
            Transaction tx = ss.beginTransaction();
            tx.commit();
            mainmenu(ss);


        } else if (option == 2) {
            System.out.println("ENTER THE FOOD ITEM NAME TO CHANGE");
            user_item_name = sc.next();
            System.out.println("ENTER ID OF ITEM WHOSE NAME TO UPDATE");
            int id=sc.nextInt();
            Query query = ss.createQuery("Update From Hotel_Bill set Food_Name=:name where Item_Code=:id ");
            query.setParameter("name", user_item_name);
            query.setParameter("id",id);

            int updated = query.executeUpdate();
            System.out.println("Updated: " + updated + " user");
            Transaction tx = ss.beginTransaction();
            tx.commit();
            mainmenu(ss);

        } else {
            System.out.println("INVALID INPUT");
            mainmenu(ss);
        }
    }
}

