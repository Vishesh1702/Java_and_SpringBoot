//program to replace given key and value

import java.util.*;

public class Replace {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashMap<String, Integer> map = new HashMap<String, String>();

        for (int i = 0; i < n; i++) { // for loop to read n entries from the user and store them in the map
            System.out.println("Enter a key (string) and a value (integer):");
            String key = sc.next();
            int value = sc.nextInt();

            map.put(key, value); // put the key-value pair into the map
        }
        System.out.println("HashMap Before Replace :");

        Set<Entry<String, Integer>> keyValueSet = map.entrySet();

        for (Entry<String, Integer> entry : keyValueSet) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }

        System.out.println("Enter the key and value you have to replace");
        String Nkey = sc.next();
        int Nvalue = sc.nextInt();

        map.replace(Nkey, Nvalue);

        System.out.println("HashMap After Replace :");

        for (Entry<String, String> entry : keyValueSet) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }
}