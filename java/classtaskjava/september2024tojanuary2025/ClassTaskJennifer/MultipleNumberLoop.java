package classtaskjava.ClassTaskJennifer;

import java.util.Scanner;
public class MultipleNumberLoop{
	public static void main(String[ ] args){
	
	Scanner input = new Scanner(System.in);
	
	int number;

	for(int i = 1; i <= 3; i++){
		System.out.print("Enter number: ");
		number = input.nextInt();
			if(number % 5 == 0){
				System.out.println("Number is a multiple of 5");
			}
			else{
				System.out.println("Number is not a multiple of 5");
			}

	}

}
}