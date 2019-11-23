package com.collection;

import java.util.Comparator;

public class DescWise implements Comparator{

    @Override
    public int compare(Object obj1, Object obj2) {
        Student s1= (Student)obj1;
        Student s2= (Student)obj2;
        return -(s1.age-s2.age);
    }
}
