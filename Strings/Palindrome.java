// check that the given string is palindrome

import java.util.*;

class Palindrome {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Word");
        String word = sc.nextLine();
        StringBuilder R = new StringBuilder(word);
        R.reverse();
        String Rword = R.toString();

        if (word.equals(Rword)) {
            System.out.println("This Word is palindrome");
        } else {
            System.out.println("This Word is not palindrome");
        }

    }
}