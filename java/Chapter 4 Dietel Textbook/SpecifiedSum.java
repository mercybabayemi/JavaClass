import java.util.Scanner;
public class SpecifiedSum{
	public static void main(String[] args){
		int sum = 0;
		int number = 0;
		Scanner input = new Scanner(System.in);
		
		while(sum < 50){
			System.out.print("Enter a number : ");
			number = input.nextInt();
			sum += number;
		}

		System.out.printf("The total sum is %d",sum);
	}
}