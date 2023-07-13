// Count the number of words ending in 'm' or 'n' (not case sensitive) in a given text

import java.util.*;

class NumberOfMandNInEnd {
    public static int EndsWithMorN(String Line) {
        int len = Line.length();
        int count = 0;
        Line = Line.toLowerCase();
        for (int i = 0; i < len; i++) {
            if (Line.charAt(i) == 'm' || Line.charAt(i) == 'n') {
                if (i < len - 1 && !Character.isLetter(Line.charAt(i + 1))) { // CHaracter is class and isLetter
                                                                              // function is use to check wether the
                                                                              // value is character or not.here we used
                                                                              // ! to see wether it is an end of word or
                                                                              // not.
                    count++;
                } else if (i == len - 1) {
                    count++;
                }
            }
        }
        return count;
    }

    public static void main(String args[]) {
        NumberOfMandNInEnd N = new NumberOfMandNInEnd();
        String Line;
        System.out.println("Enter the Statement : ");
        Scanner sc = new Scanner(System.in);
        Line = sc.nextLine();
        System.out.println("The Statement is: " + Line);
        System.out.println("Number of time M and N appeard in the end of every word: " + N.EndsWithMorN(Line));

    }
}
