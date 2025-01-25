import java.util.Scanner;
public class Numbers {
	public static void main(String[]args){
 
	Scanner input = new Scanner(System.in);
	
	int largestNumber =0;
	int smallestNumber =0;
	

	while(true){
		System.out.print("Enter number: ");
		int userInput = input.nextInt();

		if (userInput > largestNumber){
			largestNumber = userInput;
			System.out.print(largestNumber);
		}
		if(userInput < smallestNumber){
			smallestNumber = userInput;
		}


		System.out.println("DO you wish to continue, press 1 for(Yes) or -1 for(no):");
		int answer = input.nextInt();

		if (answer == 1) {
			continue;
		}
		else if (answer == -1) {
			break;
		}

	}
		System.out.printf("The largest number is %d%n", largestNumber);
		System.out.printf("The smallest number is %d", smallestNumber);
	}

}
