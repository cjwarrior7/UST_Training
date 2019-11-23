package com.company;

public class UpperLower {
    public static void main(String[] args) {
        String str="Azam Amir Reza";
        StringBuilder sb=new StringBuilder();
        for (int i = 0; i <str.length() ; i++) {
            if(str.charAt(i)>=65 && str.charAt(i)<90){
                char ch=str.charAt(i);
                ch=(char)(ch+32);
                sb.insert(i,ch) ;
            }
            if(str.charAt(i)>=97 && str.charAt(i)<=122){
                char ch=str.charAt(i);
                ch=(char)(ch-32);
                sb.insert(i,ch) ;
            }
            if(str.charAt(i)==' '){
                sb.insert(i,' ');
            }
        }
        System.out.println(sb);
    }
}
