package Assignment08;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class HashCricketScoreTracker {
        public static void main(String[] args) {
            Map<String, Integer> scoreMap = new HashMap<>();

            scoreMap.put("Sachin Tendulkar", 100);
            scoreMap.put("Virat Kohli", 150);
            scoreMap.put("Rohit Sharma", 50);
            scoreMap.put("akhli", 1020);
            scoreMap.put("ram ", 1250);
            scoreMap.put("sivam", 550);

            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter the batsman's name: ");
            String batsmanName = scanner.nextLine();

            Integer score = scoreMap.get(batsmanName);

            if (score != null) {
                System.out.println(batsmanName + "'s score is: " + score);
            } else {
                System.out.println("Score not found for " + batsmanName);
            }
        }
    }
