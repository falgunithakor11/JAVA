import java.util.Arrays;
import java.util.Scanner;

public class ArrayEx1 {
    //Write a program that fills an array with n integers enterd by the user
    //Suppose that the user can enter at least 1 number and at most 20 number
    /**
     * @param args
     */
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            while (n>20|| n<=0) {
                System.out.println("INvalid number, try again : ");
                n = sc.nextInt();
            }
            int[] numbers = new int[n];
            fillArrayOfIntegers(numbers);
            printArrayOfIntegerss(numbers);


        }
    }
    public static void fillArrayOfIntegers(int[] numbers){
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        for(int i=0;i<=numbers.length;i++){
            numbers[i] = sc.nextInt();
        }
    }
    public static void printArrayOfIntegerss(int[] number){
        System.out.println("The Elements are : ");
        System.out.println(Arrays.toString(number));
    }

}
