package Assignment09;

import java.util.Scanner;

public class HashMap {




        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            java.util.HashMap<String, String> phoneDirectory = new java.util.HashMap<>();

            // Sample initial data for demonstration
            phoneDirectory.put("saurabh", "7607029798");
            phoneDirectory.put("shivam", "7380741637");
            phoneDirectory.put("John", "1234567890");
            phoneDirectory.put("Alice", "9876543210");

            boolean running = true;
            while (running) {
                System.out.println("\n1. Find Phone Number");
                System.out.println("2. Add/Edit Entry");
                System.out.println("3. Exit");
                System.out.print("Enter your choice: ");
                int choice = scanner.nextInt();
                scanner.nextLine(); // Consume newline

                switch (choice) {
                    case 1:
                        System.out.print("Enter name to find phone number: ");
                        String nameToFind = scanner.nextLine();
                        String phoneNumber = phoneDirectory.get(nameToFind);
                        if (phoneNumber != null) {
                            System.out.println("Phone number for " + nameToFind + ": " + phoneNumber);
                        } else {
                            System.out.println("Phone number not found for " + nameToFind);
                        }
                        break;
                    case 2:
                        System.out.print("Enter name: ");
                        String name = scanner.nextLine();
                        System.out.print("Enter phone number: ");
                        String newPhoneNumber = scanner.nextLine();
                        phoneDirectory.put(name, newPhoneNumber);
                        System.out.println("Entry added/updated successfully.");
                        break;
                    case 3:
                        running = false;
                        System.out.println("Exiting program.");
                        break;
                    default:
                        System.out.println("Invalid choice. Please enter a number between 1 and 3.");
                }
            }
            scanner.close();
        }
    }
