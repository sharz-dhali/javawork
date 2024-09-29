import java.util.Arrays;
import java.util.Collections;
public class reverse{

    public static void main(String[] args) {
// declaring and initializing arrays
Integer[] numbers = {4, 8, 15, 23, 42};
//Printing the original array
System.out.println("original array:" +Arrays.toString(numbers));
//Printing the reversed array
Arrays.sort(numbers, Collections.reverseOrder());
System.out.println("reversed array: " +Arrays.toString(numbers));

    }
}
