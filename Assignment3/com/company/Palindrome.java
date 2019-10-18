package com.company;

import java.util.Scanner;

public class Palindrome {
    public static void palindrome(int numb){
        int original_num=numb;
        int result=0;
        while(numb>0){
            int rem=numb%10;
            numb=numb/10;
            result=result*10+rem;
        }
        if(result==original_num){
            System.out.println("number is palindrome");
        }
        else{
            System.out.println("not a palindrome");
        }



    }
    public static void main(String[] args) {
        System.out.println("Enter the number whose palindrome to find");
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        palindrome(num);




    }

}
