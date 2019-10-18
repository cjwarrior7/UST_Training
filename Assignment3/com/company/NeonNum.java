package com.company;

import java.util.Scanner;

public class NeonNum {
    public static void neonnum(int numb){
     int square_numb=numb*numb;
     int result=0;
     while(square_numb>0){
        int  rem=square_numb%10;
        square_numb=square_numb/10;
        result=result+rem;
     }
     if(result==numb){
         System.out.println("It is neon number");
     }
     else{
         System.out.println("not a neon number");
     }
    }
    public static void main(String[] args) {
        System.out.println("Enter the number whose to check neon number find");
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        neonnum(num);
    }
}
