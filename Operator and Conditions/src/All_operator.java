
import java.util.Scanner;

public class All_operator {

    @SuppressWarnings("unused")
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter Two Number");
            double x = sc.nextInt();
            double y = sc.nextInt();
            System.out.println("a + b = "+(x+y));
            System.out.println("a - b = "+(x-y));
            System.out.println("a * b = "+(x*y));
            System.out.println("a / b = "+(x/y));
            // in Java (9/2) is 4 [(9.0/2) or (9/2.0) or (9.0/2.0)] = 4.5
            int a=7,b=11;
            System.out.println("a is "+a +" and b is "+b);
            System.out.println(a==b);
            System.err.println(a>b);
            // && Operator
            System.out.println((5>3) && (8>3));
            System.out.println((5>3) && (8<3));
            // || operator
            System.out.println((5>3) || (8>3));
            System.out.println((5>3) || (8<3));
            System.out.println((5<3) || (8<3));
            //! operator
            System.out.println(!(5==3));
            System.out.println(!(5>3));
            //Increment DEcrement Operator
            //declare variable
            int m = 12, n=12 ;
            int result1, result2;
            //Orignal Values
            System.out.println("Value of a: "+a);
            System.out.println("Value of b is: "+b);
            //increment operator
            result1 = a++;
            System.out.println("After Increment: "+result1);
            System.out.println("Value of b is: "+b);
            //decrement operator
            result2 = --b;
            System.out.println("After decremnet: "+result2);
            }     
    }

}
