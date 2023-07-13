//Reversing String

import java.util.*;

class ReverseString {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        StringBuilder a = new StringBuilder(); // String builder is a class like string but it is mutable and it provide
                                               // many functionality to play with string
        System.out.println("Enter the string");
        String string = sc.nextLine();
        a.append(string); // here string value is goig to append in string a

        System.out.println("String before reverse : " + a);

        StringBuilder b = new StringBuilder();
        for (int i = a.length() - 1; i >= 0; i--) {
            b.append(a.charAt(i));
        }
        System.out.println("String After reverse : " + b);
    }
}
