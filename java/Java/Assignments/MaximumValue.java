public class MaximumValue{
	public static void main(String[] args){

	int[] numbers = {8,52,67,4,9,87};

	int maximum = numbers[0];

	for(int i = 0; i < numbers.length; i++){
		if(numbers[i] > maximum){
 			maximum = numbers[i];
		}
	}
	System.out.print("The maximum Value is " + maximum);

}
}