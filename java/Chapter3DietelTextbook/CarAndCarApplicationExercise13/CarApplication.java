package Chapter3DietelTextbook.CarAndCarApplicationExercise13;

public class CarApplication{
	public static void main(String[] args){

		Car firstCar = new Car("Toyota Corolla", "2011", 9000000.0);

		Car secondCar = new Car("Mercedes Benz", "2020", 56000000.0);

		System.out.printf("The price of %s manufactured in year %s is %.2f%n", firstCar.getModel(), firstCar.getYear(), firstCar.getPrice());

		System.out.printf("The price of %s manufactured in year %s is %.2f%n", secondCar.getModel(), secondCar.getYear(), secondCar.getPrice());

		double discount = 5;
		System.out.printf("The price of %s manufactured in year %s at a discounted rate of %.2f is %.2f%n", firstCar.getModel(), firstCar.getYear(), discount / 100, firstCar.getCalculatedDiscountPrice(discount));

		discount = 7;
		System.out.printf("The price of %s manufactured in year %s at a discounted rate of %.2f is %.2f%n", secondCar.getModel(), secondCar.getYear(), discount / 100, secondCar.getCalculatedDiscountPrice(discount));
	}
}