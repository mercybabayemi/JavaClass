import java.util.Scanner;      
public class CreditCardValidator {
	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	String card = getUserDetails(input);
	getCardType(input,card);
	int total = getCreditCardValidityCalculation(card);
	System.out.print(getCardValidity(total));
}

	public static String getUserDetails(Scanner input){
		String card = "";
		System.out.println("Enter a valid card details: ");
		card = input.nextLine();
		if(card.length() < 13 || card.length() > 16){
			System.out.println("Invalid card input!!\nEnter a valid card details: ");
			card = input.nextLine();
		};
		return card;
	}

	public static void getCardType(Scanner input,String card){

			if (card.charAt(0) == '4') {
				System.out.println("Card is a Visacard.");
			}
			else if (card.charAt(0) == '5'){
				System.out.println("Card is a MasterCard.");
			}
			else if (card.charAt(0) == '3' && card.charAt(1) == '7') {
				System.out.println("Card is an American Express Card.");
			}
			else if (card.charAt(0) == '6') {
				System.out.println("Card is a Discovery Card.");
			}
			else {
				System.out.println("Card has no valid type!!");
				System.out.println("Do you want to reenter a valid card or exit?\n1. Go to enter a valid card\n2. exit");
				int response = input.nextInt();
				switch(response){
					case 1: 
						getUserDetails(input);
						break;
					case 2:
						System.out.println("Bye!!!");
						break;

				}
			}
	}

	public static int getCreditCardValidityCalculation(String card){
		int oddMultiple = 1;
		int oddPositionSum = 0;
		for(int i = card.length() - 1; i >= 0; i--){
			if(i % 2 != 0){
				int digit = Character.getNumericValue(card.charAt(i));
				oddMultiple = digit * 2;
				if (oddMultiple > 9) {
					oddMultiple -= 9;
				}
				oddPositionSum += oddMultiple;
			}
		}
		System.out.printf("The total sum of odd numbers is %d%n", oddPositionSum);

		int evenMultiple = 1;
		int evenPositionSum = 0;
		for(int i = card.length() - 1; i >= 0; i--){
			if(i % 2 == 0){
				int digit = Character.getNumericValue(card.charAt(i));
				evenMultiple = digit * 2;
				if (evenMultiple > 9) {
					evenMultiple -= 9;
				}
				evenPositionSum += evenMultiple;
			}
		}
		System.out.printf("The total sum of even numbers is %d%n", evenPositionSum);


		int total = oddPositionSum + evenPositionSum;

		System.out.printf("The total sum of all numbers is %d%n", total);
		
		return total;
	}

	public static String getCardValidity(int total) {
		if(total % 10 == 0) {
			return "Card number is valid.";
		}
		else {
			return "Card is not valid.";
		}
	}

}