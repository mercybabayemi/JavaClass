public class WorldPopulationGrowthCalculator{
	public static void main(String[] args){

	long currentWorldPopulation = 8100000000L;
	double annualGrowthRate = 1.06 ;
	double percentageAnnualGrowthRate = annualGrowthRate / 100;

	double yearOnePopulation = Math.pow(currentWorldPopulation * (1 + percentageAnnualGrowthRate), 1);

	double yearTwoPopulation = Math.pow(currentWorldPopulation * (1 + percentageAnnualGrowthRate), 2);

	double yearThreePopulation = Math.pow(currentWorldPopulation * (1 + percentageAnnualGrowthRate), 3);

	double yearFourPopulation = Math.pow(currentWorldPopulation * (1 + percentageAnnualGrowthRate), 4);

	double yearFivePopulation = Math.pow(currentWorldPopulation * (1 + percentageAnnualGrowthRate), 5);

	System.out.printf("The calculated world population for year one is %.2f%nThe calculated world population for year two is %.2f%nThe calculated world population for year three is %.2f%nThe calculated world population for year four is %.2f%nThe calculated world population for year five is %.2f%n", yearOnePopulation, yearTwoPopulation, yearThreePopulation, yearFourPopulation, yearFivePopulation);
	}
}