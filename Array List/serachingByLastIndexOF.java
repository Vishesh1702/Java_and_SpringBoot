
import java.util.*;

public class SearchAnElementInArrayListExample {

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
        System.out.println("Enter the element to be serached");
        int contain = sc.nextInt();
        int lastIndex = List.lastIndexOf(contain);
        if (lastIndex == -1)
            System.out.println("ArrayList does not contain ");
        else
            System.out.println("Last occurrence of serached elemenet in ArrayList is at index :"
                    + lastIndex);

    }
}
