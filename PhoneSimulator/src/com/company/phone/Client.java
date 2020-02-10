package com.company.phone;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Client {
    public static void main(String[] args) {
        Configuration cfg=new Configuration();
        cfg.configure();
        SessionFactory sf=cfg.buildSessionFactory();
        Session ss=sf.openSession();


//        Contact dto=new Contact();
//        dto.setName("advin");
//        dto.setNumber(9810198103L);
//        dto.setPhGroup("UST");
//        ss.save(dto);
//        ss.beginTransaction().commit();


        System.out.println("*********************CONTACT******************************");
        Contact_Oper.mainmenu(ss);
        ss.close();
        sf.close();
    }
    }

