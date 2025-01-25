import java.util.Scanner;
public class CreditLimitCalculator{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter your account number: ");
		String accountNumber = input.nextLine();
		if(accountNumber.length() < 13){
			System.out.println("Invalid number!!\nEnter valid account number: ");
			accountNumber = input.nextLine();
		}

		System.out.println("Enter your account balance at the end of the the month: ");
		int accountBalance = input.nextInt();
		if(accountBalance <= 0){
			System.out.println("Invalid account balance!!\nEnter a valid account balance: ");
			accountBalance = input.nextInt();

		}

		System.out.println("Enter total of all items charged customer this month: ");
		int totalOfAllItems = input.nextInt();

		System.out.println("Enter total of all credits applied to customer this month: ");
		int totalOfAllCredits = input.nextInt();
		
		System.out.println("Enter credit limit: ");
		int creditLimit = input.nextInt();

		double newBalance = accountBalance + totalOfAllItems - totalOfAllCredits;
		System.out.printf("The calculated new balance is %.2f%n", newBalance);

		if( newBalance > creditLimit ){
			System.out.println("Credit limit exceed.");

		}
	}
}