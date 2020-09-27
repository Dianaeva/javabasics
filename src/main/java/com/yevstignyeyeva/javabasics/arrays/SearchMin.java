package com.yevstignyeyeva.javabasics.arrays;

import java.util.Arrays;

public class SearchMin {
    public static void main(String[] args) {
        // Array initialization
        int[] array = new int[]{
                6, 6, 453, 354, 56
        };

        // Find min value
        int min = findMin(array);

        // Print the min value
        System.out.println("Given array: " + Arrays.toString(array));
        System.out.println("Min value is: " + min);
    }

    /**
     * Find minimum number in the array
     *
     * @param array array to find min number
     * @return minimum number from the array
     */
    private static int findMin(int[] array) {
        if (array.length == 0) {
            throw new IllegalArgumentException("Given array is empty");
        }
        int minVal;
        minVal = array[0];
        for (int i = 1; i < array.length; i++) {
            if (minVal > array[i]) {
                minVal = array[i];
            }
        }
        return minVal;
    }
}
