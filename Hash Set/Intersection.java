//printing the common value between two set using retainAll method

import java.util.*;

class intersection {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        HashSet<Integer> Set1 = new HashSet<>();
        System.out.println("Enter the 5 elements os set1");
        for (int i = 0; i < 5; i++) {
            int x = sc.nextInt();
            Set1.add(x);

        }
        System.out.println("HashSet1: " + Set1);

        HashSet<Integer> Set2 = new HashSet<>();
        System.out.println("Enter the 5 elements os set2");
        for (int i = 0; i < 5; i++) {
            int x = sc.nextInt();
            Set2.add(x);

        }
        System.out.println("HashSet2: " + Set2);

        Set2.retainAll(Set1); // Intersection of two sets
        System.out.println("Intersection is: " + Set2);
    }
}
