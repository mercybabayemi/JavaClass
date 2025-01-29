package phasegateone.PizzaOrderS;

import java.util.Scanner;

public class PizzaOrder{
	
	public static void main(String[] args){
		System.out.println("Welcome to Iya Moses Pizza joint,Ajegunle.");
		Scanner input = new Scanner(System.in);
		System.out.println("What is your name, customer? ");
		String customerName = input.nextLine();
	
		String[] pizzaType = {"Sapa size","Small money","Big boys","Odogwu"};
		int[] numberOfSlices = {4,6,8,12};
		int[] pricePerBox = {2500, 2900, 4000, 5200};

		int sliceToConsider = numberOfPeopleDeterminant(input, customerName);
		int pizzaTypeChoosing = getPizzaTypeChoice(input,pizzaType);

		System.out.println(getPizzaType(input, pizzaType, pizzaTypeChoosing));
		int numberedBox = getNumberOfPizzaBoxToBuy(sliceToConsider, numberOfSlices, pizzaTypeChoosing);
		System.out.println(getLeftOver(sliceToConsider, numberOfSlices, pizzaTypeChoosing));
		System.out.println(getPrice(pricePerBox, pizzaTypeChoosing, numberedBox));
	}

	public static int numberOfPeopleDeterminant(Scanner input, String customerName){
		System.out.printf("%s ,how many people are coming to your party? %n",customerName);
		int numberOfPeople = input.nextInt();
		
		while(numberOfPeople <= 0){
			System.out.print("Not a valid input, please enter a valid number.");	
			System.out.println("How many people are coming to your party? ");
			numberOfPeople = input.nextInt();
		}
		return numberOfPeople;
		
	}

	public static int getPizzaTypeChoice(Scanner input, String[] pizzaType){
		System.out.println("What size of pizza type do you want?\nEnter the number value\n1. Sapa size = 4 slices\n2. Small money = 6 slices\n3. Big boys = 8 slices\n4. Odogwu = 12 slices ");
		int pizzaTypeChoosing = input.nextInt();
		return pizzaTypeChoosing;

	}

	public static String getPizzaType(Scanner input, String[] pizzaType, int pizzaTypeChoosing){
		String pizzaChoice = pizzaType[pizzaTypeChoosing - 1];
		return "Pizza type = " + pizzaChoice;
	}

	public static int getNumberOfPizzaBoxToBuy(int sliceToConsider, int[] numberOfSlices, int pizzaTypeChoosing){
		int numberOfBox = (int) Math.ceil((double) sliceToConsider / numberOfSlices[pizzaTypeChoosing - 1]);
		System.out.printf("Number of pizza boxes to buy is %d%n",numberOfBox);
		return numberOfBox;
	}

	public static String getLeftOver(int sliceToConsider, int[] numberOfSlices, int pizzaTypeChoosing){
		int leftOver = sliceToConsider % numberOfSlices[pizzaTypeChoosing - 1];
		return "Number of slices leftover is " + leftOver;
	}
	
	public static String getPrice(int[] pricePerBox, int pizzaTypeChoosing, int numberedBox){
		System.out.println("Price per box =" + pricePerBox[pizzaTypeChoosing - 1]);
		int priceToPay = pricePerBox[pizzaTypeChoosing - 1] * numberedBox;
		return "Please, pay " + priceToPay + "Naira for your pizza.";
	}
	
}