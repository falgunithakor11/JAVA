public class SameMethodName {
    public static void main(String[] args) {
        int a=5,b=7;
        System.out.println(addNumber(a,b));
        System.out.println(addNumber());
        for(int i=1;i<=5;i++){
            System.out.println("Square of "+i+ " is "+getSquare(i));
        }
    }
    public static int addNumber(){
        int a=5,b=5;
        return a+b;
    }
    public static int addNumber(int a,int b){
        return a+b;
    }
    public static int getSquare(int x){
        return x*x;
    }
}
