import java.util.Arrays;


public class descendingorder {
    public static void main(String[] args) {
        int[]numbers = {5,3,8,1,2};
        
       // sorting arrays in descending order
       Arrays.sort(numbers);
       int[] sortedNumbers = new int[numbers.length];
       for(int i = 0; i < numbers.length; i++){
    sortedNumbers[i] = numbers[numbers.length - 1 - i];
       }
       //print the sorted array
       System.out.println("sorted array in descending order");
       for(int number : sortedNumbers){
        System.out.println(number);
       }
    }
}
