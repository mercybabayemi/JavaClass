import java.util.ArrayList;

public class Multiples {
    public static void main(String[] args) {

    }
    public static ArrayList<Integer> findMultiples(int number1, int number2, int number3){
        ArrayList<Integer> arr = new ArrayList<>();
        for(int i = number1; i <= number2; i++){
            if(i % number3 == 0){
                arr.add(i);
            }
        }
        return arr;
    }

    public static int[] convertObjectToIntArray(Object[] arr){
        int[] numbers = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            numbers[i] = (int) arr[i];
        }
        return numbers;
    }
}
