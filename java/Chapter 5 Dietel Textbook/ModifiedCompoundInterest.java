public class ModifiedCompoundInterest{
	public static void main(String[] args){
		double principal = 1000.0;
		int year = 1;

		System.out.printf("%s%20s%20s%n", "Year", "Amount on deposit", "Rate");
		
		while(year <= 10){
			for(int rate = 5; rate <= 10; ++rate){
				double rateCalculated = rate / 100.0;

				double amount = principal * Math.pow(1.0 + rateCalculated, year);
				System.out.printf("%4d%,20.2f%20.2f%n", year, amount, rateCalculated);
			}
			year++;
				System.out.println();
		}
		
	}

}