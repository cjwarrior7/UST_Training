package com.company;

public class Student {
    int id;
    String name;

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public void detai(){
        System.out.println(this.id);
        System.out.println(this.name);
    }


    @Override public int hashCode() {
        return id;
    }

    @Override
    public boolean equals(Object obj) {
        return this.hashCode()==obj.hashCode();
    }

    @Override
    public String toString() {
        return "Student id:"+id+" Student Name:"+name;
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("the object is dereffered and it is collected by garbage collector");
    }
}
