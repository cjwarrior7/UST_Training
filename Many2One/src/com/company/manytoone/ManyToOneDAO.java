package com.company.manytoone;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;



public class ManyToOneDAO {
    public static void main(String[] args) {
        Configuration cfg=new Configuration();
        cfg.configure();
        SessionFactory sf=cfg.buildSessionFactory();
        Session ss=sf.openSession();
       CompanyDTO cdto=new CompanyDTO();
       cdto.setCname("UST");
       cdto.setCtype("software company");
       EmpDTO edto1=new EmpDTO();
       edto1.setEname("yogi");
       edto1.setEsal(35000);
       edto1.setCdto(cdto);
       ss.save(edto1);

       Transaction tx=ss.beginTransaction();
        tx.commit();
        ss.close();
        sf.close();
        }

    }

