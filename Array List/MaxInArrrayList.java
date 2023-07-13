
import java.util.*;

public class FindMaximumOfArrayList {

    public static void main(String[] args) {

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

        Object obj = Collections.max(List);

        System.out.println("Maximum Element of Java ArrayList is : " + obj);
    }
}
