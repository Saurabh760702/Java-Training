package Assignment2;

import java.util.Scanner;

public class NumVariable {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Enter the number: ");
            int num = scanner.nextInt();

            System.out.print("Enter the bit position (0-based index): ");
            int n = scanner.nextInt();

            int bitMask = 1 << n;
            boolean isBitSet = (num & bitMask) != 0;

            if (isBitSet) {
                System.out.println("The " + (n+1) + "th bit of " + num + " is set (1).");
            } else {
                System.out.println("The " + (n+1) + "th bit of " + num + " is not set (0).");
            }

            scanner.close();
        }
    }

