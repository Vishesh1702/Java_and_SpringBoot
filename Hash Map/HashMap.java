import java.util.HashMap;
import java.util.Map.Entry;

class HashMMap {
    public static void main(String[] args) {

        HashMap<Integer, String> languages = new HashMap<>(); // declaring new hashmap
        languages.put(1, "Java");
        languages.put(2, "Python");
        languages.put(3, "JavaScript");
        System.out.println("HashMap: " + languages);

        System.out.print("Keys: ");
        for (Integer key : languages.keySet()) { // printing all the keys present in hashmap
            System.out.print(key);
            System.out.print(", ");
        }

        System.out.print("\nValues: ");
        for (String value : languages.values()) { // printing all the values present in hashmap
            System.out.print(value);
            System.out.print(", ");
        }

        System.out.print("\nEntries: ");
        for (Entry<Integer, String> entry : languages.entrySet()) { // printing all the key and values present in
                                                                    // hashmap
            System.out.print(entry);
            System.out.print(", ");
        }
    }
}