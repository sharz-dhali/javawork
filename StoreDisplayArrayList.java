import java.util.ArrayList;

public class StoreDisplayArrayList {
    
    public static void main(String[] args) {
        // Create an ArrayList to store elements
        ArrayList<String> fruits = new ArrayList<>();

        // Add elements to the ArrayList
        fruits.add("Mango");
        fruits.add("Orange");
        fruits.add("Grapes");

        // Display elements
        for (String fruit : fruits) {
            System.out.println(fruit);
        }
    }
}
