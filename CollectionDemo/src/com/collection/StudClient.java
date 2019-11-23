package com.collection;

import java.util.Collection;

import java.util.TreeSet;

public class StudClient {
    public static void main(String[] args) {
        Collection c1 = new TreeSet(new DescWise());
        Student s1 = new Student("modi ji", 123, 67);
        Student s2 = new Student("kejriwal ji", 124, 50);
        Student s3 = new Student("Pappu ji", 125 , 50);
        c1.add(s1);
        c1.add(s2);
        c1.add(s3);
        System.out.println("size:"+c1.size());
        System.out.println("Element are:");
        for (Object obj:c1
             ) {
            System.out.println(obj);
        }

    }
}