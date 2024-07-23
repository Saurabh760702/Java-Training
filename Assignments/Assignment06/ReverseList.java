package Assignment06;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ReverseList {
        public static void main(String[] args) {
            List<String> stringList = new ArrayList<>();
            stringList.add("Hello");
            stringList.add("World");
            stringList.add("Java");
            stringList.add("Programming");

            System.out.println("Original List: " + stringList);

            Collections.reverse(stringList);

            System.out.println("Reversed List: " + stringList);
        }
    }

