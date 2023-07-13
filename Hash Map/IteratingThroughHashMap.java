//iterating through hashmap

import java.util.*;

public class IteratingThroughMap {
    public static void main(String args[]) {
        Map<String, Integer> Employee = new HashMap<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the numbers of entry to add");
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            System.out.println("Enter the name of the " + i + " Employee");
            String name = sc.next();
            System.out.println("Enter the age");
            int age = sc.nextInt();

            Employee.put(name, age);

        }
        System.out.println("Iterating over a HashMap ");
        Employee.forEach((name, age) -> { // here foreach take lambda expression as an arguement and iterate through
                                          // every element of the map
            System.out.println(name + " => " + age);
        });

    }
}