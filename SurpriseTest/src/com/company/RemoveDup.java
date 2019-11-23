package com.company;

import java.util.Scanner;

public class RemoveDup {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String string=scanner.nextLine();

        StringBuilder stringBuilder=new StringBuilder(string);


        for (int i = 0; i <stringBuilder.length(); i++) {
            for (int j = i+1; j < stringBuilder.length(); j++) {

                if(stringBuilder.charAt(i)==stringBuilder.charAt(j)){
                    stringBuilder.deleteCharAt(j);
                }

            }
        }
        System.out.println(stringBuilder);
    }
}
