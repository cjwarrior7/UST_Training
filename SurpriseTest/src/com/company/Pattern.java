package com.company;

public class Pattern {
    public static void main(String[] args) {
        char ch='A';int rows=4;int col=0;
        for (int i = 0; i <rows ; i++) {
            char ch1=ch;
            for (int j = 0; j <=col ; j++) {

                System.out.print(ch1--);

            }
            System.out.println();
            col++;
            ch++;
        }
    }
}
