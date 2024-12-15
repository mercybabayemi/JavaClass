import java.util.Scanner;
import java.util.Arrays;
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
		displayTableContent(studentGrade, subjects, students);
		System.out.println("SUBJECT SUMMARY");
		getSubjectCalculated(studentGrade, subjects, students);
		getOverallCalculaion(studentGrade, subjects, students) ;
	}

	public static int getStudentNumber(Scanner input, String teacher){
		System.out.printf("Mr/Mrs/Miss %s, how many students do you have? %n",teacher);
		int numberOfStudents = input.nextInt();
		System.out.println("Saving>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>\nSaved successfully.");
		return numberOfStudents;
	}
	public static int getSubjects(Scanner input, String teacher){
		System.out.printf("Mr/Mrs/Miss %s, how many subjects do you want to grade the students on? %n",teacher);
		int studentSubjects = input.nextInt();
		System.out.println("Saving>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>\nSaved successfully.");
		return studentSubjects;
	}
	public static void getScore(Scanner input, int students,int subjects, int[][] studentGrade){
		for(int row = 0; row < students; row++){
			for(int column = 0; column < subjects; column++){
				System.out.println("Enter a number between 1 - 100 as score for student ("+ (row + 1) +"), Subject("+ (column + 1) +"):");
				studentGrade[row][column] = input.nextInt();
				while(studentGrade[row][column] < 0 || studentGrade[row][column] > 100){
					System.out.println("Invalid input!!!\nEnter a valid input: ");
					studentGrade[row][column] = input.nextInt();
				}
				System.out.println("Saving>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>\nSaved successfully.");
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
	public static void displayTableContent(int[][] studentGrade, int subjects, int students){
		int subjectTotal = 0;
		int averageSubjectScore = 0;
		for (int row = 0; row < students; row++) {
			System.out.print("Student (" + (row + 1) + ")  \t");
        			for (int column = 0; column < subjects; column++) {
					System.out.print(studentGrade[row][column] + "\t");
					averageSubjectScore = subjectTotal / students;
					subjectTotal += studentGrade[row][column];

				}
		System.out.print(subjectTotal + "\t"+  averageSubjectScore + "\t");
		System.out.println();
   		}			System.out.println("\n==========================================================================================");

	}


	public static void getSubjectCalculated(int[][] studentGrade, int subjects,int students) {
   		int subjectTotal = 0;
		int averageSubjectScore = 0;
    		int lowestScore = Integer.MAX_VALUE;
    		String lowestIndex = "";
		int highestScore = -1;
    		String highestIndex = "";
		int passMark = 50;

		for (int column = 0; column < subjects; column++) {    		
    		int passCount = 0;
	  	int failCount = 0;
        	System.out.print("Subject (" + (column + 1) + ") \t");
        		for (int row = 0; row < students; row++) {
            			subjectTotal += studentGrade[row][column];
				if (studentGrade[row][column] > highestScore) {
               				highestScore = studentGrade[row][column];
                			highestIndex = "Student (" + (row + 1) + ")";
				}
				if (studentGrade[row][column] < lowestScore) {
                			lowestScore = studentGrade[row][column];
                			lowestIndex = "Student (" + (row + 1) + ")";
				}
				if (studentGrade[row][column] >= passMark) {
               				passCount += 1;
           			} else if(studentGrade[row][column] <= passMark){
               			 	failCount += 1;
          			 }

        		}
        		System.out.println();
			System.out.printf("Highest scoring student in Subject (%d) is: %s scoring %d\n", (column + 1), highestIndex, highestScore);
			System.out.printf("Lowest scoring student in Subject (%d) is: %s scoring %d\n", (column + 1), lowestIndex, lowestScore);
			System.out.printf("Total scores in Subject (%d) is: %d\n", (column + 1), subjectTotal);
			averageSubjectScore = subjectTotal / students;
			System.out.printf("Average score for Subject (%d) is: %d\n", (column + 1), averageSubjectScore);
			System.out.printf("Pass count for Subject (%d) is: %d\n", (column + 1), passCount);
        		System.out.printf("Fail count for Subject (%d) is: %d\n", (column + 1), failCount);

    		}
	}

	public static void getOverallCalculaion(int[][] studentGrade, int subjects, int students) {
   		int overallHighestScore = -1;
    		String overallHighestIndex = "";
   		int overallLowestScore = Integer.MAX_VALUE;
    		String overallLowestIndex = "";
    		int classTotalScore = 0;		
		int passMark = 50;
    		int passCount = 0;
    		int failCount = 0;



    		for (int row = 0; row < students; row++) {
		passCount  = 0;
    		failCount = 0;
        		for (int column = 0; column < subjects; column++) {
            			int score = studentGrade[row][column];
            			classTotalScore += score;

           			if (score > overallHighestScore) {
                			overallHighestScore = score;
                			overallHighestIndex = "Student (" + (row + 1) + ") in Subject (" + (column + 1) + ")";
            			}

            			if (score < overallLowestScore) {
                			overallLowestScore = score;
               				overallLowestIndex = "Student (" + (row + 1) + ") in Subject (" + (column + 1) + ")";
            			}

            			if (score >= passMark) {
                			passCount += 1;
            			} else if (score <= passMark) {
                			failCount += 1;
				}
        		}
    		}

    		int classAverageScore = classTotalScore / (students * subjects);
		System.out.println("\n==========================================================================================");
		System.out.printf("The hardest subject is Subject %n");
		System.out.printf("The easiest subject is Subject %n");
		System.out.printf("The overall highest score is scored by %s scoring %d%n", overallHighestIndex, overallHighestScore);
		System.out.printf("The overall lowest score is scored by %s scoring %d%n", overallLowestIndex, overallLowestScore);		

    		System.out.println("\n==========================================================================================");
    		System.out.println();
    		System.out.println();
    		System.out.println("CLASS SUMMARY");

    		System.out.println("\n==========================================================================================");
    		System.out.printf("Best Graduating Student is: %s scoring %d\n", overallHighestIndex, overallHighestScore);
		System.out.println();
		System.out.println("\n!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
    		System.out.printf("Worst Graduating Student is: %s scoring %d\n", overallLowestIndex, overallLowestScore);
		System.out.println("\n!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
		System.out.println();
    		System.out.println("\n==========================================================================================");
    		System.out.printf("Class total score is: %d\n", classTotalScore);
    		System.out.printf("Class Average score is: %d\n", classAverageScore);
    		System.out.println("\n==========================================================================================");
	}


}