package com.company;

import java.util.Scanner;

public class Armstrong {
    public static void armnum(int numb){
        int orig_numb=numb;
        int result=0;
        while(numb>0){
            int  rem=numb%10;
            numb=numb/10;
            result=result+rem*rem*rem;
        }
        if(result==orig_numb){
            System.out.println("It is Armstrong number");
        }
        else{
            System.out.println("Not a Armstrong number");
        }
    }

    public static void main(String[] args) {
        System.out.println("Enter the number whose to check Armstrong number find");
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        armnum(num);
    }
}
