package Assignments;

import java.util.Arrays;
public class ReverseArraySorted{
	public static void main(String[] args){

	int[] numbers = {31,5,65,-1,-5,7,8,9,0, 9};
	Arrays.sort(numbers);

	for(int i = numbers.length -1 ; i > 0; i--){
		System.out.println(numbers[i]);
	}
}
}