import java.util.Scanner;
public class PythagoreanTriples{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the number limit for all sides not larger than 500: ");
		int sidesLimit = input.nextInt();
		if(sidesLimit > 500){
			System.out.println("Input should be less than or equal to 500\nEnter a new value: ");
			sidesLimit = input.nextInt();
		}

		for(int side1 = 0; side1 < sidesLimit; side1++){
			for(int side2 = 0; side2 < sidesLimit; side2++){
				for(int side3 = 0; side3 < sidesLimit; side3++){
					if(((side1 * side1) + (side2 * side2)) == (side3 * side3)){
						System.out.printf("side1 * side1\t+\tside2 * side2\t=\tside3 * side3%n%d*%d\t+\t%d*%d\t=\t%d*%d%n%d\t+\t%d\t=\t%d%n", side1, side1, side2, side2, side3, side3, side1 * side1, side2 * side2, side3 * side3);
					}
				}
			}
		}
	}
}