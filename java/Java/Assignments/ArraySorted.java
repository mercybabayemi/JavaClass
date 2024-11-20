import java.util.Arrays;
public class ArraySorted{
	public static void main(String[] args){

	int[] numbers = {31,5,65,-1,-5,7,8,9,0, 9};
	Arrays.sort(numbers);

	for(int i = 0 ; i < numbers.length; i++){
		System.out.println(numbers[i]);
	}
}
}