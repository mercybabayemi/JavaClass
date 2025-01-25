package ClassTaskJava.ClassTaskJennifer;

import java.util.Scanner;
public class IfTest{
	public static void main(String [ ] args){
	
	Scanner input = new Scanner(System.in);

	System.out.print("Enter a number: ");
	int numberOne = input.nextInt();
	
	System.out.print("Enter a number: ");
	int numberTwo = input.nextInt();


	System.out.println(numberOne > numberTwo? "Greater" : " ");

	System.out.println("You are doing well...");


	int sum = numberOne + numberTwo;


	System.out.println(sum > 50? "even sum is greater" : " ");

}
}