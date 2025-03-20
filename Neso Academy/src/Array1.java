public class Array1 {
    public static void main(String[] args) {
        //The value of an object that resernces nothing
        String text;//null  
        text = "some text";//Address of "Some Text" which contains text
        //ARRAY:A collecton of variables of the same data type
        //an array varible refernces a group of data
        //The size of an array is fixed
        //datatype[] arrayname;//null
        // arrayname = new datatype[10];Address of the 10 elements of y=type datatype
        //in one line datatype[] arrayname =  new datatype[10]
        //whent an array is created its elements are assigned the foolowing defaults value
        // 0 = for the numeric primitive data types
        // \u0000 for char types
        //false for boolean typrs
        // null for referces types
        int[] numbers = new int[5];//{0,0,0,0,0}
        numbers[0]=5;//{5,0,0,0,0}
        numbers[2]=8;//{5,0,8,0,0}
        numbers[4]=10;//{5,0,8,0,10}
        //ARRAY INITALIZERS
        double[] num = {2.9,3,4,6.8,8,9};
        double[] nums = new double[2];
        nums[0]=1.9;
        nums[1]=12.9;
        //printing array
        System.out.println(nums);//address
        for(int i=0; i<nums.length;i++){
            System.out.println(nums[i] + " ");
        }
        System.out.println(text);
        for(int i=0; i<num.length;i++){
            System.out.println(num[i] + " ");
        }





        


        

    }
}
