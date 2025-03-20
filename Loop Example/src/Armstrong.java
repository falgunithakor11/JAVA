import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        System.out.println("enter the number");
        try (Scanner sc = new Scanner(System.in)) {
            int x= sc.nextInt();
            int num = x;
            int rem;
            int sumOfQubeOfDigit = 0;
            while (num!=0) {
                rem = num %10;
                sumOfQubeOfDigit = sumOfQubeOfDigit + rem*rem*rem;
                num=num/10;
            }
            if(sumOfQubeOfDigit==x){
             System.out.println("The number is Armstrong");
            }
            else{
                System.out.println("The number is not armsrong");
            }
        }
    }
}
