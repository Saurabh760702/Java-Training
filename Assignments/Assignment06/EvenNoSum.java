package Assignment06;

import java.util.ArrayList;
import java.util.Scanner;

public class EvenNoSum {
        public static void main(String[] args) {
            // Create an ArrayList to store integers
            ArrayList<Integer> numbers = new ArrayList<>();

            // Create a Scanner object to read input from the user
            Scanner scanner = new Scanner(System.in);

            // Ask the user for input and add it to the ArrayList
            System.out.println("Enter numbers (enter -1 to finish):");
            int input;
            while (true) {
                input = scanner.nextInt();
                if (input == -1) {
                    break;
                }
                numbers.add(input);
            }

            // Close the Scanner object to prevent resource leak
            scanner.close();

            // Calculate the sum of even numbers
            int sum = 0;
            for (int num : numbers) {
                if (num % 2 == 0) {
                    sum += num;
                }
            }

            // Print the sum of even numbers
            System.out.println("Sum of even numbers: " + sum);
        }
    }
