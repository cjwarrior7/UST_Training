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
        StudentTelusko studenttelusko=new StudentTelusko();
        studenttelusko.setSname("ankur");
        studenttelusko.setMarks(50);
        //associate objects

         studenttelusko.getLaptop().add(laptop);
         laptop.setStudent(studenttelusko);
         ss.save(laptop);
         ss.save(studenttelusko);



        Transaction tx=ss.beginTransaction();
        tx.commit();
        ss.close();
        sf.close();
    }
}
