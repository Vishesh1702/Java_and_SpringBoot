//Remove duplicate characters from a given string presents in another given string

import java.util.*;

class RemoveDuplicate {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the 1st String:");
        String str1 = sc.nextLine();
        System.out.println("Enter the 2st String");
        String str2 = sc.nextLine();

        char arr[] = new char[256];
        for (int i = 0; i < str2.length(); i++) {
            arr[str2.charAt(i)]++;

        }

        for (int i = 0; i < str1.length(); i++) {
            if (arr[str1.charAt(i)] == 0) {
                System.out.print(str1.charAt(i));
            }
        }   ``

    }
}