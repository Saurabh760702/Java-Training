package Assignment03;

import java.util.Scanner;

public class StrongNumberChecker {
        public static int factorial(int n) {
            if (n == 0 || n == 1) {
                return 1;
            }
            return n * factorial(n - 1);
        }
        public static boolean isStrongNumber(int num) {
            int originalNum = num;
            int sum = 0;

            while (num > 0) {
                int digit = num % 10;
                sum += factorial(digit);
                num /= 10;
            }

            return sum == originalNum;
        }

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter a number to check if it's a Strong number: ");
            int num = scanner.nextInt();

            if (isStrongNumber(num)) {
                System.out.println(num + " is a Strong number.");
            } else {
                System.out.println(num + " is not a Strong number.");
            }

            scanner.close();
        }
    }
