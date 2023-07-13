//printing all the number divisible by n

import java.util.*;

public class DivisibleByN {
    public static void main(String args[]) {
        int n;
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> List = new ArrayList<>();
        System.out.println("Enter the size of an array");
        n = sc.nextInt();
        System.out.println("Enter the elemenst of an array");
        for (int i = 0; i < n; i++) {
            int num = sc.nextInt();
            List.add(num);
        }
        System.out.println("Enter the number which divide the number from the list completely");
        int Div = sc.nextInt();
        System.out.println("Number divisible by " + Div + " in the list is:");
        Iterator<Integer> iterator = List.iterator();
        while (iterator.hasNext()) {
            int number = iterator.next();
            if (number % Div != 0) {
                iterator.remove();
            }
        }
        System.out.print(List);
    }
}
