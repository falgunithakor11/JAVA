public class Sum_of_Number {
    public static void main(String[] args) {
        int numbers[] = {23,12,6,7,15,3,2,56};
        int sum = 0;
        for(int number:numbers){
            sum+=number;
        }
        System.out.println("Sum is "+sum);
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE; 
        for(int num : numbers){
            if(num<min){
            min = num;
        }
        if(num>max){
            max=num;
        }
    }
    System.out.println("Minimum is "+min);
    System.out.println("Maximum is "+max);
 }
}
