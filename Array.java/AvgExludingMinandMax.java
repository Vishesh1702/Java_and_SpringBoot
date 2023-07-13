// max and min array

import java.util.*;

public class AverageExcludingMaxAndMin {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int n = sc.nextInt();
        int array[] = new int[n];
        System.out.println("Enter the element of array");
        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
        }
        int max = array[0];
        int min = array[0];

        for (int i = 0; i < n; i++) {
            if (array[i] > max) { // checking if the current value in array is greater than max or not if yes then
                                  // updatinf max value
                max = array[i];
            }
            if (array[i] < min) { // checking if the current value in array is less than min or not if yes then
                                  // updating min value
                min = array[i];
            }
        }
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum = sum + array[i];
        }
        sum = sum - max - min;
        n = n - 2;
        double avg = sum / n;
        System.out.println("Avg of array excluding min and max number is " + avg);

    }
}