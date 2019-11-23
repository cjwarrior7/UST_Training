package com.company;

public class Singleton {

    private Singleton() {

    }
    private static Singleton ref=null;
    public static Singleton getObject(){
        if(ref==null){
            ref=new Singleton();
        }
        return ref;
    }
    }
