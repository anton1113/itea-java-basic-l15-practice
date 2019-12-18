package com.itea.java.basic.l15;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.stream.Collectors;

public class BufferedReaderExample {

    public static void main(String[] args) throws Exception {

        BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream("output.txt")));
        StringBuilder stringBuilder = new StringBuilder();
        boolean nextLineExists = true;
        while (nextLineExists) {
            String currentLine = reader.readLine();
            if (currentLine != null) {
                stringBuilder.append(currentLine).append("\n");
            } else {
                nextLineExists = false;
            }
        }
        System.out.println(stringBuilder.toString());
    }
}
