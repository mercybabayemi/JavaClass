public class CalculateSum{
	public static void main(String[]args){


	int sum = 0;
	int numberCounter = 1;

	while (numberCounter <= 10){
		System.out.printf("%d%n", numberCounter);
		sum = sum + numberCounter;
		numberCounter = numberCounter + 1;
	}
	System.out.printf("Calculated sum of first 10 natural number is %d", sum);
}
}