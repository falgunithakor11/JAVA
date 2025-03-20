public class Check_can_Vote {
    public static void main(String[] args) {
        CheckAge(18);
    }

    static void CheckAge(int age) {
        if (age <= 18) {
            System.out.println("You can not Vote");
        } else {
            System.out.println("You can Vote");
        }
    }
}
