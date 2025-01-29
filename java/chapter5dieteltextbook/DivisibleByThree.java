package Chapter5DietelTextbook;

public class DivisibleByThree{
	public static void main(String[] args){
		
		int number = 1;
		while(number <= 30){
			if (number % 3 == 0) {
				System.out.println(number + " is divisible by 3");
			}
			else{
				System.out.println(number + " is not divisible by 3");

			}
			number ++;
		}
	}

}