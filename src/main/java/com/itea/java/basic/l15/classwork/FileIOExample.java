package com.itea.java.basic.l15.classwork;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class FileIOExample {

    public static void main(String[] args) {
        printFileSize("test-file.txt");
        printFileSize2("test-file.txt");

        printFile("test-file.txt");
    }

    private static void printFile(String filePath) {
        try {
            FileInputStream fileInputStream = new FileInputStream(filePath);
            int size = fileInputStream.available();
            byte[] content = new byte[size];
            fileInputStream.read(content);
            System.out.println(new String(content));
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    private static void printFileSize(String filepath) {
        try {
            FileInputStream fileInputStream = new FileInputStream(filepath);
            System.out.println(fileInputStream.available());
        } catch (Exception e) {
            System.err.println("Exception " + e.getMessage());
        }
    }

    private static void printFileSize2(String filepath) {
        File file = new File(filepath);
        System.out.println(file.length());
    }
}
