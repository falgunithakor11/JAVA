import java.util.Scanner;

public class Loop1 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter the Number:");
            int n = sc.nextInt();
            int sum=0;
            for (int i = 1; i <= n; i++) {
                System.out.println(i);
                sum+=i;
            }
            System.out.println("Sun of n Number is "+sum);
        }
    }
}
