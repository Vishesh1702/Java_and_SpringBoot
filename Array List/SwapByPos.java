
import java.util.*;

public class SwapElementByPos {

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
        System.out.println("Enter the first element position to be swapped");
        int FirstEle = sc.nextInt();
        System.out.println("Enter the Second element position to be swapped");
        int SecondEle = sc.nextInt();
        System.out.println("Before swaping, ArrayList contains : " + List);

        Collections.swap(List, FirstEle, SecondEle); // swap function to swap the elements here (the list , first
                                                     // element pos to be swapped,Second element pos)

        System.out.println("After swaping, ArrayList contains : " + List);

    }
}
