import java.util.Arrays;

public class ArrayClassPart3 {
    public static void main(String[] args) {
        //Filling arrays
        //fill(array,value):fill whole array
        int[] numbers1 = new int[8];//{0,0,0,0,0,0,0,0 }
        Arrays.fill(numbers1, 3);//{3,3,3,3,3,3,3,3};
        //fill(array , fromINdex, toIndex, value)
        int[] numbers2 = new int[8];//{0,0,0,0,0,0,0,0 }
        Arrays.fill(numbers2, 3,7,5);//{0,0,0,5,5,5,5,0 }
        //Filling array of objects
        String[] str = new String[3];//{null,null,null}
        Arrays.fill(str,"hello");//{hello,hello,hello}
        //PRINTING ARRAYS
        //USING toString()
        System.out.println(Arrays.toString(str));




}
}