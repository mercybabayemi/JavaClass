import java.util.ArrayList;
import java.util.Collections;

import static java.util.Collections.*;

public class FindMissingNumber {
    public static void main(String[] args) {

    }

    public static ArrayList<Integer> insertMissingNumber(ArrayList<Integer> arr, int noOfMissingNumber, int step) {
        int gottenSum = missingNumberSum(arr, noOfMissingNumber);
        sort(arr);
        int previousNo = arr.get(0);
        for (int i = 1; i < arr.size(); i++) {
            while (arr.get(i) - previousNo > step) {
                int calculatedNo = previousNo + step;
                arr.add(calculatedNo);
                previousNo = calculatedNo;
            }
            previousNo = arr.get(i);
        }
        while (arr.size() < arr.size() + noOfMissingNumber) {
            int calculatedNo = arr.get(arr.size() - 1) + step;
            arr.add(calculatedNo);
        }
        Collections.sort(arr);
        return arr;
    }

    public static int missingNumberSum(ArrayList<Integer> arr, int noOfMissingNumber){
        int lengthModified = arr.size() + noOfMissingNumber;
        int totalSum = lengthModified * (lengthModified + 1) / 2;
        int arraySum = sum(arr);
        return totalSum - arraySum;
    }

    public static int sum(ArrayList<Integer> arr) {
        int sum = 0;
        for(int i = 0; i < arr.size(); i++){
            sum += arr.get(i);
        }
        return sum;
    }
}
