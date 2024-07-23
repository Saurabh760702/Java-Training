package Assigment05;

public class ArrayIndex {
        public static void main(String[] args) {
            // Create an array with 5 elements
            int[] numbers = {1, 2, 3, 4, 5};

            try {
                // Access elements beyond the array length
                for (int i = 0; i <= numbers.length; i++) {
                    System.out.println(numbers[i]);
                }
            } catch (ArrayIndexOutOfBoundsException e) {
                // Handle the exception
                System.out.println("ArrayIndexOutOfBoundsException occurred: " + e.getMessage());
            }
        }
    }

