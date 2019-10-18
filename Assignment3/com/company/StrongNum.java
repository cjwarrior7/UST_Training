package com.company;

import java.util.Scanner;

public class StrongNum {
    public static  void strongNum(int numb){
        int original_numb=numb;
        int result=0;
        while(numb>0){
            int rem=numb%10;
            numb=numb/10;
            int factorial=fact(rem);
            result=result+factorial;

        };
        if(result==original_numb){
            System.out.println("strong number");
        }
        else{
            System.out.println("not a strong number");
        }
    }

    public static int fact(int num){
            if(num==0){
                return 1;
            }
            return num * fact(num-1);


        }







    public static void main(String[] args) {
        System.out.println("Enter the number whose to check strong number find");
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        strongNum(num);
    }
}
