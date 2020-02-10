package com.company.ess;

import java.util.Scanner;

public class Employee {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER VALID OPTION");
        System.out.println("1.TO REGISTER");
        System.out.println("2.TO LOGIN");

        int options = sc.nextInt();
        switch (options) {
            case 1:
                Employee_Oper.register();
                break;
            case 2:
                Employee_Oper.login();
                break;

            default:
                System.out.println("INVALID");
        }


    }

}
