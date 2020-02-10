package com.company.one2one;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class StudentDemo {
    public static void main(String[] args) {
        Configuration cfg=new Configuration();
        cfg.configure();
        SessionFactory sf=cfg.buildSessionFactory();
        Session ss=sf.openSession();
        Student stud=new Student();
        //create objects
        stud.setEmail("abc@gmail.com");
        stud.setSname("abc");
        StudentDetail studentDetail=new StudentDetail();
        studentDetail.setGender("Male");
        //associate the objects
        stud.setStudentDetail(studentDetail);
        //save the student
        ss.save(stud);
        Transaction tx=ss.beginTransaction();
        tx.commit();
        ss.close();
        sf.close();



    }
}
