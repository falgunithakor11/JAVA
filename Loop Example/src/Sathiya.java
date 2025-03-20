public class Sathiya {
    public static void main(String[] args) {
        int size = 5; // Must be an odd number for symmetry

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                // Conditions for drawing the swastika
                if (i == size / 2 || j == size / 2 || 
                    (i == 0 && j >= size / 2) || // Top-right horizontal line
                    (j == 0 && i <= size / 2) || // Top-left vertical line
                    (i == size - 1 && j <= size / 2) || // Bottom-left horizontal line
                    (j == size - 1 && i >= size / 2)) { // Bottom-right vertical line
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
