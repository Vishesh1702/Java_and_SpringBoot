
//Program to return sum of arrays element
import java.util.*;

class sum {
    public static void main(String[] args) {
        int sum = 0;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number of elements");
        int n = s.nextInt();
        int array[] = new int[n];
        System.out.println("Enter the elements of array");
        for (int i = 0; i < n; i++) {
            array[i] = s.nextInt();
        }

        for (int i = 0; i < n; i++) {
            sum = sum + array[i];
        }
        System.out.println("Sum of array is: " + sum);
    }

}