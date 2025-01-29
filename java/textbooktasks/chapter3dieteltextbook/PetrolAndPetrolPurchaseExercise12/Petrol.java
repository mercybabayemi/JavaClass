package chapter3dieteltextbook.PetrolAndPetrolPurchaseExercise12;

public class Petrol{
	public static void main(String[] args){
		
		PetrolPurchase customer1 = new PetrolPurchase("Sango Otta", "Diesel", 5 , 1250.4, 8);
		
		PetrolPurchase customer2 = new PetrolPurchase("Abule Egba", "Kerosene", 21, 1000.25, 6);
		
		PetrolPurchase customer3 = new PetrolPurchase("Lagos Island", "Petrol", 30, 1450.56, 102);

		System.out.printf("The price of %s in %s is %.2f with a discount amount of %.2f. If we purchase %d liters, our calculated amount will be %.2f%n", customer1.getPetrolType(), customer1.getStationLocation(), customer1.getPricePerLiter(), customer1.getPercentageDiscount(), customer1.getQuantityInLiters(), customer1.getPurchaseAmount());

		System.out.printf("The price of %s in %s is %.2f with a discount amount of %.2f. If we purchase %d liters, our calculated amount will be %.2f%n", customer2.getPetrolType(), customer2.getStationLocation(), customer2.getPricePerLiter(), customer2.getPercentageDiscount(), customer2.getQuantityInLiters(), customer2.getPurchaseAmount());

		System.out.printf("The price of %s in %s is %.2f with a discount amount of %.2f. If we purchase %d liters, our calculated amount will be %.2f%n", customer3.getPetrolType(), customer3.getStationLocation(), customer3.getPricePerLiter(), customer3.getPercentageDiscount(), customer3.getQuantityInLiters(), customer3.getPurchaseAmount());

		customer3.setPercentageDiscount(16);

		System.out.printf("The price of %s in %s is %.2f with a discount amount of %.2f. If we purchase %d liters, our calculated amount will be %.2f%n", customer3.getPetrolType(), customer3.getStationLocation(), customer3.getPricePerLiter(), customer3.getPercentageDiscount(), customer3.getQuantityInLiters(), customer3.getPurchaseAmount());

	}
}