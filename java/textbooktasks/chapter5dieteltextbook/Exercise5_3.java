package chapter5dieteltextbook;

public class Exercise5_3{
	public static void main(String[] args){
		int sum = 0;
		int count = 0;
		for(int i = 1; i < 100; i++){
			if(i % 2 != 0){
				sum += i;
				count ++;
			}
			System.out.printf("Sum of odd numbers between 1 and 99 is %d%n", sum);
		}

		double power = Math.pow(2.5,3);

		System.out.printf("The power of 2.5 raised by 3 is %.2f%n", power);
		int i = 1;
		while(i <= 20){
			if(i % 5 == 0){
				System.out.println("Counter i is " + i + "\t");
			}
				i++;
		}

		for(int k = 1; k <= 20; k++){
			if(k % 5 == 0){
				System.out.println("Counter k is " + k + "\t");
			}
		}
	}
}