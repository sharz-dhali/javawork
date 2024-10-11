import java.util.HashMap;

public class HashMapExample {
    public static void main(String[] args) {
        // Create a HashMap
        HashMap<String, String> capitalCities = new HashMap<>();

        // Add key-value pairs
        capitalCities.put("Uganda","Kampala");
        capitalCities.put("Kenya", "Nairobi");
        capitalCities.put("Rwanda", "Kigali");
        capitalCities.put("Congo", "Kinshasha");

        // Access a value
        System.out.println("Capital of England: " + capitalCities.get("England"));

        // Display all key-value pairs
        for (String key : capitalCities.keySet()) {
            System.out.println("Key: " + key + ", Value: " + capitalCities.get(key));
        }
    }
}
