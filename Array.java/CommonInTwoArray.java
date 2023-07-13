//find common in two aarays

import java.util.*;

public class CommonInTwoArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of first array");
        int n1 = sc.nextInt();
        String array1[] = new String[n1];
        System.out.println("Enter the element of first array");
        for (int i = 0; i < n1; i++) {
            array1[i] = sc.next();
        }
        System.out.println("Enter the size of second array");
        int n2 = sc.nextInt();
        String array2[] = new String[n2];
        System.out.println("Enter the element of second array");
        for (int i = 0; i < n2; i++) {
            array2[i] = sc.next();
        }

        System.out.println("Array1 : " + Arrays.toString(array1));
        System.out.println("Array2 : " + Arrays.toString(array2));

        HashSet<String> set = new HashSet<String>();

        for (int i = 0; i < n1; i++) {
            for (int j = 0; j < n2; j++) {
                if (array1[i].equals(array2[j])) {
                    set.add(array1[i]);
                }
            }
        }

        System.out.println("Common element : " + set);
    }
}
