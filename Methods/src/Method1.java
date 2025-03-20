public class Method1 {
    static void myMethod() {
        System.out.println("I just got executed!");
      }
      public static void main(String[] args) {
        myMethod();
        myMethod();
        myMethod();
        myMyyethod("Liam");
        myMyyethod("Jenny");
        myMyyethod("Anja");
        Average(2, 7);
      }
      static void myMyyethod(String fname) {
        System.out.println(fname + " Refsnes");
      }
      public static void Average(double  a, int b){
       double avg = (a+b)/2;
        System.out.println(avg);
      }
     
}
