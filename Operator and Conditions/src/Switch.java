import java.util.Scanner;
 public class Switch {
    public static void main(String[] args){
        try (Scanner sc = new Scanner(System.in)) {

            System.out.println("Enter the size");
            int number = sc.nextInt();
            String size;
            switch(number){
                case 29:
                      size = "Small";
                        break;
                case 42:
                      size = "Medium";
                      break;
                case 48:
                        size = "Extra Large";
                        break;
               default:
                        size="Unknown";
                        break;   
            }
            System.out.println("Your cloth size is : "+size);

        }
    }
   
} 
