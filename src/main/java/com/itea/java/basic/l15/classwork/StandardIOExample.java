package com.itea.java.basic.l15.classwork;

import java.io.IOException;

public class StandardIOExample {

    public static void main(String[] args) {

        try {
            int b = System.in.read();
            System.out.write(b);
            System.out.flush();
        } catch (Exception e) {
            //
        }

        byte[] bytes = new byte[10];
        try {
            int byteReceived = System.in.read(bytes);
            System.out.println("Bytes received " + byteReceived);
            System.out.write(bytes);
            System.out.flush();
        } catch (IOException e) {
            //
        }

        System.out.write(0);
        System.out.flush();

        System.out.println("\nWow");
    }
}
