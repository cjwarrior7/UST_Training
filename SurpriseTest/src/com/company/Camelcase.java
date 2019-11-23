package com.company;

public class Camelcase {
    public static void main(String[] args) {
        String str="azam amir reza";
        char[] arr=str.toCharArray();
        for (int i = 0; i <arr.length; i++) {
            if(arr[i]==' '){
                char ch=arr[i+1];
                ch=(char)(ch-32);
                arr[i+1]=ch;
            }

        }
        if(arr[0]!='\0'){
            char ch=arr[0];
            ch=(char)(ch-32);
            arr[0]=ch;

        }

        System.out.println(arr);
    }
}
