import java.util.Scanner;

public class PrimeMethod2 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter the number");
            int num = sc.nextInt();
            int flag =0;
            int div=2;
            while(div*div<=num-1){
                if(num%div==0){
                    flag =1;
                    break;
                }else{
                    div++;  
                }
               

            }
            if(flag==1){
                System.out.println(" NOt Prime Number");
            }
            else{
                System.out.println("prime number");
            }

        }
    }
}
