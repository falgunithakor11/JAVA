
import java.util.Scanner;

public class GreatestNumber {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter Three Number : ");
            int x = sc.nextInt();
            int y = sc.nextInt();
            int z = sc.nextInt();
            if(x>y){
                if(x>z){
                    System.out.println("Greatest Number is : "+x);
                }
                else{
                    System.out.println("Greatest Number is : "+z);
                }
            }
            else//(y>x)
            {
                if(y>z){
                    System.out.println("Greatest Number is : "+y);
                }
                else{
                    System.out.println("Greatest Number is : "+z);
                }
            }
        }

    }
}
