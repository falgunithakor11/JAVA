import java.util.Scanner;

public class StrArray {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            String[] str = new String[5];
            System.out.println("Enter String:");
            for (int i = 0; i < str.length; i++) {  // Fixed condition
                str[i] = sc.next();
            }
            for (int i = 0; i < str.length; i++) {  // Fixed condition
                System.out.println("String of " +i+ " is  + str[i]");
            }
        }
    } 
}
