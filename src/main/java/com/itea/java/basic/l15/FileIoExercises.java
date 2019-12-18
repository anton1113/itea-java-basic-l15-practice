package com.itea.java.basic.l15;

import java.io.File;
import java.io.FileInputStream;

public class FileIoExercises {

    public static void main(String[] args) throws Exception {

        File file = new File("output.txt");
        System.out.println(file.length());

        FileInputStream fileInputStream = new FileInputStream(file);
        System.out.println(fileInputStream.available());
    }
}
