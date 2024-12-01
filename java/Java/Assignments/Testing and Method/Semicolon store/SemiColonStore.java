import java.util.Date;
import java.util.Scanner;
import java.util.ArrayList;
public class SemiColonStore{
	
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.println("What is the customer's name? ");
		String customerName = input.nextLine();


		ArrayList<String> products = new ArrayList<>();
		ArrayList<Integer> productsNumber = new ArrayList<>();
		ArrayList<Integer> unitsPrice = new ArrayList<>();

		displayQuestion(input,products,productsNumber,unitsPrice,customerName);
	}

	public static void displayQuestion(Scanner input, ArrayList<String> products,ArrayList<Integer> productsNumber, ArrayList<Integer> unitsPrice, String customerName){
		System.out.println("What did the user buy?\nEnter a word: ");
		String product = input.nextLine();
		products.add(product);

		System.out.println("How many pieces?\nEnter a number: ");
		int productNumber = input.nextInt();
		productsNumber.add(productNumber);

		System.out.println("How much per unit?\nEnter a number: ");
		int unitPrice = input.nextInt();
		unitsPrice.add(unitPrice);

		input.nextLine();
		System.out.println("Add more items?\nEnter yes or no: ");
		String itemConfirmation = input.nextLine();
		
		if(itemConfirmation.equalsIgnoreCase("yes")) {
			displayQuestion(input,products,productsNumber,unitsPrice,customerName);
		}
		else{
			System.out.println("What is cashier's name? ");
			String cashiersName = input.nextLine();

			System.out.println("How much discount will he get?\nEnter a number: ");
			double discount = input.nextDouble();
			
			majorDisplay();
			extensionDisplay(cashiersName,customerName);
			getCalculation(input, products, productsNumber, unitsPrice, discount, cashiersName, customerName);
		}
	}
	
	public static void getCalculation( Scanner input,ArrayList<String> products, ArrayList<Integer> productsNumber, ArrayList<Integer> unitsPrice, double discount, String cashiersName, String customerName){
		
		double subTotal = 0;
		System.out.println("\tITEM \tQTY \tPRICE \tTOTAL(NGN)");
		System.out.println("---------------------------------------------------------------");
		for(int index = 0; index < products.size(); index++){
			System.out.printf("\t%s \t%d \t%d \t%d%n", products.get(index), productsNumber.get(index), unitsPrice.get(index), unitsPrice.get(index) * productsNumber.get(index));
			subTotal += unitsPrice.get(index) * productsNumber.get(index);
		}
		System.out.println("---------------------------------------------------------------");
		System.out.printf("\tSub Total:\t%.2f%n", subTotal);
		double discountCalculated = subTotal * discount / 100;
		System.out.printf("\tDiscount:\t%.2f%n", discountCalculated);
		double vat = subTotal * 17.50 / 100;
		System.out.printf("\tVAT @ 17.50:\t%.2f%n", vat);
		double billTotal = subTotal - discountCalculated + vat;
		System.out.println("=============================================================");
		System.out.printf("\tBill Total:\t%.2f%n", billTotal);
		System.out.println("=============================================================");
		System.out.println("THIS IS NOT A RECEIPT, KINDLY PAY " + billTotal);
		System.out.println("=============================================================");
		
		System.out.println("How much did the customer give to you? ");
		double amountPaid = input.nextDouble();
		
		if(amountPaid < billTotal){
			System.out.println("Amount paid is less than bill total, try again!!");
			System.out.println("How much did the customer give to you? ");
			amountPaid = input.nextDouble();
		}
		getreceipt(input, products, productsNumber, unitsPrice, discount, amountPaid, cashiersName, customerName);

	}

		public static void getreceipt( Scanner input,ArrayList<String> products, ArrayList<Integer> productsNumber, ArrayList<Integer> unitsPrice, double discount, double amountPaid, String cashiersName, String customerName){
		majorDisplay();
		extensionDisplay(cashiersName,customerName);
		double subTotal = 0;
		System.out.println("\tITEM \tQTY \tPRICE \tTOTAL(NGN)");
		System.out.println("---------------------------------------------------------------");
		for(int index = 0; index < products.size(); index++){
			System.out.printf("\t%s \t%d \t%d \t%d%n", products.get(index), productsNumber.get(index), unitsPrice.get(index), unitsPrice.get(index) * productsNumber.get(index));
			subTotal += unitsPrice.get(index) * productsNumber.get(index);
		}
		System.out.println("---------------------------------------------------------------");
		System.out.printf("\tSub Total:\t%.2f%n", subTotal);
		double discountCalculated = subTotal * discount / 100;
		System.out.printf("\tDiscount:\t%.2f%n", discountCalculated);
		double vat = subTotal * 17.50 / 100;
		System.out.printf("\tVAT @ 17.50:\t%.2f%n", vat);
		double billTotal = subTotal - discountCalculated + vat;
		System.out.println("=============================================================");
		System.out.printf("\tBill Total:\t%.2f%n", billTotal);
		System.out.println("=============================================================");
		
		double balance = amountPaid - billTotal;
		System.out.printf("\tBalance:\t%.2f%n", balance);
		System.out.println("=============================================================");
		System.out.println("\tTHANK YOU FOR YOUR PATRONAGE");
		System.out.println("=============================================================");

	}



	public static void majorDisplay(){
		System.out.println("SEMICOLON STORES");
		System.out.println("MAIN BRANCH");	
		System.out.println("LOCATION: 312, HERBERT MACAULAY WAY, SABO, YABA, LAGOS STATE.");
		System.out.println("TEL : 03293828343");	
	}

	public static void extensionDisplay(String cashiersName,String customerName){
		Date now = new Date();
		System.out.println("Date : " + now);
		System.out.println("Cashier: " + cashiersName);
		System.out.println("Customer's Name: " + customerName);
	System.out.println("================================================================");
	}


}