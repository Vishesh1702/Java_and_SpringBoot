
//in this program we will be capitalizing every first letter of th given statement
import java.util.*;

class CapitalizedFirstChar {
    public static void main(String args[]) {
        System.out.println("Enter the string");
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        StringBuilder string = new StringBuilder();
        string.append(a);

        if (string.charAt(0) >= 97 && string.charAt(0) <= 122) {
            int b = (int) string.charAt(0) - 32;
            string.setCharAt(0, (char) b); // setCharAt function is used to put the given char at the mentioned position
        }

        for (int i = 1; i < string.length(); i++) {
            if (string.charAt(i) == 32) {
                i++;
                if (string.charAt(i) >= 97 && string.charAt(i) <= 122) {
                    int b = (int) string.charAt(i) - 32;
                    string.setCharAt(i, (char) b);
                }
            } else {
                if (string.charAt(i) >= 65 && string.charAt(i) <= 90) {
                    int b = (int) string.charAt(i) + 32;
                    string.setCharAt(i, (char) b);
                }
            }
        }
        System.out.println("Before: " + a);
        System.out.println("After: " + string);
    }
}