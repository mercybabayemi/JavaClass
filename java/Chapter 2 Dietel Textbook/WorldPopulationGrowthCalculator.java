public class WorldPopulationGrowthCalculator{
	public static void main(String[] args){

	long currentWorldPopulation = 8100000000L;
	double annualGrowthRate = 0.87 ;

	double yearOnePopulation = currentWorldPopulation * (1 + annualGrowthRate);

	double yearTwoPopulation = currentWorldPopulation * Math.pow((1 + annualGrowthRate), 2);

	double yearThreePopulation = currentWorldPopulation * Math.pow((1 + annualGrowthRate), 3);

	double yearFourPopulation = currentWorldPopulation * Math.pow((1 + annualGrowthRate), 4);

	double yearFivePopulation = currentWorldPopulation * Math.pow((1 + annualGrowthRate), 5);

	System.out.printf("The calculated world population for year one is %.2f%nThe calculated world population for year two is %.2f%nThe calculated world population for year three is %.2f%nThe calculated world population for year four is %.2f%nThe calculated world population for year five is %.2f%n", yearOnePopulation, yearTwoPopulation, yearThreePopulation, yearFourPopulation, yearFivePopulation);
	}
}