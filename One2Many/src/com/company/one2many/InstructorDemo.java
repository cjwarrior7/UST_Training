package com.company.one2many;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class InstructorDemo {
    public static void main(String[] args) {
        Configuration cfg = new Configuration();
        cfg.configure();
        SessionFactory sf = cfg.buildSessionFactory();
        Session ss = sf.openSession();
        Instructor instructor = new Instructor();
        //create objects
        instructor.setin_email("rati@gmail.com");
        instructor.setin_name("rati");
        InstructorDetail instructorDetail = new InstructorDetail();
        instructorDetail.setGender("female");
        //associate the objects
        instructor.setInstructorDetail(instructorDetail);
        //save the student
        ss.save(instructor);
        Transaction tx = ss.beginTransaction();
        tx.commit();
        ss.close();
        sf.close();
    }
}
