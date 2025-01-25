import java.util.Scanner;
public class ArithmeticSmallestLargest {
	public static void main(String[] args) {

	Scanner input = new Scanner(System.in);
	System.out.println("Enter first integer: ");
	int first = input.nextInt();

	System.out.println("Enter second integer: ");
	int second = input.nextInt();

	System.out.println("Enter third integer: ");
	int third = input.nextInt();

	int product = first * second * third;
	
	int firstSquare = first * first;

	int secondSquare = second * second;

	int thirdSquare = third * third;

	int average = (first + second + third) / 3;

	int smallest = 0;
	int greatest = 0;

	if ( first > second && first > third) {
		greatest = first;
	}
	else if ( first < second && first < third){
		smallest = first;
	}
	else if (second > first && second > third) {
		greatest = second;
	}
	else if (second < first  && second < third) {
		smallest = second;
	}
	else if (third > first && third > second) {
		greatest = third;
	}
	else {
		smallest = third;
	}

	System.out.printf("The product is %d%nThe first square is %d%nThe second square is %d%nThe third square is %d%nThe average is %d%nThe smallest number is %d%nThe largest number is %d%n", product, firstSquare, secondSquare, thirdSquare, average, smallest, greatest);

	}

}