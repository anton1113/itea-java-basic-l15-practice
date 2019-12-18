package com.itea.java.basic.l15;

import java.io.IOException;

public class InputStreamExample {

    public static void main(String[] args) throws IOException {
        int b = System.in.read();
        System.out.write(b);
        System.out.close();
    }
}
