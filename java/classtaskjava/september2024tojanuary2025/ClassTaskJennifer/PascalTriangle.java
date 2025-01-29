package classtaskjava.ClassTaskJennifer;

import java.util.Scanner;
public class PascalTriangle{
	public static void main(String[] args){
	
	Scanner input = new Scanner(System.in);
	
	System.out.print("Enter a number: ");
	int number = input.nextInt();

	int fact = 1;
	for(int i = 0; i < number; i++){
		for(int j = 1; j <= 5 - i; j++){
			System.out.print(" ");
		}
		for(int j = 0; j <= i; j++){
			System.out.print(fact + " ");
			fact = fact *(i - j)/(j + 1);
		}
		System.out.println();
	}
}
}