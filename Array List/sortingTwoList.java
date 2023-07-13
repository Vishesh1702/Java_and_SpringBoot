// Java program to merge elements of A with B by maintaining the sorted order i.e. fill A with first m smallest elements and fill B with remaining elements.

import java.util.*;

public class SortingTwoArray {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> List = new ArrayList<>();
        System.out.println("Enter the size of first array");
        int n = sc.nextInt();
        int array1[] = new int[n];
        System.out.println("Enter the elements of first array");
        for (int i = 0; i < n; i++) {
            array1[i] = sc.nextInt();
            List.add(array1[i]);
        }
        System.out.println("Enter the size of second array");
        int m = sc.nextInt();
        int array2[] = new int[m];
        System.out.println("Enter the elements of second array");
        for (int i = 0; i < m; i++) {
            array2[i] = sc.nextInt();
            List.add(array2[i]);
        }

        Collections.sort(List);
        int l = List.size();
        List<Integer> subList = new ArrayList<>(List.subList(n, l)); // here we creating copy of sublist of list because
                                                                     // later on we are deleting sublist from list so if
                                                                     // we create sublist direclty it will throw the
                                                                     // exception i.e ConcurrentModificationException

        List.removeAll(subList);

        System.out.println(List);
        System.out.println(subList);
    }
}
