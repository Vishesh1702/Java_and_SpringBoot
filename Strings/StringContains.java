package Strings;

public class StringContains {
    public static void main(String args[]) {
        String str = "what do you know about me";
        System.out.println(str.contains("do you know")); // checking that string str contain the particular word in it
                                                         // by using conatains function
        System.out.println(str.contains("about"));
        System.out.println(str.contains("hello"));
    }
}
