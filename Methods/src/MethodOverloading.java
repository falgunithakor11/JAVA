public class MethodOverloading {

    public static void main(String[] args) {
        System.out.println(formatNumber(500));   // Calls the int version
        System.out.println(formatNumber(3.141)); // Calls the double version
        System.out.println(formatNumber("200.5")); // Calls the String ve
        System.out.println("-------------CASE1----------------");
        int one=10;
        int two=20;
        int sum = scopes(one,two);
        System.out.println(sum);
        System.out.println("-------------CASE2----------------");
        System.out.println(one+ " "+two);
        swap(one,two);
        System.out.println(one+ " "+two); 
        System.out.println("-------------CASE3----------------");
        int number = 10; // Original value
        modify(number);  // Passing 'number' as an argument
        System.out.println("Main method value: " + number); // Prints the original valu
    }
    public static void modify(int num) {
        System.out.println("Method received: " + num); // Prints 10
        num = 20; // Changing the value inside the method
        System.out.println("Modified in method: " + num); // Prints 20
        //If we return the value of num back to the main() function, we can update or 
        // capture the modified value in the calling function. Let me modify the example for you:
        // public class Main {

        //     public static void main(String[] args) {
        //         int number = 10; // Original value
        //         number = modify(number); // Capture the returned value
        //         System.out.println("Main method value: " + number); // Prints the updated value
        //     }
        
        //     public static int modify(int num) {
        //         System.out.println("Method received: " + num); // Prints 10
        //         num = 20; // Change the value inside the method
        //         System.out.println("Modified in method: " + num); // Prints 20
        //         return num; // Return the updated value
        //     }
        // }
        
    }
    public static void swap(int one,int two){
        System.out.println(one+ " "+two);
        int temp =one;
        one=two;
        two=temp;
        System.out.println(one+ " "+two);
       
    }
    public static int scopes(int one,int another){
        int sum = one+another;
        return sum;
    }
        //in java , two or more methods may have the same name if they differ in parameters
        //differnt number of parameters or difrent type of parameters or both
        //These methods are called oveloaded methods and this feature in itself is caled method overloading
        //example
        // void func(){...}
        // void func(int a){...}
        //float func(double a){...}
        // float func(int a,float b){...}
        //all of these are completely valid but you can see that the fuction method actually overloaded but this method have the exat same name but they differ arguments
        //method overloading is not associated with returns time that means if you will erite function like this
        // void fuction(int a)
        // int function(int a)
        //this is not overloading because in this case the return thing is differnt rest every thing is same
        // overloades method may have same or differnt return type
//         Nahi, iss case mein method overloading nahi hogi. Method overloading tabhi hoti hai jab ek hi class mein do ya usse zyada methods same naam ke hote hain, lekin unka parameter list alag hota hai, jaise ki arguments ki type, order ya number.

// Aapke diye gaye example mein void fuction(int a) aur int function(int a) hain. Inka naam alag hai—ek fuction hai aur doosra function. Naam different hone ki wajah se yeh method overloading ke daayre mein nahi aate.

// Agar aap method overloading ka example dekhna chahein, toh kuch aise ho sakta hai:
// Nahi, iss case mein method overloading nahi hogi. Method overloading tabhi hoti hai jab ek hi class mein do ya usse zyada methods same naam ke hote hain, lekin unka parameter list alag hota hai, jaise ki arguments ki type, order ya number.

// Aapke diye gaye example mein void fuction(int a) aur int function(int a) hain. Inka naam alag hai—ek fuction hai aur doosra function. Naam different hone ki wajah se yeh method overloading ke daayre mein nahi aate.

// Agar aap method overloading ka example dekhna chahein, toh kuch aise ho sakta hai:
    
    public static String formatNumber(int value){
        return String.format("%d", value);
    }
    public static String formatNumber(double value){
        return String.format("%.3f", value);
    }
    public static  String formatNumber(String value){
        return String.format("%.2f",Double.parseDouble(value));
    }
  

}