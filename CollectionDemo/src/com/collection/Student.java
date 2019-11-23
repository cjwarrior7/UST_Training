package com.collection;

public class Student implements Comparable {
    String name;
    int id;
    int age;
    public Student(String name,int id,int age) {
    this.name=name;
    this.id=id;
    this.age=age;
    }

    @Override
    public int hashCode() {
        return id;
    }

    @Override
    public String toString() {
        return name+" "+id+" " +age;
    }

    @Override
    public int compareTo(Object obj) {
        return this.hashCode()-obj.hashCode();
    }
}
