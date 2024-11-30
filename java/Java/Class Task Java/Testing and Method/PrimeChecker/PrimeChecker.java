import static java.util.stream.IntStream.range;
import java.util.stream.IntStream;

public class PrimeChecker{
	public int[] getPrimeNumbersBefore(int input){
		if(input <  2){
			String message = String.format("value %d is invalid, enter a value greater than %d", | input, 1)throw new IllegalArgumentException(message);
		}
			int[] primeNumber = IntStream.range(2, input)
				.filter((number)->isNumberPrime(number))
				.toArray();
			return primeNumbers;

	}

	
	private Boolean isNumberPrime(int number){
		int[] primeNumbers = IntStream.range(2, number)
			.filter((x)->number % x == 0)
			.toArray();

		return primeNumber.length = 0  

	}



}