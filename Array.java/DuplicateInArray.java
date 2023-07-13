// Duplicate value array

import java.util.*;

public class Duplicate {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int n = sc.nextInt();
        int array[] = new int[n];
        System.out.println("Enter the element of array");
        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if ((array[i] == array[j]) && (i != j)) {
                    System.out.println("Duplicate Element : " + array[j]);
                }
            }
        }
    }
}