package com.company;

public class Replace {
    public static void main(String[] args) {
        String str = "Jspider and Qspider";
        StringBuilder sb = new StringBuilder();
        int counter = 0;
        int sp = 0;
        for (int i = 0; i < str.length(); i++, sp++) {
            if (str.charAt(i) == ' ') {
                sb.insert(sp, counter);
                sp++;
                sb.insert(sp, ' ');
                counter = 0;

            } else {
                sb.insert(sp, str.charAt(i));
                counter++;

            }
        }
        sb.append(counter);

        System.out.println(sb);
    }
}
