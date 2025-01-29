package classtaskjava.ClassTaskJennifer;

import java.util.Scanner;
public class EvenAndOddNumberLoop{
	public static void main(String[ ] args){
	
	Scanner input = new Scanner(System.in);
	
	int number;

	for(int i = 1; i <= 3; i++){
		System.out.print("Enter number: ");
		number = input.nextInt();
			if(number % 2 == 0 ){
				System.out.println("Number is an even number");
			}
			else{
				System.out.println("Number is an odd number");
			}
	}

}
}