import java.util.Scanner;
import java.util.ArrayList;
public class PhoneBook{
	public static void main (String[] args) {
		Scanner input = new Scanner(System.in);

		ArrayList<Long> phoneNumbers = new ArrayList<>();
		ArrayList<String> firstNames = new ArrayList<>();
		ArrayList<String> lastNames = new ArrayList<>();

		getMainQuestionDisplay(input, phoneNumbers, firstNames, lastNames);
				
	}
	
	public static void getMainQuestionDisplay(Scanner input, ArrayList<Long> phoneNumbers, ArrayList<String> firstNames, ArrayList<String> lastNames){
		System.out.print("What do you want to do?\n1. Add contact\n2. Remove contact\n3. Find contact by phone number\n4. Find contact by first name\n5. Find contact by last name\n6. Edit contact\n7. Exit\nEnter a numerical value!!\n");
		int response = input.nextInt();
		switch(response){
			case 1:
				getAddToContactDisplay(input, phoneNumbers, firstNames, lastNames);
				break;
			case 2:
				System.out.print("remove");
				break;
			case 3:
				System.out.print("find phone number");
				break;
			case 4:
				System.out.print("find first name");
				break;
			case 5:
				System.out.print("find last name");
				break;
			case 6:
				System.out.print("edit");
				break;
			case 7:
				System.out.print("Exiting>>>>>>");
				break;
		}
	}

	public static void getToAddContactPhoneNumber(Scanner input, ArrayList<Long> phoneNumbers){
		System.out.print("Enter phone number: \n"); 

		long phoneNumber = input.nextLong();
		input.nextLine();
		phoneNumbers.add(phoneNumber);
	}

	public static void getToAddContactFirstNames(Scanner input, ArrayList<String> firstNames){
		System.out.print("Enter the phone number owner's first name: \n"); 

		String firstName = input.nextLine();
		firstNames.add(firstName);
	}

	public static void getToAddContactLastNames(Scanner input, ArrayList<String> lastNames){
		System.out.print("Enter the phone number owner's last name: \n"); 

		String lastName = input.nextLine();
		lastNames.add(lastName);
		
	}

	public static void getAddToContactDisplay (Scanner input, ArrayList<Long> phoneNumbers, ArrayList<String> firstNames, ArrayList<String> lastNames) {

		getToAddContactPhoneNumber(input, phoneNumbers);
		getToAddContactFirstNames(input, firstNames);
		getToAddContactLastNames(input, lastNames);
		getAddToContactReversal (input, phoneNumbers, firstNames, lastNames);
	}

	public static void getAddToContactReversal (Scanner input, ArrayList<Long> phoneNumbers, ArrayList<String> firstNames, ArrayList<String> lastNames) {
		System.out.print("Do you want to:\n1. Add more contacts\n2. Go back to main menu?\n3. Exit\nEnter a numerical value...\n");
		int response = input.nextInt();
		if (response == 1) {
			getAddToContactDisplay(input, phoneNumbers, firstNames, lastNames);
		}
		else if (response == 2){
			getMainQuestionDisplay(input, phoneNumbers, firstNames, lastNames);
		}
		else if (response == 3) {
			System.out.print("Exiting>>>>>>");
		}
		else {
			System.out.print("Invalid input!!!\nEnter a valid number.");
			response = input.nextInt();
		}
	}

	public static void getToRemoveContact (Scanner input, ArrayList<Long> phoneNumbers, ArrayList<String> firstNames, ArrayList<String> lastNames) {
		System.out.printf("Available contacts are %s %s");
	}
}