package chapter5dieteltextbook;

import java.util.Scanner;
public class StudentGrade{
	public static void main(String[] args){

		int countA = 0;
		int countB = 0;
		int countC = 0;
		int countNone = 0;

		Scanner input = new Scanner(System.in);
		System.out.println("Enter a grade(A/B/C) or end of line indicator to exits: ");
		
		while(input.hasNext()){
			String grade = input.nextLine();

			System.out.println("What is student name? ");
			String name = input.nextLine();
			
			switch(grade){
				case "A":
					System.out.println(name + " has grade " + grade);
					++countA;
					break;
				case "B":
					System.out.println(name + " has grade " + grade);
					++countB;
					break;
				case "C":
					System.out.println(name + " has grade " + grade);
					++countC;
					break;
				case "a":
					System.out.println(name + " has grade " + grade);
					++countA;
					break;
				case "b":
					System.out.println(name + " has grade " + grade);
					++countB;
					break;
				case "c":
					System.out.println(name + " has grade " + grade);
					++countC;
					break;
				default:
					System.out.println(name + " has no grade!");
					++countNone;
			}
		}

		System.out.println("Grade A count : " + countA);
		System.out.println("Grade B count : " + countB);
		System.out.println("Grade C count : " + countC);
		System.out.println("No valid grade count: " + countNone);
	}
}