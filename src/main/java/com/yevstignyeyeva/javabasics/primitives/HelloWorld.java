package com.yevstignyeyeva.javabasics.primitives;

public class HelloWorld {
    public static void main(String[] args) {

        // The primitives
        byte b = 87;    // 8 bit -128 to 127
        short s = 2_000; // 16 bit -32768 to 32767
        int i = -3_000;  // 32 bit -2_147_483_648 to 2_147_483_647
        long l = 1_088_888L;// 64 bit
        float flo = 4F;  // 32 bit
        double dou = 123.4567;
        boolean f = false;
        char ch = '=';
        System.out.println(flo);

        // Operators
        long l1 = 10L;
        long l2 = 3L;

        System.out.println("Add: " + (l1 + l2));
        System.out.println("Subtract: " + (l1 - l2));
        System.out.println("Divide: " + (l1 / l2));
        System.out.println("Multiply: " + (l1 * l2));
        System.out.println("Remainder: " + (l1 % l2));
        System.out.println("Is odd?: " + ((l1 % 2) == 1));
        // TODO Bite wise and other operators will be provided soon

        // Overflow example
        int sum = 2_000_000_000 + 900_000_000;
        System.out.println("Overflow Int example: " + sum);
    }
}
