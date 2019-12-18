package com.itea.java.basic.l15;

import java.io.File;

public class FileExample {

    public static void main(String[] args) {

        File file = new File("C:\\Users\\anton\\IdeaProjects\\l15-practice");

        System.out.println(file.getAbsolutePath());
        printFile(file, "|");

        file.listFiles();
    }

    private static void printFile(File file, String prefix) {
        System.out.println(prefix + " " + file.getName());
        File[] files = file.listFiles();
        if (files != null) {
            for (File f : files) {
                printFile(f, prefix + "-");
            }
        }
    }
}
