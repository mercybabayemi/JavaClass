import java.util.Scanner;
public class TenNumbersLargest{
	public static void main(String[] args){
		int counter = 0;
		int largestNumber = 0;
		
		Scanner input = new Scanner(System.in);

		while(counter < 10){
			System.out.println("Enter a number: ");
			int number = input.nextInt();
			if(number > largestNumber){
				largestNumber = number;
			}
			counter += 1;
		}
		
		System.out.println("The largest number is " + largestNumber);
	}
}