public class SumOfASeries{
	public static void main(String[] args){

		System.out.printf("%s\t%s%n", "number", "Current series sum");

		int number = 1;
		long total = 0L;
		while(number <= 100){
			total += number;
			System.out.println(number + "\t" + total);
			number ++;
		}

		System.out.printf("%s\t%s%n", "number", "Current series product");
		int numbers = 1;
		long product = 1L;
		while(numbers <= 100){
			product *= numbers;
			System.out.println(numbers + "\t" + product);
			numbers ++;
		}

	}

}