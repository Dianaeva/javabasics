package com.yevstignyeyeva.javabasics.arrays.twodimensions;

import java.util.Arrays;

public class MinElementInTwoDimensionArray {
    public static void main(String[] args) {
        // init 2D array
        int array[][] = new int[][]{
                new int[]{3, 2, -5},
                new int[]{4, 8, 1, 1, 1}
        };


        for (int i = 0; i < array.length; i++) {
            System.out.println("");
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
        }

        // invoke getMinElement(array)
        int minElement = getMinElement(array);

        // Print given array and the min element
        System.out.println("Given array " + Arrays.deepToString(array));
        System.out.println("The min element is " + minElement);
    }

    /**
     * Finds the minimal number of elements in source array.
     *
     * @param array is given array
     * @return int minElement is minimal number in array
     */
    private static int getMinElement(int array[][]) {
        int minElement = array[0][0];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] < minElement) {
                    minElement = array[i][j];
                }
            }
        }
        return minElement;
    }
}
