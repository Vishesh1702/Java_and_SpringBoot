//Program to check the string contains all number.

import java.util.*;
import java.util.regex.Pattern;

public class AllNumber {

    public static void main(String args[]) {

        // Regular expression in Java to check if String is a number or not
        Pattern pattern = Pattern.compile(".*[^0-9].*"); // pattern is a class for searching and manipulating strings.
                                                         // in this it will check that the string contain any character
                                                         // which is not a digit.
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int size = sc.nextInt();
        sc.nextLine();

        String[] inputs = new String[size];

        for (int i = 0; i < size; i++) {
            inputs[i] = sc.nextLine();
        }

        for (String input : inputs) {
            System.out.println("does " + input + " is number : "
                    + !pattern.matcher(input).matches()); // int this we are matching each character that it contains
                                                          // numbers or not.
        }

    }

}