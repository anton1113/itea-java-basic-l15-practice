package com.itea.java.basic.l15;

import java.io.File;
import java.io.FileInputStream;

public class FileInputStreamExample {

    public static void main(String[] args) throws Exception {

        FileInputStream fileInputStream = new FileInputStream("file-example.txt");
        int streamSize = fileInputStream.available();
        byte[] bytes = new byte[streamSize];
        int bytesReadCount = fileInputStream.read(bytes);
        System.out.println(bytesReadCount);
    }
}
