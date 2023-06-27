import java.util.*;
// Java program to count the number of occurrences of any character on String.

public class CountCharacters {

    public static void main(String args[]) {
        System.out.println("Enter the string");
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();

        System.out.println("Enter the charater to count the occurence");
        char character = sc.next().charAt(0);

        int charCount = 0; // character count
        for (char ch : input.toCharArray()) { // traversing each character
            if (ch == character) { // comaparing each character with the character to be count
                charCount++;
            }
        }
        System.out.println("count of character " + character + " on String: " + input + " is " + charCount);
    }

}