package com.company;

import java.util.*;

public class MapProb {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("a","apple");
        map.put("b","boy");
        map.put("c","");
        map.put("d","dog");
        map.put("e","elephant");
        map.put("f","fish");
        System.out.println("**************************");
        System.out.println("Updating particular value in Map");
        map.put("a","aeroplane");//overwrite existing key with new value
        map.replace("a","aeroplane");//
        map.replace("a","aeroplane","anaconda");
        System.out.println(map.get("a"));
        System.out.println("**************************");
        System.out.println("Delete particular entry from Map");
        System.out.println(map.remove("e"));
        System.out.println(map.remove("e","elephant"));
        System.out.println("**************************");
        System.out.println("fetch the meaning for particular key");
        System.out.println(map.get("d"));
        System.out.println(map.getOrDefault("c",""));
        System.out.println("**************************");
        System.out.println("Display all the words and its meaning");
        System.out.println("first way");
        Set<String> set=map.keySet();
        for (String
             i:set) {
            System.out.println("key:"+i+" value:"+map.get(i));
        }
        System.out.println("Second way");
         Set set1=map.entrySet();
         Iterator it=set1.iterator();
         while (it.hasNext()){
             Map.Entry me=(Map.Entry)it.next();
             System.out.println("key:"+me.getKey()+" Value:"+me.getValue());
         }




    }
}