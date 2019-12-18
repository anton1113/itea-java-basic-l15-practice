package com.itea.java.basic.l15;

import java.io.FileOutputStream;

public class FileOutputStreamExample {

    public static void main(String[] args) throws Exception {

        FileOutputStream fileOutputStream = new FileOutputStream("output.txt");
        String textToWrite = "Example output text";
        byte[] bytesToWrite = textToWrite.getBytes();
        fileOutputStream.write(bytesToWrite);
        fileOutputStream.close();
    }
}
