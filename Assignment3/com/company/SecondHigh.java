package com.company;

public class SecondHigh {
    public static void main(String[] args) {
        int[] ar={5,10,15,20,12,20};
        int max=ar[0];
        int second=0;
        for (int i = 1; i <ar.length ; i++) {
            if(ar[i]>max){
                second=max;
                max=ar[i];
            }
            else if(second<ar[i] && ar[i]!=max){
                second=ar[i];
            }
        }

        System.out.println(second);
    }
}
