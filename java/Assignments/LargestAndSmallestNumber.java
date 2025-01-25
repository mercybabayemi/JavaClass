import java.util.Scanner;
public class LargestAndSmallestNumber{
public static void main(String[]args){
 
	Scanner input = new Scanner(System.in);
	
	int largestNumber = 0;
	int smallestNumber = 0;
	int largestNumberCounter = 0;
	int smallestNumberCounter = 0;
	int counter = 1;
	int answer;

	System.out.println("Enter first number: ");
	int firstNumber = input.nextInt();

	System.out.println("Enter second number: ");
	int secondNumber = input.nextInt();

	if(firstNumber > secondNumber){
		largestNumber += firstNumber;
		smallestNumber += secondNumber;
	}
	else{ 
		largestNumber += secondNumber;
		smallestNumber += firstNumber;
	}

	do{
		System.out.println("Enter number: ");
		int userInput = input.nextInt();

		if(userInput > largestNumber){
			largestNumberCounter += 1;
			System.out.println("Largest Number Count is "+ largestNumberCounter);
		}
		else{
			smallestNumberCounter += 1;
			System.out.println("Smallest Number Count is "+ smallestNumberCounter);

		}

		System.out.println("Do you wish to continue? press 1 if yes or -1 for no: ");
		answer = input.nextInt();

		if(answer == 1){
			continue;
		}
		else if(answer == -1){
			break;
		}

		counter++;
	
	}while(answer == 1);
		System.out.printf("The largest number is %d%n", largestNumber);
		System.out.printf("The smallest number is %d%n", smallestNumber);
		System.out.printf("The largest number count is %d%n", largestNumberCounter);
		System.out.printf("The smallest number count is %d", smallestNumberCounter);

	}

}
