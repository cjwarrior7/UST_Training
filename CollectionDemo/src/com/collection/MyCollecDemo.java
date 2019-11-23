package com.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class MyCollecDemo {
    public static void main(String[] args) {

        System.out.println("Creating first Collection");
        Collection c1 = new ArrayList();
        System.out.println("see the code before jdk 1.5 we do like this converting primitives into objects");
        Integer i=new Integer(10);
        c1.add(i);
        Double d=new Double(20);
        c1.add(d);
        System.out.println("see the code after jdk 1.5 there is concept of autoboxing therefore we don't have to add primitives like earlier");
        c1.add(30);
        c1.add(40);
        System.out.println("***********************");
        System.out.println("Creating second Collection");
        Collection c2=new ArrayList();
        c2.add(110);
        c2.add(120);
        System.out.println("C2 size:"+c2.size());
        c2.addAll(c1);
        System.out.println("C2 size:"+c2.size());

       Iterator it=c2.iterator();
       while (it.hasNext()){
           Object obj=it.next();
           System.out.println(obj);

       }
        for (Object ele :c2
             ) {
            System.out.println(ele);

        }
        System.out.println("After remove");
        c2.remove(i);
        System.out.println("C2 size:"+c2.size());
        for (Object ele :c2
        ) {
            System.out.println(ele);

        }
        c2.retainAll(c1);
        System.out.println("C2 size:"+c2.size());
        System.out.println("After retain all");
        for (Object ele :c2
        ) {
            System.out.println(ele);

        }
        c2.removeAll(c1);
        c2.add(110);

        System.out.println("C2 size:"+c2.size());
        System.out.println("After remove all");
        for (Object ele :c2
        ) {
            System.out.println(ele);

        }
        System.out.println(c1.equals(c2));
        System.out.println("converting collection to object array");
        Object[] arr=c2.toArray();
        for (int j = 0; j <arr.length;j++){
            System.out.println(arr[j]);
        }
    }
}