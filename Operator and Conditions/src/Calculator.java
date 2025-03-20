import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter two number");
          Float num1 = sc.nextFloat();
         Float num2 = sc.nextFloat();
            System.out.println("Enter an Operator(+,*,-,/)");
            char opr = sc.next().charAt(0);
         Float result = (float) 0;
            boolean valid = true;
            switch (opr) {
                case '+':
                    result= num1 + num2;
                    break;
                case '-':
                     result= num1 - num2;
                    break;
                case '*':
                    result= num1 * num2;
                    break;
                case '/':
                    if(num2!=0){
                        result = num1/num2;
                    }
                    else{
                        System.out.println("Division by zero is not allowed.");
                        valid = false;
                    }
                    break;
                default:
                    System.out.println("Invalid oprator");
                    break;
            }
            if(valid){
                System.out.println("resuly : "+result);
            }
        }
    }
}
