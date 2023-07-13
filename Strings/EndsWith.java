//program to check wether string end with another string

import java.util.*;

public class EndsWith {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first String");
        String FirstString = sc.nextLine();
        System.out.println("Enter the second String");
        String SecondString = sc.nextLine();

        if (FirstString.endsWith(SecondString)) {
            System.out.println("True : " + FirstString + " Ends with " + SecondString);
        } else {
            System.out.println("True : " + FirstString + " Ends with " + SecondString);
        }

    }
}