package Assignment08;

public class HashMap {
        public static void main(String[] args) {
            HashMap hashMap = new HashMap();

            hashMap.put("One", 1);
            hashMap.put("Two", 2);
            hashMap.put("Three", 3);

            System.out.println("HashMap before adding a new key-value pair: " + hashMap);

            String newKey = "Four";
            int newValue = 4;
            hashMap.put(newKey, newValue);


            System.out.println("HashMap after adding a new key-value pair: " + hashMap);
        }

    private void put(String one, int i) {
    }
}

