//Gender 	Year of Service 	Qualifications 	Salary
// Male 	>= 10 	Post - Graduate 	15000 .
//         >= 10 	Graduate 	        10000 .
//         < 10 	Post - Graduate 	10000 .
//         < 10 	Graduate 	        7000 .
// Female 	>= 10 	Post - Graduate 	12000
//         >= 10 	Graduate 	        9000
//         < 10 	Post - Graduate 	10000 .
//         < 10 	Graduate 	        6000 

import java.util.*;

class Salary {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String Male = "M";
        String Female = "F";
        String PostGraduate = "PG";
        String Graduate = "G";
        int Exp;

        System.out.print("Enter Your Gender (M:Male | F:Female): ");
        String Gen = s.next().toUpperCase(); // converting the input into uppercase by using toUpperCase method
        System.out.print("Enter Your Experience In Years (YY) ");
        Exp = s.nextInt();
        System.out.print("Enter Your Education Status  (PG:Post Graduate | G:Graduate): ");
        String Edc = s.next().toUpperCase();

        // Checking conditions and giving the salary amount

        if (Gen.equals(Male) && Edc.equals(PostGraduate) && Exp >= 10) { // eqauls method is used to compare the srings
                                                                         // if it is equal if return true else false
            System.out.println("Your Salary is 15000/-");
        } else if (Gen.equals(Male) && Edc.equals(PostGraduate) && Exp < 10
                || Gen.equals(Female) && Edc.equals(PostGraduate) && Exp < 10
                || Gen.equals(Male) && Edc.equals(Graduate) && Exp >= 10) {
            System.out.println("Your Salary is 10000/-");
        } else if (Gen.equals(Male) && Edc.equals(PostGraduate) && Exp < 10) {
            System.out.println("Your Salary is 7000/-");
        } else if (Gen.equals(Female) && Edc.equals(PostGraduate) && Exp >= 10) {
            System.out.println("Your Salary is 12000/-");
        } else if (Gen.equals(Female) && Edc.equals(Graduate) && Exp >= 10) {
            System.out.println("Your Salary is 9000/-");
        } else if (Gen.equals(Female) && Edc.equals(Graduate) && Exp < 10) {
            System.out.println("Your Salary is 6000/-");
        }

    }
}