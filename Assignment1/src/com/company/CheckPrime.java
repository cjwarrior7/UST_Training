package com.company;

import java.util.Scanner;

public class CheckPrime {
    public static boolean isPrime(int num) {
        if (num > 1) {
            boolean flag = true;
            for (int i = 2; i < num; i++) {
                if (num % i == 0) {
                    flag = false;
                    break;

                }

            }
            if (flag == true) {
                return true;
            }

        }
        else{
            System.out.println("Not valid number");
        }
        return false;
    }

        public static void main (String[]args){
            Scanner sc = new Scanner(System.in);
            int checkprime = sc.nextInt();
            System.out.println(isPrime(checkprime));
        }
    }
