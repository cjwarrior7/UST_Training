package com.company.example1;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class StudLapDemo {
    public static void main(String[] args) {
        Configuration cfg=new Configuration();
        cfg.configure();
        SessionFactory sf=cfg.buildSessionFactory();
        Session ss=sf.openSession();

        //create objects
        Laptop laptop=new Laptop();
        laptop.setLname("DELL");
        StudentTelusko stud=new StudentTelusko();
        stud.setSname("ankur");
        stud.setMarks(50);
        //associate objects
         stud.setLaptop(laptop);
         ss.save(stud);
         ss.save(laptop);



        Transaction tx=ss.beginTransaction();
        tx.commit();
        ss.close();
        sf.close();
    }
}
