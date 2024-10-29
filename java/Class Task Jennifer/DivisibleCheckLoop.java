import java.util.Scanner;
public class DivisibleCheckLoop{
	public static void main(String[ ] args){
	
	Scanner input = new Scanner(System.in);
	
	int number;

	for(int i = 1; i <= 3; i++){
		System.out.print("Enter number: ");
		number = input.nextInt();
			if(number % 5 == 0 && number % 11 == 0){
				System.out.println("Number is divisible by 11 and 5");
			}
			else{
			System.out.println("Number is not divisible by 11 and 5");
			}
}

}
}