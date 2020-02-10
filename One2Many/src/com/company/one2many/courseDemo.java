package com.company.one2many;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class courseDemo {
    public static void main(String[] args) {
        Configuration cfg = new Configuration();
        cfg.configure();
        SessionFactory sf = cfg.buildSessionFactory();
        Session ss = sf.openSession();
        //get instructor from db
        int id=1;
        Instructor instructor=ss.get(Instructor.class,id);

        //create some courses
        Courses courses=new Courses();
        courses.setCname("singing");
        Courses courses1=new Courses();
        courses1.setCname("Music");
        //add courses to instructor
        instructor.add(courses);
        instructor.add(courses1);
        //save the courses
        ss.save(courses);
        ss.save(courses1);

        Transaction tx = ss.beginTransaction();
        tx.commit();
        ss.close();
        sf.close();
    }
}
