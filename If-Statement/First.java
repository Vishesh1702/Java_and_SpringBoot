
// Find max betweeen 3 number
import java.util.*;

class Max_Number {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int x = sc.nextInt();
        System.out.print("Enter the second number: ");
        int y = sc.nextInt();
        System.out.print("Enter the third number: ");
        int z = sc.nextInt();

        if (x > y && x > z) { // cheking condition that if x>y and x>z if both the condtion is true then it
                              // will print the statement or it will move forward
            System.out.println(x + " : is the greater nummber");
        } else if (y > z && y > x) {
            System.out.println(y + " : is the greater number");
        } else
            System.out.println(z + " : is the greater number");

    }
}