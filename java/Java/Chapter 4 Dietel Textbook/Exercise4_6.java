public class Exercise4_6{
	public static void main(String[] args){
		int sum = 0;
		int x = 1;
		while(x <= 10){
			sum += x;
			System.out.print("The sum is : " + sum);
			x++;
		}

		int product = 5;
		int y = 5;
		product *= y++;
		System.out.print(product);
	}
}
