package com.company;

import java.util.Collection;
import java.util.LinkedHashSet;

public class Prob {
    public static void main(String[] args) {
        String[] str = {"Azam ", "Amir", "Reza", "Amir", "Azam"};
        int counteruni = 0;
        int counterdup = 0;

        Collection c2 = new LinkedHashSet();
        for (int i = 0; i < str.length; i++) {
            boolean check = c2.add(str[i]);
            if (check) {
                if (counteruni < 1) {
                    System.out.println("Unique:");
                    counteruni++;

                }
                System.out.println(str[i]);

            } else {
                if (counterdup < 1) {
                    System.out.println("Duplicate:");
                    counterdup++;
                }


                System.out.println(str[i]);
            }
        }


    }


}


