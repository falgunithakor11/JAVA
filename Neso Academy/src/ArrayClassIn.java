import java.util.Arrays;

public class ArrayClassIn {
    public static void main(String[] args) {
        //1.The arrays class:A class that contains some static methods that are used with arrays
        //like Sorting , Searching ,Comparing.Filling. Retuning a string representation of an array
       /*-----------SOERTING ARRAYS--------------*/
       //sort(array): sorts the whole array
       int[] numbers = {5,2,3,-1,0,4,1};
       Arrays.sort(numbers);//-1,0,1,2,3,4,5
       //sort method will modify orignal array because array is pass by refernce
       char[] characters = {'R','f','r','z','a','F','n','A','r','m'};//According to unicode
       Arrays.sort(characters);
       int[] unicodes = {'R','f','r','z','a','F','n','A','r','m'};//According to unicode
       Arrays.sort(unicodes );
       //Sort mrthod is overloading
       //it taks 3 parameters sort(array, fromIndex,toIndex):sort from (fromINdex) to (toINdex - 1)
    //    int[] number = {5,4,3,2,1,0,-1};//3,6+1
       Arrays.sort(numbers,3,7);//5,4,3,2,1,0,-1
       //ARRAY  OF OBJECTS
       String[] strings = {"hij","abc","efg"};
       Arrays.sort(strings);//abc,efg,hij

        /*-----------SEARCHING ARRAYS--------------*/
        //USING BINARY SEARCH
        //the array should be sorted in increasing order
        //binarySearch(array,element)
         //binarySearch(numbers,4)
         //Return values: Index of element inside the rray if exists -(intsertionIndex+1) if the elemnet was not found
         //Example: {1,2,3,4,5,6,7}
         int[] num = {5,4,3,2,1,0,-1};
         //lets d=sort the array by
        Arrays.sort(num);
        System.out.println(Arrays.toString(num));
        System.out.println(Arrays.binarySearch(num, 4));//5
        System.out.println(Arrays.binarySearch(num, -3));//-1
        String[] str = {"a","b","c"};
        System.out.println(Arrays.binarySearch(str, "A"));//-1
        System.out.println(Arrays.binarySearch(str, "a"));//0
        


















        
    }
}
