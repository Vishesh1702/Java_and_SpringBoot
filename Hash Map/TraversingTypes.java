import java.util.*;

class HashMapInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        HashMap<String, Integer> map = new HashMap<>();

        System.out.println("How many entries do you want to enter?");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) { // for loop to read n entries from the user and store them in the map
            System.out.println("Enter a key (string) and a value (integer):");
            String key = sc.next();
            int value = sc.nextInt();

            map.put(key, value); // put the key-value pair into the map
        }

        // print the map using one of the methods

        // Method 1: using toString() method
        System.out.println("The map using toString() method is: ");
        System.out.println(map.toString());

        // Method 2: using forEach() method
        System.out.println("The map using forEach() method is: ");
        map.forEach((k, v) -> System.out.println(k + " : " + v));

        // Method 3: using entrySet() method
        System.out.println("The map using entrySet() method is: ");
        for (HashMap.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }
}
