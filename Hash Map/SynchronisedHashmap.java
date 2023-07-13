import java.util.*;

class SynchronizedHashMap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        HashMap<String, Integer> map = new HashMap<>();

        Map<String, Integer> syncMap = Collections.synchronizedMap(map); // create a synchronized map using the
                                                                         // Collections.synchronizedMap() method

        System.out.println("How many entries do you want to enter?");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.println("Enter a key (string) and a value (integer):");
            String key = sc.next();
            int value = sc.nextInt();

            syncMap.put(key, value); // put the key-value pair into the synchronized map

        }

        System.out.println("The synchronized map is: ");
        System.out.println(syncMap.toString()); // print the synchronized map using toString() method
    }
}
