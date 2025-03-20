import java.util.Scanner;

public class ArmstrongMethod {
    /**
     * @param args
     */
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int num = sc.nextInt();
            System.out.println(isArmstrong(num));
            boolean[]  bool={4>3,7<9,4>8 };
            int i;
        
            for(i=0;i<bool.length;i++){
                System.out.println(bool[i]);
            }
        }
    }
    public static boolean isArmstrong(int n) {
        int num = n;  // Preserve the original number
        int rem;
        int sumOfQubeOfDigit = 0;
    
        while (num != 0) {
            rem = num % 10;  // Extract the last digit
            sumOfQubeOfDigit = sumOfQubeOfDigit + rem * rem * rem; // Add cube of the digit
            num = num / 10;  // Remove the last digit
        }
    
        // Compare the original number with the sum of cubes of its digits
        if (n == sumOfQubeOfDigit) { 
            return true;
        }
        return false;
        
    }
    
    // public static int countDigits(int n){
    //             int nod=0;
    //             while (n!=0) {
    //                 n=n/10;
    //                 nod++;
    //             }
    //             return nod;
    // }
}
