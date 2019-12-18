package com.itea.java.basic.l15.classwork;

import java.io.File;

public class FileExample {

    public static void main(String[] args) {

        File file = new File("src\\main\\java\\com\\itea\\java\\basic\\l15\\classwork\\");
//
//        System.out.println(file.exists());
//        System.out.println(file.isDirectory());

        File rootDirectory = new File("C:/Users/anton/IdeaProjects/l15-practice");
//        System.out.println(rootDirectory.getName());

        printRecursive(rootDirectory, "");
    }

    private static void printRecursive(File file, String prefix) {
        if (!file.exists()) {
            return;
        }
        System.out.println(prefix + file.getName());
        File[] files = file.listFiles();
        // if file is not directory - files array will be null
        if (files != null) {
            for (File currentDirectoryFile : files) {
                printRecursive(currentDirectoryFile, prefix + " - ");
            }
        }
    }
}
