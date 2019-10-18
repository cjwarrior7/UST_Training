package com.company;

public class PerfectNumb {
    public static void perfect(int number){
     int i=1;
     int result=0;
     while(i<=number/2){
       if(number%i==0) {
           result=result+i;
       }
       i++;
     }
     if(result==number){
         System.out.println("perfect number");
     }
    }
    public static void main(String[] args) {

        for (int i = 1; i <100
                ; i++) {
            System.out.println(i);
            perfect(i);
        }
    }

}
