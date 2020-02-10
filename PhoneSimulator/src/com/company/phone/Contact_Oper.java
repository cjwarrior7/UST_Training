package com.company.phone;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.List;
import java.util.Scanner;

public class Contact_Oper {
    public static void mainmenu(Session ss) {


        Scanner sc = new Scanner(System.in);

        System.out.println("1.SHOW ALL CONTACTS");
        System.out.println("2.SEARCH FOR CONTACT");
        System.out.println("3.OPERATE ON CONTACT");

        System.out.println("ENTER VALID OPTION");

        int options = sc.nextInt();
        switch (options) {
            case 1:
                Contact_Oper.showallcon(ss);
                break;
            case 2:
                Contact_Oper.searchcontact(ss);

                break;
            case 3:
                Contact_Oper.operateoncontact(ss);
                break;

                default:
                System.out.println("INVALID");
        }

    }
    public static void showallcon(Session ss){
        Scanner sc = new Scanner(System.in);
        Query query = ss.createQuery("from Contact");
        List<Contact> list = query.list();
        for (Contact i : list) {
            System.out.println(i.getName() + i.getNumber() + i.getPhGroup());
        }




    }
    public static void searchcontact(Session ss){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter contact name to search");
        String name=sc.next();
        Query query = ss.createQuery("from Contact where Name=:name");
        query.setParameter("name", name);
        List<Contact> list = query.list();
        if(list.isEmpty()){
            System.out.println("NO CONTACTS FOUND ");
            mainmenu(ss);
        }
        for (Contact ele : list) {
            System.out.println(ele.getName() + ele.getNumber() + ele.getPhGroup());


        }
        System.out.println("ENTER VALID OPTION");


        System.out.println("1.TO CALL");
        System.out.println("2.TO MESSAGE");
        System.out.println("3.MAIN MENU");

        int options = sc.nextInt();
        switch (options) {
            case 1:
                Contact_Oper.calluser(ss,name);
                break;
            case 2:
                Contact_Oper.messageuser(ss);

                break;
            case 3:
                Contact_Oper.mainmenu(ss);
                break;

            default:
                System.out.println("INVALID");
        }

    }
    public static void operateoncontact(Session ss){
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER VALID OPTION");


        System.out.println("1.ADD CONTACT");
        System.out.println("2.DELETE CONTACT");
        System.out.println("3.EDIT CONTACT");

        int options = sc.nextInt();
        switch (options) {
            case 1:
                Contact_Oper.addcontact(ss);
                break;
            case 2:
                Contact_Oper.deletecontact(ss);

                break;
            case 3:
                Contact_Oper.editcontact(ss);
                break;

            default:
                System.out.println("INVALID");
        }


    }
    public static void calluser(Session ss,String name){
        Scanner sc = new Scanner(System.in);
        System.out.println("********calling*********");
        System.out.println(name);
        System.out.println("ENTER O TO END CALL");
        int options=  sc.nextInt();
        if (options==0){
            mainmenu(ss);

        }




    }
    public static void messageuser(Session ss){
        Scanner sc = new Scanner(System.in);

        System.out.println("ENTER MESSAGE:");

        String Message=sc.nextLine();
        System.out.println("********sending message*********");



    }
    public static void addcontact(Session ss){
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER NAME TO ADD");
        String name=sc.next();
        System.out.println("ENTER NUMBER TO ADD");
        Long number=sc.nextLong();
        System.out.println("ENTER GROUP TO ADD");
        String phgroup=sc.next();
        Contact dto = new Contact();
        dto.setName(name);
        dto.setNumber(number);
        dto.setPhGroup(phgroup);
        ss.save(dto);
        Transaction tx = ss.beginTransaction();
        tx.commit();
        System.out.println("****contact added successfully*****");


    }
    public static void deletecontact(Session ss){
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER NAME TO DELETE");
        String name=sc.next();
        Query query = ss.createQuery("delete from Contact where Name=:name");
        query.setParameter("name", name);
        int deleted = query.executeUpdate();
        System.out.println("Deleted: " + deleted + " contact");
        Transaction tx = ss.beginTransaction();
        tx.commit();


    }
    public static void editcontact(Session ss){
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER NAME TO WHOSE CONTACT TO UPDATE");
        String name=sc.next();
        System.out.println("ENTER NUMBER TO UPDATE");
        Long number=sc.nextLong();
        Query query = ss.createQuery("Update From Contact set  Number=:number where Name=:name");
        query.setParameter("number", number);
        query.setParameter("name", name);

        int updated = query.executeUpdate();
        System.out.println("Updated: " + updated + " contact");
        Transaction tx = ss.beginTransaction();
        tx.commit();


    }






}
