public class matrix {
    public static void main(String[] args) {
        int [][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        //Correcting the index to access a valid element

        int element = matrix[1][2]; //Accessing the element at the row and last
        System.out.println("Element:" + element);
        }
    }

