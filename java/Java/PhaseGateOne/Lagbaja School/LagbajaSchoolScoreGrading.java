import java.util.Scanner;
public class LagbajaSchoolScoreGrading{
	public static void main(String[] args){
		System.out.println("LAGBAJA GROUP OF SCHOOL, LAGOS STATE.\nWELCOME TO THE OFFICIAL GRADING WEBSITE");
		Scanner input = new Scanner(System.in);
		System.out.println("What is your name,teacher? ");
		String teacher = input.nextLine();

		int students = getStudentNumber(input, teacher);
	}

	public static int getStudentNumber(Scanner input, String teacher){
		System.out.printf("Mr/Mrs/Miss %s, how many students do you want to grade? %n",teacher);
		int numberOfStudents = input.nextInt();
		return numberOfStudents;
	}
}