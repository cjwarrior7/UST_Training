package com.company.spring;

public class MyBean {
    String id;
    String name;
    void m1(){
        System.out.println("my bean object m1() executed");
        System.out.println(name);
        System.out.println(id);

    }

    public MyBean(String id, String name) {
        this.id = id;
        this.name = name;
    }
    //    public String getId() {
//        return id;
//    }
//
//    public void setId(String id) {
//        this.id = id;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
}
