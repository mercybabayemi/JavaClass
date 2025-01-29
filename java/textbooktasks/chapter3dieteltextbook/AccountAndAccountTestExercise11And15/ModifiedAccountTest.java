package chapter3dieteltextbook.AccountAndAccountTestExercise11And15;

import java.util.Scanner;
public class ModifiedAccountTest{
	public static void main(String[] args) {
	
		Account account1 = new Account("Jane Green", 50.00);
		Account account2 = new Account("John Blue", -7.53); 

		displayAccount(account1);
		displayAccount(account2);
	
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter deposit amount for account 1: ");
		double depositAmount = input.nextDouble();
		System.out.printf("%nadding %.2f to account1's balance%n%n", depositAmount);
		account1.deposit(depositAmount);

		displayAccount(account1);
		displayAccount(account2);

		System.out.print("Enter deposit amount for account 2: ");
		depositAmount = input.nextDouble();
		System.out.printf("%nadding %.2f to account2's balance%n%n", depositAmount);
		account2.deposit(depositAmount);

		displayAccount(account1);
		displayAccount(account2);

		System.out.print("Enter amount to withdraw from account 1: ");
		double withdrawalAmount = input.nextDouble();
		System.out.printf("%nremoving %.2f from account1's balance%n%n", withdrawalAmount);
		account1.withdrawMoney(withdrawalAmount);

		displayAccount(account1);
		displayAccount(account2);

		System.out.print("Enter amount to withdraw from account 2: ");
		withdrawalAmount = input.nextDouble();
		System.out.printf("%nremoving %.2f from account2's balance%n%n", withdrawalAmount);
		account2.withdrawMoney(withdrawalAmount);

		displayAccount(account1);
		displayAccount(account2);
	}

	public static void displayAccount(Account accountToDisplay){
		System.out.printf("%s balance : $%.2f%n", accountToDisplay.getName(), accountToDisplay.getBalance());
	}
}