public class AnonymousAray {
    public static void main(String[] args) {
        System.out.println(getNumber());
       // Call the getNumbers method
       int[] num = getNumbers();

       // Print the elements of the array
       for (int number : num) {
           System.out.println(number);
       }
       // Declare another variable to store the array
       int[] myArray = AnonymousArray();

       // Print the elements of the array using the new variable
       for (int nu : myArray) {
           System.out.println(nu);
       }
         //Anonymous arrays
    //Exceeding Array bounds
    //printnig char arrays 
    //Passing arrays to methods
    //Returning arrays from methods
    /*---------------Anonymous arrays---------------- */
    //An array without a varriable referencing it
    // syntax : new int[] {1,2,3,4};
    //passing array to method
    //printArray(mew int[] {1,2,3,4});
      /*---------------EXCEEDING ARRAY BOUNDS---------------- */
      //The indices must be between 0 and length-1
      char[] chars = {'a','b','c','d'};
      //Index -1 out of bounds for legth 4
      System.out.println(chars);//printing as a string abcd
      /*---------------PASSING ARRAYS TO METHOD---------------- */
      //Arrays are passed by reference
      int[] numbers = {0,1};
      change(numbers);
      printArray(numbers);     
    }
    public static void change(int[] num){
        num[0] = 1;//{1,1}
        num[1] = 0;//{1,0}

    }
    
    public static void printArray(int[] num){
    for(int i=0; i<num.length;i++){
        System.out.println(num[i] + " ");
    }}
    public static int getNumber(){
        int x = 1;
        return x;
        //note: x is destroyed after method is executed
    }
    //Returning array from method
    public static int[] getNumbers(){
        int[] numbers = {2,4,1,5,5};
        return numbers;
    }
    public static int[] AnonymousArray(){
        
        return new int[] {1,2,4,6,7};
    }

}
