package com.company.stud;

import java.util.Scanner;

public class Clientlogin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = 0;
        while (i < 100){
            System.out.println("Enter your name");
        String sname = sc.next();
        System.out.println("Enter your id");
        int id = sc.nextInt();
        Student stud = new Student(sname, id);
        try {
            stud.validate();
        } catch (Exception e) {
            e.printStackTrace();
        }
        if (id==1 || id==3 || id==4){
            break;
        }
     i++;
    }

    }
}
