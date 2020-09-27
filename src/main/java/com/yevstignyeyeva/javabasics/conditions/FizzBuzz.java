package com.yevstignyeyeva.javabasics.conditions;

public class FizzBuzz {
    public static void main(String[] args) {
        for (int i = 1; i <= 15; i++) {
            fizzBuzz(i, true);
        }
    }

    /**
     * If the number multiplies 3 return "Fizz"
     * If the number multiplies 5 return "Buzz"
     * If the number multiplies both 3 and 5 return "FizzBuzz"
     * If nothing of this the number returns
     *
     * @param i     - number to select output string
     * @param print - if true the returned value is printed on the console.out
     * @return Fizz, Buzz or FizzBuzz depending on param i
     */
    private static String fizzBuzz(int i, boolean print) {

        // Determine return value
        String returnValue;
        if ((i % 3 == 0) && (i % 5 == 0)) {
            returnValue = "FizzBuzz";
        } else if (i % 3 == 0) {
            returnValue = "Fizz";
        } else if (i % 5 == 0) {
            returnValue = "Buzz";
        } else {
            returnValue = String.valueOf(i);
        }

        // Print if needed
        if (print) {
            System.out.println(returnValue);
        }

        return returnValue;
    }
}
