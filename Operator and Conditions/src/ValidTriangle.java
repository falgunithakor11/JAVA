import java.util.Scanner;

public class ValidTriangle {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter the first side of the triangle");
            int side1 = sc.nextInt();
            System.out.println("Enter the Second side of the triangle");
            int side2 = sc.nextInt();
            System.out.println("Enter the Third side of the triangle");
            int side3 = sc.nextInt();
              // Check if the triangle is valid
            if(isTriangleValid(side1,side2,side3)==true){
                System.out.println("The given sides form a valid triangle");
            }
            else{
                System.out.println("The given sides do not form a valid triangle");
            }


        }

    }
    public static boolean isTriangleValid(int a,int b,int c){
            return (a+b>c) && (a+c>b) && (a+b>c);

    }
    // if i use angel then every angle should ne greter than zero and sum of al the angle sholud be 180
    /*import java.util.Scanner;

public class ValidTriangleByAngles {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input the three angles of the triangle
        System.out.println("Enter the first angle:");
        int angle1 = sc.nextInt();

        System.out.println("Enter the second angle:");
        int angle2 = sc.nextInt();

        System.out.println("Enter the third angle:");
        int angle3 = sc.nextInt();

        // Check if the sum of the angles is 180 and if no angle is zero or negative
        if (angle1 > 0 && angle2 > 0 && angle3 > 0 && (angle1 + angle2 + angle3 == 180)) {
            System.out.println("The given angles form a valid triangle.");
        } else {
            System.out.println("The given angles do not form a valid triangle.");
        }

        sc.close();
    }
}
 */
    
}
