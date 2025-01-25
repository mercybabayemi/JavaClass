package ClassTaskJava.ClassTaskJennifer;

import java.util.Scanner;
public class EqualityCheckOption{
	public static void main(String[ ]args){
	
	Scanner input = new Scanner(System.in);
	int answer;
do{
	System.out.print("Enter first number: ");
	int firstNumber = input.nextInt();

	System.out.print("Enter second number: ");
	int secondNumber = input.nextInt();

	System.out.print("Enter third number: ");
	int thirdNumber = input.nextInt();

	if(firstNumber == secondNumber && firstNumber == thirdNumber){
		System.out.println("Numbers are equal");
	}
	else{
		System.out.println("Numbers are not equal");
	}

		System.out.print("Do you wish to continue? press 1 for yes to continue or 0 for no to break: ");
		answer = input.nextInt();

}while(answer == 1);

}
}