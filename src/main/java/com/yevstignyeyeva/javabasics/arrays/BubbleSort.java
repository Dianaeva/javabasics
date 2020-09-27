package com.yevstignyeyeva.javabasics.arrays;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        // Array initialization
        int[] array = new int[]{
                6, -6, -2_000_000_185, -2_000_000_000, 2_000_000_056
        };

        // Asc sort array
        int[] sortedAsc = sortAsc(array);

        // Print the ask sorted array
        System.out.println("Given array: " + Arrays.toString(array));
        System.out.println("Sorted Asc: " + Arrays.toString(sortedAsc));
    }

    /**
     * Asc sort the array
     *
     * @param array array to sort in ascending order
     * @return sortedin ascending order array
     */
    private static int[] sortAsc(int[] array) {
        if (array.length == 0) {
            throw new IllegalArgumentException("Given array is empty");
        }

        // Copy array
        int[] arrayCopy = new int[array.length];
        System.arraycopy(array, 0, arrayCopy, 0, array.length);

        // Sort the copy
        int aux = 0;
        for (int i = 0; i < arrayCopy.length; i++) {
            for (int k = i + 1; k < arrayCopy.length; k++) {
                if (arrayCopy[i] > arrayCopy[k]) {
                    aux = arrayCopy[i];
                    arrayCopy[i] = arrayCopy[k];
                    arrayCopy[k] = aux;
                }
            }
        }
        return arrayCopy;
    }
}
