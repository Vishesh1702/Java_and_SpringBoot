import java.util.*;

public class PutIfAbsent {
    public static void main(String[] args) {
        // Creating a HashMap
        Map<String, Integer> numberMapping = new HashMap<>();

        // Adding key-value pairs to a HashMap
        numberMapping.put("One", 1);
        numberMapping.put("Two", 2);
        numberMapping.put("Three", 3);

        numberMapping.putIfAbsent("Four", 4); // Add a new key-value pair only if the key does not exist in the HashMap

        System.out.println(numberMapping);
    }
}