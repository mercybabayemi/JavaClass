package Assignments;

public class ArrayAverage{
	public static void main(String[] args){
	
	int[] numbers = {5,6,7,8,9};

	int sum = 0;
	int average = 0;

	for(int i = 0; i < numbers.length; i++ ){
	sum += numbers[0];
	average = sum / numbers.length;
	}
	System.out.print("The average is " + average);
}
}