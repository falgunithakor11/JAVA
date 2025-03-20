import java.util.ArrayList;

public class List {
    public static void main(String[] args) {
        // Create a list of strings
        java.util.List<String> stringList = new ArrayList<>();

        // Add elements to the list
        stringList.add("Apple");
        stringList.add("Banana");
        stringList.add("Cherry");

        // Print all elements in the list
        for (String fruit : stringList) {
            System.out.println(fruit);
        }

        // Check the size of the list
        System.out.println("List size: " + stringList.size());

        // Check if the list contains a specific element
        System.out.println("List contains 'Banana': " + stringList.contains("Banana"));
    }
}
