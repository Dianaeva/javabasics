package com.yevstignyeyeva.javabasics.arrays;

import java.util.Arrays;

public class JoinOperations {

    public static void main(String[] args) {
        // Given arrays
        int[] array1 = new int[] {
                1, 2, 3, 4, 5
        };
        int[] array2 = new int[] {
                4, 5, 6, 7
        };

        // Join operations example
        System.out.println("Given array1: " + Arrays.toString(array1));
        System.out.println("Given array2: " + Arrays.toString(array2));

        addAll(array1, array2, true);
        substract(array1, array2, true);
        intersection(array1, array2, true);
    }

    private static void addAll(int[] array1, int[] array2, boolean print) {
        // Let result array have array1 + array2 sizes for demo purposes
        int[] result = new int[array1.length + array2.length];

        // TODO implement add all

        if (print) {
            System.out.println("\nAdd all");
            System.out.println("Result: " + Arrays.toString(result));
        }
    }

    private static void substract(int[] array1, int[] array2, boolean print) {
        int[] result = new int[array1.length];

        // TODO implement substraction

        if (print) {
            System.out.println("\nExtraction");
            System.out.println("Result: " + Arrays.toString(result));
        }
    }

    private static void intersection(int[] array1, int[] array2, boolean print) {
        int[] result = new int[array1.length];

        // TODO implement intersection

        if (print) {
            System.out.println("\nIntersection");
            System.out.println("Result: " + Arrays.toString(result));
        }
    }
}
