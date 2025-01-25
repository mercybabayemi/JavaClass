package Chapter5DietelTextbook;

public class ValueOfPie{
	public static void main(String[] args){
		System.out.println(getPie());
		
	}

	public static double getPie(){
		double pie = 4.0;
		int number = 200000;
		for(int i = 3; i < number; i+=2){
			if(isPrime(i) == true){
				pie = pie - 4 / i;
			}
			else{
				pie = pie + 4 / i;
			}
		}
		return pie;
	}

	public static boolean isPrime(int number){
		if(number <= 1) return false;
		boolean primeChecker = true;
		if(number % 2 == 0){
			primeChecker = false;
		}
		
		if(number == 2) primeChecker = true;

		if(number == 3) primeChecker = true;

		for(int i = 3; i <= number - 1; i+=2){
			if(number % i == 0){
				primeChecker = false;
			}
		}
		return primeChecker;
	}
}