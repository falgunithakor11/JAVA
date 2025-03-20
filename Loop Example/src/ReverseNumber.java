import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter the number");
            int num = sc.nextInt();
            int rem;
            int revers = 0;
            while(num!=0){
                rem = num%10;
                revers = revers*10 + rem;
                num = num/10;
            }
            System.out.println("Reversed Number is : "+revers);
        }
    }
    
}