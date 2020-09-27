package com.yevstignyeyeva.javabasics.arrays;

import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        // Array initialization
        int[] array = new int[]{
                6, -6, -2_000_000_185, -2_000_000_000, 2_000_000_056
        };

        // Asc sort array
        int[] sortedAsc = mergeSortAsc(array);

        // Print the ask sorted array
        System.out.println("Given array: " + Arrays.toString(array));
        System.out.println("Sorted Asc: " + Arrays.toString(sortedAsc));
    }

    /**
     * Sorts given array using merge sort algorithm
     *
     * @param array array to sort
     * @return sorted copy of array
     */
    private static int[] mergeSortAsc(int[] array) {
        int[] copy = new int[array.length];
        System.arraycopy(array, 0, copy, 0, array.length);

        // TODO implement usnig https://www.educative.io/edpresso/how-to-implement-a-merge-sort-in-java
        // or any other related article

        return copy;
    }
}
