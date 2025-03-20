import java.util.Arrays;

public class ArrayClassPart2 {
    /*----------------Comparing arrays----------------- */
    //USING EQUALS METHOD
    public static void main(String[] args) {
        int[] numbers1 = {5,4,3,2,1,0,-1};
        int[] numbers2 = {5,4,3,2,1,0,-1};
        int[] numbers3 = {5,4,3,2,1,0,-1};
        System.out.println(numbers1 == numbers2);//false
        //because in this case we are comparing address of numbers1 and address of numbers2 
        //and address of both array are differnt;
        System.out.println(Arrays.equals(numbers1, numbers2));//true
        //is method is going to compare the elements idex by index at array if elements at same index are same than it returns true and if atleast one element is sme index is differnt it returns fals
        System.out.println(Arrays.equals(numbers1, numbers3));//false
    /*----------------Compare Arrays of Object----------------- */
    String[] string1 ={"a","b","c"};
    String[] string2 = {"a","b","c"};
    //So similarlyy
    System.out.println(string1 == string2);//false
    System.out.println(Arrays.equals(string1,string2));//true
    



    }
}
