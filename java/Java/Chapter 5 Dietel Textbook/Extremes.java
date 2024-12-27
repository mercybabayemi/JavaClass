import java.util.Scanner;
public class Extremes{
	public static void main(String[] args){

		Scanner input = new Scanner(System.in);

		System.out.print("How many values should the application ask the user to input? ");

		int number = input.nextInt();

		int[] numbers = new int[number];

		System.out.print("Enter the value for each number. Enter end of line indicator to end input(ctrl d): ");

		for(int i = 0; i < number; i++){
			if(input.hasNextInt()){
				numbers[i] = input.nextInt();
			}
			else{
				System.out.println("Invalid input!!\nTry again: ");
				input.next();
				i --;
			}
		}

		int maximum = numbers[0];
		int minimum = numbers[0];

		for(int index: numbers){
			if(index > maximum){
				maximum = index;
			}
			else if(index < minimum){
				minimum = index;
			}
		}
		System.out.println("Minimum value is " + minimum);
		System.out.print("Maximum value is " + maximum);

}
}