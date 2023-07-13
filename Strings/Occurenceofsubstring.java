//program to count the number of times the substring has occured in the main string

import java.util.*;

public class SubstringCount {
    public static int CountOfOccurence(String Main_str, String Sub_str) {
        if (Main_str.isEmpty() || Sub_str.isEmpty()) {
            return 0;
        }

        int n = Sub_str.length();
        int position = 0;
        int count = 0;
        while (Main_str.indexOf(Sub_str, position) != -1) {
            position = Main_str.indexOf(Sub_str, position) + n; // to find the position og substring in mainstring and
                                                                // increase it by the size of sustring
            count++;
        }
        return count;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the First String");
        String Main_str = sc.nextLine();
        System.out.println("Enter the Second String");
        String Sub_str = sc.nextLine();
        int result = CountOfOccurence(Main_str, Sub_str);
        System.out.println("The " + Main_str + " contain " + Sub_str + result + "times");
    }
}