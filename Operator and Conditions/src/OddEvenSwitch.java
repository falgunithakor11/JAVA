import java.util.Scanner;
public class OddEvenSwitch {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter the number");
            int n = sc.nextInt();
            switch(n%2){
                case 0:
                    System.out.println("Even");
                    break;
                default:
                    System.out.println("odd");
            }
        }
        
    }
}