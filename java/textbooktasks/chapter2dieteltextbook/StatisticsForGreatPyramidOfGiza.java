package chapter2dieteltextbook;

public class StatisticsForGreatPyramidOfGiza{
	public static void main(String[]args){

	double numOfStones = 2300000;
	double numOfWeight = 6000000;
	double numOfYears = 20;
	double numOfWorkers = 100000;
	double numOfWorkingHours = 12;
	double numOfWorkingDays = 313;
	double length = 230;
	double height = 147;

	double averageWeight = numOfWeight * numOfStones;
	double volume = Math.sqrt(3) / 2 * (length * length) * height;
	double yearlyConstructionRate = volume / numOfYears;
	double dailyConstructionRate = yearlyConstructionRate / numOfWorkingDays;
	double hourlyConstructionRate = dailyConstructionRate / numOfWorkingHours;
	double minuteConstructionRate = hourlyConstructionRate / 60;

	System.out.printf("The number of stones used is %.2f%nEstimated average weight of the pyramid is %.2f%nEstimate of how much of the pyramid built each year is %.2f%nEstimate of how much of the pyramid built each day is %.2f%nEstimate of how much of the pyramid built each hour is %.2f%nEstimate of how much of the pyramid built each minute is %.2f%n", numOfStones, averageWeight, yearlyConstructionRate, dailyConstructionRate, hourlyConstructionRate, minuteConstructionRate);

}
}