package com.yevstignyeyeva.javabasics.arrays;

import java.util.Arrays;

public class MaxModuleElement {
    public static void main(String[] args) {
        // Array initialization
        int[] array = new int[]{
                6, -6, -2_000_000_185, -2_000_000_000, 2_000_000_056
        };

        // Find max module value
        int maxModule = findMaxModule(array);

        // Print the min value
        System.out.println("Given array: " + Arrays.toString(array));
        System.out.println("Max module value is: " + maxModule);
    }

    /**
     * Find maximum module number in the array
     *
     * @param array array to find max module number
     * @return max module number from the array
     */
    private static int findMaxModule(int[] array) {
        if (array.length == 0) {
            throw new IllegalArgumentException("Given array is empty");
        }
        int maxModuleVal = array[0];
        ;
        long maxSquareVal = array[0] * array[0];
        ;
        for (int i = 1; i < array.length; i++) {
            long currElementSquare = (long) array[i] * array[i];
            if (maxSquareVal < currElementSquare) {
                maxModuleVal = array[i];
                maxSquareVal = currElementSquare;
            }
        }
        return maxModuleVal;
    }
}
