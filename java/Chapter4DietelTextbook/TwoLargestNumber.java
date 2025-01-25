package Chapter4DietelTextbook;

import java.util.Scanner;
import java.util.Arrays;
public class TwoLargestNumber{
	public static void main(String[] args){
	
	Scanner input = new Scanner(System.in);

	int[] numbers = new int[10];

	for(int number = 0 ; number <= 9; number++){
		
		System.out.print("Enter a number: ");

		numbers[number] = input.nextInt();
	}

	Arrays.sort(numbers);

	System.out.println("Sorted numbers in ascending order: " + Arrays.toString(numbers));

	int largestNumber = numbers[9];
	int nextLargestNumber = numbers[8];

	System.out.printf("Largest number is %d%nThe next largest number is %d", largestNumber, nextLargestNumber);



}
}