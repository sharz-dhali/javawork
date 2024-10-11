  import java.util.ArrayList;

public class ArrayListExample {
    public static void main(String[] args) {
        // Create an ArrayList
        ArrayList<String> list = new ArrayList<>();

        // Add elements
        list.add("Pineapple");
        list.add("Guava");
        list.add("Cherry");

        // Access elements
        System.out.println("First element: " + list.get(0));

        // Remove an element
        list.remove("Pineapple");

        // Display elements
        System.out.println("ArrayList: " + list);
    }
}   
