package com.company;

public class RemoveDupWord {
    public static void main(String[] args) {
        String str = "I am not a great programmer I am just good programmer with great habits";
        String[] splited = str.split("\\s+");
        for (int i = 0; i < splited.length ; i++) {
            if (splited[i] != null) {
                for (int j = i+1; j < splited.length; j++) {
                    if (splited[i].equals(splited[j])) {
                        splited[j] = null;
                    }


                }
            }
        }
        for (String i:splited
             )
        if(i!=null){
            System.out.println(i);
        }
        }
    }


