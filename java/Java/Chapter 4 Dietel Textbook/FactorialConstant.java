public class FactorialConstant{

	public static void main(String[] args){
	
		int product = 1;

		int sum = 1; 
		
		for(int i = 1; i <= 7; i++){

			sum += (1/(product *= i));

		}

		System.out.print(sum);
		
	}
}
