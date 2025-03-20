import java.util.Scanner;

public class PrintName {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            // Input numbers
            System.out.print("Enter first number: ");
            int x = sc.nextInt();
            System.out.print("Enter second number: ");
            int y = sc.nextInt();
            sc.nextLine(); // Consume leftover newline character

            // Input name
            System.out.println("Who is there???");
            String name = sc.nextLine();

            // Call printName and display result
            System.out.println(printName(name, x, y));
        }
    }

    public static String printName(String name, int x, int y) {
        System.out.println("Sum of numbers: " + calculateSum(x, y));
        // Print additional messages
        System.out.println("Ohhh!! You " + name);
        return "Hello " + name + ", nice to meet you dear!";
        // Print sum of x and y
    }

    public static int calculateSum(int a, int b) {
        return a + b;

    }
}
