// Finding the difference of elements in two set

import java.util.*;

class DifferenceOfSet {
    public static void main(String[] args) {
        HashSet<Integer> Set1 = new HashSet<>();
        System.out.println("Enter the number of elements you want to add in set1");
        int n1 = sc.nextInt();
        System.out.println("Enter the 5 elements of set1");
        for (int i = 0; i < n1; i++) {
            int x = sc.nextInt();
            Set1.add(x);

        }
        System.out.println("HashSet1: " + Set1);

        HashSet<Integer> Set2 = new HashSet<>();
        System.out.println("Enter the number of elements you want to add in set2");
        int n2 = sc.nextInt();
        System.out.println("Enter the 5 elements of set2");
        for (int i = 0; i < n2; i++) {
            int x = sc.nextInt();
            Set2.add(x);

        }
        System.out.println("HashSet2: " + Set2);
        if (n1 > n2) {
            Set1.removeAll(Set2); // removing all the element of set2 from set1
            System.out.println("Difference : " + Set1);
        } else if (n1 < n2) {
            Set2.removeAll(Set1);
            System.out.println("Difference : " + Set2);
        }

    }
}
