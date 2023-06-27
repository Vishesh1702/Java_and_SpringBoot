//Cloning Hashmap

import java.util.*;

public class CloneMap {
    public static void main(String args[]) {
        HashMap<Integer, String> hash_map = new HashMap<Integer, String>(); // declaring new hashmap
        hash_map.put(1, "Red"); // adding elements in hashmapp by put method
        hash_map.put(2, "Green");
        hash_map.put(3, "Black");
        hash_map.put(4, "White");
        hash_map.put(5, "Blue");
        // printing map
        System.out.println("The Original map: " + hash_map);
        HashMap<Integer, String> new_hash_map = new HashMap<Integer, String>();
        new_hash_map = (HashMap) hash_map.clone(); // cloning map usiing clone method
        System.out.println("Cloned map: " + new_hash_map);
    }
}
