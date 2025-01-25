import java.util.Scanner;
public class WorldPopulationGrowth{
	public static void main(String[] args){
		
		Scanner input = new Scanner(System.in);

		System.out.println("Enter current world population : ");

		long currentWorldPopulation = input.nextLong();

		System.out.println("Enter the current annual growthrate : ");

		double annualGrowthRate = input.nextDouble();

		double growthFactor = 1 + annualGrowthRate;

		int numberOfYears = 75;
		
		long previousPopulation = 8091000000L;

		System.out.printf("%s%40s%40s%n","Year", "Anticipated World Population", "Numerical Increase");

		for(int year = 1; year <= numberOfYears; year++){
			double calculatedPopulation = currentWorldPopulation * Math.pow(growthFactor, year);
			System.out.printf("%2d%40.2f%40.2f%n", year, calculatedPopulation, calculatedPopulation - previousPopulation);

			previousPopulation = (long) calculatedPopulation;
		}

		long doubledPopulation = currentWorldPopulation * 2;

		double yearOfDoubledPopulation = Math.log( doubledPopulation / currentWorldPopulation)/ Math.log( growthFactor );

		System.out.printf("The calculated year of doubled current population is %.2f", yearOfDoubledPopulation);

	}
}