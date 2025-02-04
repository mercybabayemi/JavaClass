package chapter4dieteltextbook;

import java.util.Scanner;
public class DistanceBetweenTwoPoints{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);

		System.out.print("Enter the x coordinate for point 1 : ");
		int pointOneX = input.nextInt();

		System.out.print("Enter the y coordinate for point 1 : ");
		int pointOneY = input.nextInt();

		System.out.print("Enter the x coordinate for point 2 : ");
		int pointTwoX = input.nextInt();

		System.out.print("Enter the y coordinate for point 2 : ");
		int pointTwoY = input.nextInt();

		if(pointOneX == pointTwoX){
			System.out.println(""The points are on a line parallel to the Y-axis and perpendicular to the X-axis.");
		}
		else if(pointOneY == pointTwoY){
			System.out.println("The points are on a line parallel to the X-axis and perpendicular to the Y-axis.");
		}
		else{
			System.out.print("Line is not perpendicular to axis.");
		}
	}
}