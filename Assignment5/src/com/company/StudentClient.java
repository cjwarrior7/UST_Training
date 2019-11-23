package com.company;

public class StudentClient {
    public static void main(String[] args) {
        Student stud1=new Student(1,"suresh");
        Student stud2=new Student(1,"suresh");
        System.out.println(stud1.hashCode());
        System.out.println(stud2.hashCode());
        System.out.println(stud1.equals(stud2));
        System.out.println(stud1.toString());
        System.out.println(stud2.toString());
        stud1=null;
        System.gc();
        stud2=null;
    }
}
