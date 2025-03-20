
import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter The Year");
          int year = sc.nextInt();
            if( year%400==0 && (year%44!=0 || year%100==0 )){
                System.out.println("Leap Year");
            }
            else{
                System.out.println("NOT Leap Year");
            }
        }
    }
}
