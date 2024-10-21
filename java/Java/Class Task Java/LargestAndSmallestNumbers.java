import java.util.Scanner;
public class LargestAndSmallestNumbers{
	public static void main(String[]args){
 
	Scanner input = new Scanner(System.in);

	int largestNumbers = 0;
	int smallestNumbers = 0;
	int counter = 1;
	String answer = "No";
	int number = 0;
	String userInput = "";

	while(true){
		System.out.print("Enter number: ");
		number = input.nextInt();

			if (number >=1){
				largestNumbers = number;
			}
			else{
				smallestNumbers = number;
			}

		System.out.print("Do you wish to continue? yes or no  ");
		userInput = input.next();
		if(userInput == answer){
			break;
		}
		else{
			continue;
		}
		
		//counter++;
	}
		System.out.printf("The largest number is %d", largestNumbers);
		System.out.printf("The smallest number is %d", smallestNumbers);
	}
}
