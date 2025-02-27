import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

public class TestFindMissingNumber {

    @Test
    public void testThat_sumArrayFunctionReturnsCorrectValue(){
        ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(1,2,4));
        int arraySum = FindMissingNumber.sum(arr);
        assertEquals(7,arraySum);
    }

    @Test
    public void testThat_missingNumberOrNumbersSumIsCorrect(){
        ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(1,2,4));
        int missingNumbersTotal = 1;
        int arraySum = FindMissingNumber.missingNumberSum(arr,missingNumbersTotal);
        assertEquals(3, arraySum);
        ArrayList<Integer> arr1 = new ArrayList<>(Arrays.asList(1,2,4,5,7));
        int missingNumberTotal1 = 2;
        int arraySum1 = FindMissingNumber.missingNumberSum(arr1, missingNumberTotal1);
        assertEquals(9,arraySum1);
    }

    @Test
    public void testThat_insertMissingNumberReturnsCorrectValue(){
        ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(1,2,4));
        assertIterableEquals(FindMissingNumber.insertMissingNumber(arr,1,1), Arrays.asList(1,2,3,4));

        ArrayList<Integer> arr1 = new ArrayList<>(Arrays.asList(1,2,4,5,7));
        assertIterableEquals(FindMissingNumber.insertMissingNumber(arr1,1,1), Arrays.asList(1,2,3,4,5,6,7));
    }
}
