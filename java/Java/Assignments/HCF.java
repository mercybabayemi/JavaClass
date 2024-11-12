import java.util.Scanner;
public class HCF{
	public static void main(String [] args){

	Scanner input = new Scanner(System.in);

	System.out.print("Enter a higher number: ");
	int firstNumber = input.nextInt();
	
	System.out.print("Enter a lower number: ");
	int secondNumber = input.nextInt();
	
	int index = 1;

	int hcf = 0;

	for(;index <= secondNumber;){
		if(firstNumber % index == 0 && secondNumber % index == 0){
			hcf = index;
		}
		index++;
	}
	System.out.print("HCF = " + hcf);

	
}
}