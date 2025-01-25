package ClassTaskJava;

import java.util.Scanner;
public class TwoNumbersSum{
	public static void main(String[]args){
 
	Scanner input = new Scanner(System.in);

	int sum = 0;
	int counter = 1;
	int stop = -1;

	do{
		System.out.print("Enter number or -1 to terminate: ");
		int number = input.nextInt();
		sum = sum + number;
		counter = counter + 1;
		
		if (number != stop){
			continue;
		}
		else{
			break;
		}

	}while(counter <= 2);


	if (sum >= 0){
		System.out.printf("The sum is %d", sum);
	}
	else {
		System.out.print( "Loop terminated");
	}
}
}
