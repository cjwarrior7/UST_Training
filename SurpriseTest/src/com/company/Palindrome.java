package com.company;

import java.util.Scanner;

public class Palindrome {
    public static void checkpali(int num){

    }
    public static void main(String[] args) {
        //Scanner sc=new Scanner(System.in);
        //int num=sc.nextInt();
       // checkpali(num);
        String str="Jspider and Qspider ";
        StringBuilder sb=new StringBuilder();
        int counter=0;
        for (int i = 0; i <str.length() ; i++) {
            if(str.charAt(i)==' '){
                sb.insert(i,counter);
                counter=0;
            }

            else{
                sb.insert(i,str.charAt(i));
                counter++;
            }
        }
       String S=new String(sb);
        System.out.println(sb);

    }
}
