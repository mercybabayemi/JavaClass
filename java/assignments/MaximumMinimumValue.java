package Assignments;

public class MaximumMinimumValue{
	public static void main(String[] args){

	int[] numbers = {1,2,3,4,5};

	int maximum = numbers[0];
	int minimum = numbers[0];

	for(int index: numbers){
		if(index > maximum){
		maximum = index;
		}
		else if(index < minimum){
		minimum = index;
		}
	}
	System.out.println("Minimum value is " + minimum);
	System.out.print("Maximum value is " + maximum);

}
}