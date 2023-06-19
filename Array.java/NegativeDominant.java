//Write a Java program that checks whether an array is negative dominant or not. 

import java.util.*;

public class NegativeDominant {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements in array");
        int n = sc.nextInt();
        int array[] = new int[n];
        System.out.println("Enter the Elements of array(both +ve and -ve)");
        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
        }

        int negative = 0;
        int positive = 0;
        for (int i = 0; i < n; i++) {
            if (array[i] >= 0) {
                positive++;
            } else
                negative++;
        }
        if (negative > positive) {
            System.out.println("Array is Negative Dominant");
        } else if (negative < positive) {
            System.out.println("Array is Positive Dominant");
        } else
            System.out.println("Array is Neutral");
    }
}
