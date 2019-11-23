package com.company;

public class Replace1 {
    public static void main(String[] args) {
        String str="azam";
        StringBuilder sb=new StringBuilder();
        int count=0;
        for (int i = 0; i <str.length(); i++) {

            if(str.charAt(i)=='a'){
                sb.insert(count,'*');
                count++;
                sb.insert(count,'*');
                count++;
            }
            else{
                sb.insert(count,str.charAt(i));
                count++;
            }

        }
        System.out.println(sb);
    }
}
