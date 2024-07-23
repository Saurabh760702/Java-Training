package Assignment2;

import java.util.Scanner;

public class greater {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter the first number: ");
            double num1 = scanner.nextDouble();

            System.out.print("Enter the second number: ");
            double num2 = scanner.nextDouble();
            double maxNum = (num1 > num2) ? num1 : num2;

            System.out.println("The maximum number is: " + maxNum);

            scanner.close();
        }
    }

