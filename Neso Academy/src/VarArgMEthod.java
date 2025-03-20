public class VarArgMEthod {
    public static void main(String[] args) {
        //passing a variable number of arguments to a method
        //A variable number of arguments can be passed to a method
        System.out.println(sum(1,7));//8
        System.out.println(sum(1,9,-1));//9
        System.out.println(sum(1,3,-3,1));//2
        System.out.println(sum(0,1,99,-1,2));//101
        System.out.println(sum(1,7,-3));
        int[] numbers = {1,7,-2};
        System.out.println(sum(numbers));
        System.out.println(sum(new int[] {1,7,-2}));
    }
    public static int sum(int... numbers){
        int sum=0;
        for (int number : numbers) {
                    sum += number;
                }
                return sum;
    }
    //variable - legth argument lists
    //only one variable - legth parameters may be specified in a method
    //it must be the last parameter or any other parameters must precede it
    //We can pass an array or a varable number of arguments to variable - length - parameter
    //When invoking a method with a variable number of arguments, java creates an array and passes the argument to it
    





}
