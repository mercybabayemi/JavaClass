import java.util.Scanner;      
public class CreditCardValidator {
	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	String card = getUserDetails(input);
	getCardType(input,card);
	getCreditCardValidity(card);
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

	public static void getCreditCardValidity(String card){
		int oddMultiples = 1;
		int twoNumbersSum = 0;
		for(int i = card.length() - 1; i >= 0; i--){
			if(i % 2 != 0){
				System.out.println("The element is " + card.charAt(i) + " ");
				oddMultiple = card.charAt(i) 
			}
		}
		
	}

}