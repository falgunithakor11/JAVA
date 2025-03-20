import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int x = sc.nextInt();
            int rem;
            int num= x;
            int revers=0;
            while(num!=0) {
                rem = num%10;
                revers = revers*10 + rem;
                num = num/10;
            }
            if(x==revers){
                System.out.println("Number is Palindrome");
            }
            else{
                System.out.println("NOt Palindrome");
            }
        }
    }
}
