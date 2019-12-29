package com.company.shop;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Product_infoDAO {
	public static void main(String[] args) {
		
	
	Configuration cfg=new Configuration();
	cfg.configure();
	SessionFactory sf=cfg.buildSessionFactory();
	Session ss=sf.openSession();
	Scanner sc=new Scanner(System.in);
	
	//Product_info dto=new Product_info();
	//dto.setProduct_Name("Recliner");
//	dto.setProduct_Cost(20000);
//	dto.setNumber_ofProducts(5);
//	dto.setProduct_Color("BLACK");
//	dto.setDescription("new Recliner chair ");

	//ss.save(dto);
	//ss.beginTransaction().commit();
	System.out.println("*********************PRODUCT INSERTED******************************");
    ProductOper.mainmenu(ss);
	ss.close();
	sf.close();
	
	
	
	
}
}
