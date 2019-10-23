package com.company;

public class BubbleSort {
    public static void main(String[] args) {
        int[] ar = {5, 10, 20, 15, 12};
        for (int i = 0; i < ar.length - 1; i++) {
            for (int j = 0; j < ar.length - 1 - i; j++) {
               if(ar[i]>ar[j]){
                   int temp=ar[i];
                   ar[i]=ar[j];
                   ar[j]=temp;
               }
            }
        }
        /*for (int i:ar) {
            System.out.println(ar[i]);

        }*/
        for (int i = 0; i <ar.length ; i++) {
            System.out.println(ar[i]);
        }
    }
}