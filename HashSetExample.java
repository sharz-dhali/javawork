import java.util.HashSet;

public class HashSetExample {

    public static void main(String[] args) {
        // Create a HashSet
        HashSet<String> set = new HashSet<>();

        // Add elements 
        set.add("Dog");
        set.add("Cat");
        set.add("Bird");
        set.add("Dog"); // Duplicate element

        // Display elements
        System.out.println("HashSet: " + set);
    }
}
