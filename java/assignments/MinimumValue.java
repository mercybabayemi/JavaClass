package Assignments;

public class MinimumValue{
	public static void main(String[] args){

	int[] numbers = {8,52,67,4,9,87};
	
	int minimum = numbers[0];

	for(int i = 0; i < numbers.length; i++){
		if(numbers[i] < minimum ){
 			minimum = numbers[i];
		}
	}
System.out.print("The minimum value is " + minimum);

}
}