import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter the number");
            int num = sc.nextInt();
            int count=0;
            for(int i=1; i<=num;i++){
                if(num%i==0){
                    count++;
                }
            }
            if(num==0){
                System.out.println("No Prime Nor Composite");
            }
            else if(count==2){
                System.out.println("Prime Number");
            }
            else{
                System.out.println("not prime");
            }
        }

    }
}
