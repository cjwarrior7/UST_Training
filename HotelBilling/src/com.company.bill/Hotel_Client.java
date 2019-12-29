package com.company.bill;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.Scanner;

public class Hotel_Client {
    public static void main(String[] args) {
        Configuration cfg=new Configuration();
        cfg.configure();
        SessionFactory sf=cfg.buildSessionFactory();
        Session ss=sf.openSession();

//
//        Hotel_Bill dto=new Hotel_Bill();
//        dto.setFood_Name("DOSA");
//        dto.setPrice(30);
//        ss.save(dto);
//        ss.beginTransaction().commit();
//
//        Hotel_Bill dto1=new Hotel_Bill();
//       	dto1.setFood_Name("CHOLE BHATURE");
//        dto1.setPrice(30);
//        ss.save(dto1);
//        ss.beginTransaction().commit();
//
//        Hotel_Bill dto2=new Hotel_Bill();
//        dto2.setFood_Name("SAMOSA");
//        dto2.setPrice(10);
//
//        ss.save(dto2);
//        ss.beginTransaction().commit();
//
//        Hotel_Bill dto3=new Hotel_Bill();
//        dto3.setFood_Name("BREAD PAKODA");
//        dto3.setPrice(15);
//        ss.save(dto3);
//        ss.beginTransaction().commit();

        System.out.println("*********************PRODUCT INSERTED******************************");
        Hotel_Oper.mainmenu(ss);
        ss.close();
        sf.close();
    }
}
