package com.yevstignyeyeva.javabasics.arrays;

import java.util.Arrays;

public class ArraysCopy {
    public static void main(String[] args) {
        // Array initialization
        int[] array = new int[]{
                6, -6, -2_000_000_185, -2_000_000_000, 2_000_000_056
        };

        // Copy array
        int[] copy = new int[array.length];
        copy(array, 0, copy, 0, 4);

        // Print the ask sorted array
        System.out.println("Given array: " + Arrays.toString(array));
        System.out.println("Copied array: " + Arrays.toString(copy));
    }


    /**
     * Copies number of elements from the given position of the source array
     * to the destination array starting from the given destination position
     *
     * @param src source array to copy elements
     * @param srcPos position to start copy from
     * @param dest destination array to copy elements
     * @param destPos position to start copy to
     * @param numberOfElementsToCopy number of elements to copy from src to dest
     */
    private static void copy(
            int[] src,
            int srcPos,
            int[] dest,
            int destPos,
            int numberOfElementsToCopy
    ) {
        // TODO implement the method
    }
}
