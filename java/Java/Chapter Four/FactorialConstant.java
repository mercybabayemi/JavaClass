import java.util.Scanner;
public class FactorialConstant{
	public static void main(String[] args){

	Scanner input = new Scanner(System.in);
	System.out.print("Enter a Number: ");
	int number = input.nextInt();
	int factorial = 1;
	int count = 0; 
	int e = 0;

	while(number >= 1){
		factorial *= number;
		number--;
		e = 1 + ( 1 / factorial(count))
		}
		count++;
	}
	
	System.out.print(e);	
}
}