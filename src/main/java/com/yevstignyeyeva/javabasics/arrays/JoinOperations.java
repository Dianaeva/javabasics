package com.yevstignyeyeva.javabasics.arrays;

import java.util.Arrays;

public class JoinOperations {

    public static void main(String[] args) {
        // Given arrays
        int[] array1 = new int[] {
                1, 2, 3, 4, 5
        };
        int[] array2 = new int[]{
                4, 5, 6, 7
        };

        // Join operations example
        System.out.println("Given array1: " + Arrays.toString(array1));
        System.out.println("Given array2: " + Arrays.toString(array2));

        addAll(array1, array2, true); // 1, 2, 3, 4, 5, 6, 7, 0, 0
        subtract(array1, array2, true); // 1, 2, 3
        intersection(array1, array2, true); // 4, 5
    }

    private static void addAll(int[] array1, int[] array2, boolean print) {
        // Let result array have array1 + array2 sizes for demo purposes
        int[] result = new int[array1.length + array2.length];
        int m = array1.length;

        for (int i = 0; i < array1.length; i++) {
            result[i] = array1[i];
        }

        for (int j = 0; j < array2.length; j++) {
            boolean wasInArray1 = false;
            for (int y = 0; y < array1.length; y++) {
                if (array2[j] == array1[y]) {
                    wasInArray1 = true;
                }
            }
            if (wasInArray1 == false) {
                result[m] = array2[j];
                m++;
            }
        }

        if (print) {
            System.out.println("\nAdd all");
            System.out.println("Result: " + Arrays.toString(result));
        }
    }

    private static void subtract(int[] array1, int[] array2, boolean print) {
        int[] result = new int[array1.length];
        int m = 0;
        for (int i = 0; i < array1.length; i++) {
            boolean wasInArray = false;
            for (int j = 0; j < array2.length; j++) {
                if (array1[i] == array2[j]) {
                    wasInArray = true;
                }
            }
            if (wasInArray == false) {
                result[m] = array1[i];
                m++;
            }
        }

        if (print) {
            System.out.println("\nExtraction");
            System.out.println("Result: " + Arrays.toString(result));
        }
    }

    private static void intersection(int[] array1, int[] array2, boolean print) {
        int[] result = new int[array1.length];
        boolean wasInArray = false;
        int m = 0;
        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array2.length; j++) {
                if (array1[i] == array2[j]) {
                    wasInArray = true;
                }
            }
            if (wasInArray) {
                result[m] = array1[i];
                m++;
            }
        }

        if (print) {
            System.out.println("\nIntersection");
            System.out.println("Result: " + Arrays.toString(result));
        }
    }
}
