import java.util.*;

class SortHashMap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        HashMap<String, Integer> map = new HashMap<>();

        System.out.println("How many entries do you want to enter?");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {

            System.out.println("Enter a key (string) and a value (integer):");
            String key = sc.next();
            int value = sc.nextInt();

            map.put(key, value);
        }

        TreeMap<String, Integer> sorted = new TreeMap<>(map); // we created trremap because it store the value in sorted
                                                              // order

        System.out.println("The sorted map is: ");
        System.out.println(sorted.toString());
    }
}
