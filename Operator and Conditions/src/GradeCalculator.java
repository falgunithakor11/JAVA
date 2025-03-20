import java.util.Scanner;

public class GradeCalculator {
    public static void main(String args[]){
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Welcome to Grade Calculater");
            double m = sc.nextDouble();
            System.out.println("Enter the marks from :"+m);
            System.out.println("Please enter the marks of subject1: ");
            float m1 = sc.nextFloat();
            System.out.println("Please enter the marks of subject2: ");
            float m2 = sc.nextFloat();
            System.out.println("Please enter the marks of subject3: ");
            float m3= sc.nextFloat();
            double total = m1+m2+m3;
            double per = (total/(3*m))*100;
            System.out.println("Percentage : "+per);
            
        }
    }
}
