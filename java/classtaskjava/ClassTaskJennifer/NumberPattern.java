package ClassTaskJava.ClassTaskJennifer;

import java.util.Scanner;
public class NumberPattern{
	public static void main(String[]args){

	Scanner input = new Scanner(System.in);
	System.out.print("Enter a range number: ");
	int number = input.nextInt();

	for(int i = 1; i <= number; i++){
		for(int j = 1; j <= i; j++){
		System.out.print(j);
		}
	System.out.println();
	}

	for(int i = 1; i <= number; i++){
		for(int j = i; j < number; j++){
		System.out.print(j);
		}
	System.out.println();
	}

}
}