package Assignment09;

import java.util.Scanner;
import java.util.TreeMap;

public class SecondQ {



        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            TreeMap<String, Integer> treeMap = new TreeMap<>();

            // Sample initial data for demonstration
            treeMap.put("Rohit", 20);
            treeMap.put("Akil", 23);
            treeMap.put("Rahul", 15);

            treeMap.put("John", 25);
            treeMap.put("Alice", 30);
            treeMap.put("Bob", 35);

            System.out.print("Enter name to search for: ");
            String name = scanner.nextLine();

            Integer age = treeMap.get(name);
            if (age != null) {
                System.out.println("Age of " + name + " is " + age);
            } else {
                System.out.println("Name " + name + " not found.");
            }

            scanner.close();
        }
    }



