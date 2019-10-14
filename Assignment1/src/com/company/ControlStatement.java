package com.company;

import java.util.Scanner;

public class ControlStatement {
    public static void main(String[] args) {
        System.out.println("Enter your Graduation percentage");
        Scanner sc = new Scanner(System.in);
        float percent = sc.nextFloat();
        if (percent >= 60) {
            System.out.println("Enter your Aptitude marks");
            int apti_marks = sc.nextInt();
            if (apti_marks >= 50) {
                System.out.println("Enter your Technical marks");
                int tech_marks = sc.nextInt();
                if (tech_marks >= 50) {
                    System.out.println("eligible for HR round");
                    char grade_alloted = '\0';
                    if (tech_marks >= 60 && tech_marks < 70) {
                        System.out.println("You are shortlisted for grade C");
                        grade_alloted = 'C';

                    } else if (tech_marks >= 70 && tech_marks < 80) {
                        System.out.println("You are shortlisted for grade B");
                        grade_alloted = 'B';
                    } else if (tech_marks >= 80 && tech_marks < 90) {
                        System.out.println("You are shortilisted for grade A");
                        grade_alloted = 'A';
                    } else if (tech_marks >= 90) {
                        System.out.println("You have exceptionally well skills you appointed as full stackoverflow developer");

                    } else {
                        System.out.println("Sit on bench for 3 months and make yourself technically sound then grade will be allocated again");
                        grade_alloted = 'D';
                    }

                    switch (grade_alloted) {
                        case 'A':
                            System.out.println("Congratulation you Appointed as developer");
                            break;
                        case 'B':
                            System.out.println("Congratulation you Appointed as Test Engg");
                            break;
                        case 'C':
                            System.out.println("Congratulation you Appointed as Tech Support");
                            break;
                        case 'D':
                            System.out.println("Congratulation you are shortlisted but you have to prepare for technical evaluation and grade allocation again");
                            break;
                        default:
                            System.out.println("Congratulations full stackoverflow developer CTC is 12LPA");
                    }
                } else {
                    System.out.println("Try after 3 Months");
                }
            } else {
                System.out.println("Try after 6 Months");
            }
        } else {
            System.out.println("soory you are not eligible");
        }


    }
}


