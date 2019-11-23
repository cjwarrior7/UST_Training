package com.company;

import java.io.File;

public class FileHandling {
    public static File createDirectory(String path){
        File directory=new File(path);
        if(directory.exists()){
            System.err.println("Directory already exist");
            String ab_path=directory.getAbsolutePath();
            System.out.println("Absolute Path:"+ab_path);

        }
        else{ directory.mkdirs();
            System.out.println("Directory created successfully");
        }
      return  directory;
    }

    public static void main(String[] args) {

        File directory_ref=FileHandling.createDirectory("test/subtest");
        System.out.println("Name:"+directory_ref.getName());

    }
}
