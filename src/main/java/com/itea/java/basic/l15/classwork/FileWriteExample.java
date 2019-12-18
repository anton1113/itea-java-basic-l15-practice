package com.itea.java.basic.l15.classwork;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;
import java.util.Scanner;

public class FileWriteExample {

    public static void main(String[] args) {
        writeToFile(readLine(System.in), "output123.txt");
    }

    private static String readLine(InputStream inputStream) {
        try {
            byte[] content = new byte[100];
            int bytesWritten = inputStream.read(content);
            return new String(Arrays.copyOf(content, bytesWritten));
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

    private static void writeToFile(String conent, String filePath) {
        try {
            FileOutputStream outputStream = new FileOutputStream(filePath);
            outputStream.write(conent.getBytes());
            outputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
