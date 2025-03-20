import java.util.Scanner;

public class Input {

    public static void main(String[] args){
        try (Scanner sc = new Scanner(System.in)) {
            String myName = sc.nextLine();
            int x = sc.nextInt();
            boolean y =sc.nextBoolean();
            System.out.println(x +":"+ y);
            System.out.println(myName.length() +" : "+myName);
            String yourName = sc.next();
            System.out.println(yourName.length() +" : "+yourName);
        }
        

    //     int range= 989999999;
    //     System.out.println(range);
    //     int num =(int)2147483648L;
    //     System.out.println(num);
    //    char letter ='A';
    //    System.out.println((int)letter);
        // try (Scanner sc = new Scanner(System.in)) {
            
        //     String food ;
        //     System.out.println("Enter Your favorite food: ");
        //     food = sc.nextLine();
        //     System.out.println(8+9+ "Your first choice: "+ food+3);
        //     System.out.println("Enter another favourite food : ");
        //     food = sc.nextLine();
        //     System.out.println("Now you chose: "+ food);
        //     sc.close();
        // }
       
    }
}
