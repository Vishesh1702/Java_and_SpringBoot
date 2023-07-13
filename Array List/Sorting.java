import java.util.*;

class SortArrayList {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n;
        ArrayList<Integer> List = new ArrayList<>();
        System.out.println("Enter the size of an array");
        n = sc.nextInt();
        System.out.println("Enter the elements of an array");
        for (int i = 0; i < n; i++) {
            int num = sc.nextInt();
            List.add(num);
        }
        Collections.sort(List);

        System.out.println("Array List after sorting");
        System.out.println(List);

    }
}