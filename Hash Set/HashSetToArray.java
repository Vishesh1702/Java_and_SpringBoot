//program to convert HashSet to Array

import java.util.*;

public class HashSetToArray {
    public static void main(String[] args) {
        HashSet<String> h_set = new HashSet<String>(); // creating new set name h_set
        h_set.add("Red"); // adding elements into set
        h_set.add("Green");
        h_set.add("Black");
        h_set.add("White");
        h_set.add("Pink");
        h_set.add("Yellow");
        System.out.println("Original Hash Set: " + h_set);
        // Creating an Array
        String[] new_array = new String[h_set.size()];
        h_set.toArray(new_array); // converting hashset h_set into array new_array by using toArray method

        // Displaying Array elements
        System.out.println("Array elements: ");
        for (String element : new_array) {
            System.out.println(element);
        }
    }
}
