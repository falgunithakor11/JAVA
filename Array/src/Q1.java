public class Q1 {
    public static void main(String[] args){
        int[] marks = {70,29,35,57,33,30,67};
        System.out.println("roll number of which are fail in examination ");
        for(int i=0;i<marks.length;i++){
            if(marks[i]<35){
                System.out.println(i);
            }
        }

    }

}
