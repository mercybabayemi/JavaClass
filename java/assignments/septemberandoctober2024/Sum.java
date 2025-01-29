package assignments;

public class Sum{
	public static void main(String[] args){

	int[] numbers = {7,8,9,7,2,10,10,5};

	int total = 0;

	for(int i = 0; i < numbers.length; i++){

 		total += numbers[i];
	}
	System.out.print("The total sum is " + total);

}
}