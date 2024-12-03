import java.util.Scanner;
public class LagbajaSchoolScoreGrading{
	public static void main(String[] args){
		System.out.println("LAGBAJA GROUP OF SCHOOL, LAGOS STATE.\nWELCOME TO THE OFFICIAL GRADING WEBSITE");
		Scanner input = new Scanner(System.in);
		System.out.println("What is your name,teacher? ");
		String teacher = input.nextLine();

		int students = getStudentNumber(input, teacher);
		int subjects = getSubjects(input, teacher);
		
		int[][] studentGrade = new int[students][subjects];
		getScore(input, students, subjects, studentGrade);
		displayTableHeader(subjects);
		displayTableContent(studentGrade);
	}

	public static int getStudentNumber(Scanner input, String teacher){
		System.out.printf("Mr/Mrs/Miss %s, how many students do you want to grade? %n",teacher);
		int numberOfStudents = input.nextInt();
		return numberOfStudents;
	}
	public static int getSubjects(Scanner input, String teacher){
		System.out.printf("Mr/Mrs/Miss %s, how many subjects do you want to grade the students on? %n",teacher);
		int studentSubjects = input.nextInt();
		return studentSubjects;
	}
	public static void getScore(Scanner input, int students,int subjects, int[][] studentGrade){
		for(int row = 0; row < students; row++){
			for(int column = 0; column < subjects; column++){
				System.out.println("Enter a number between 1 - 100 as grade for subject ("+ (row + 1) +"), Student("+ (column + 1) +"):");
				studentGrade[row][column] = input.nextInt();
				while(studentGrade[row][column] < 0 || studentGrade[row][column] > 100){
					System.out.println("Invalid input!!!\nEnter a valid input: ");
					studentGrade[row][column] = input.nextInt();
				}
			}
		}
	}
	public static void displayTableHeader(int subjects){
		System.out.println("==========================================================================================");
		System.out.print("STUDENT \t");
		for(int i = 0; i < subjects; i++){
			System.out.print("SUB(" +( i + 1 )+ ") \t");
		}
		System.out.print("TOT \tAVE \tPOS ");
		System.out.println("\n==========================================================================================");
	}
	public static void displayTableContent(int[][] studentGrade){
		for (int column = 0; column < studentGrade[0].length; column++) {
			System.out.print("Student (" + (column + 1) + ")  \t");
        			for (int row = 0; row < studentGrade.length; row++) {
					System.out.print(studentGrade[row][column] + "\t");
				}
		System.out.println();
   		}			System.out.println("\n==========================================================================================");

	}
}