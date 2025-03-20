public class PassingArgument {
    public static void main(String[] args) {
        Point p1=new Point();
        p1.x = 1;
        p1.y = 2;
     
        System.out.println("x = "+p1.x+ " , y = "+p1.y);
        change(p1);
        System.out.println("x = "+p1.x+ " , y = "+p1.y);

    }

    public static void change(Point p){
       
        p.x=2;
        p.y=1;
    }
}
