package classtaskjava.ClassTaskJennifer;

import java.util.Scanner;
public class NegativePositiveAndZeroInput{
	public static void main(String [ ] args){

	Scanner input = new Scanner(System.in);
	System.out.print("Enter a number: ");
	int entree = input.nextInt();

	System.out.print("Enter a number: ");
	int entree1 = input.nextInt();
	
	System.out.print("Enter a number: ");
	int entree2 = input.nextInt();
	
	int positiveNumber = 0;
	int negativeNumber = 0;
	int zeroInput = 0;
	int count = 1;

do{
	if(entree >= +1){
		positiveNumber += 1;
	}
	else if(entree <= -1){
		negativeNumber += 1;
	}
	else if(entree == 0){
		zeroInput += 1;
	}
	if(entree1 >= +1){
		positiveNumber += 1;
	}
	else if(entree1 <= -1){
		negativeNumber += 1;
	}
	else if(entree1 == 0){
		zeroInput += 1;
	}
	if(entree2 >= +1){
		positiveNumber += 1;
	}
	else if(entree2 <= -1){
		negativeNumber += 1;
	}
	else if(entree2 == 0){
		zeroInput += 1;
	}
}while(entree <= 3);
System.out.println("Positive number is " + positiveNumber);
System.out.println("Negative number is " + negativeNumber);
System.out.println("Zero input number is " + zeroInput);
}
}