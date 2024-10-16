public class GenericMethodExample {
    // Generic method
    public static <S> void printArray(S[] array) {
        for (S element : array) {
            System.out.println(element);
        }
    }

    public static void main(String[] args) {
        // Integer array
        Integer[] intArray = {1, 2, 3, 4, 5};
        // String array
        String[] stringArray = {"sharz", "dhali"};

        // Call generic method with Integer array
        printArray(intArray);

        // Call generic method with String array
        printArray(stringArray);
    }
}
