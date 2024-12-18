import java.util.Scanner;
import java.util.ArrayList;
public class DiaryMain{
	public static void main(String[] args){
		ArrayList<Diary> diaries = new ArrayList<>();

		Scanner input = new Scanner(System.in);
		System.out.println("Do you want to create a new diary ?\n(Enter yes or no): ");
		String diaryDeterminant = input.nextLine();

		while(diaryDeterminant.equalsIgnoreCase("yes")) {
			System.out.println("Welcome To Your Diary App!!!\nWhat do you want to do?\n1. Create new diary\n2. View diary entries\n3. Update a diary entry\n4. Remove a diary entry\n5. Exit\nEnter numerical value: ");
            		int response = input.nextInt();
            		input.nextLine();
			
		}

	}

	public static void addDiary(Scanner input, ArrayList<Diary> diaries){
        	System.out.print("Enter diary ID: ");
       		int diaryId = input.nextInt();
        	input.nextLine();
        	System.out.print("Enter diary date: ");
        	String diaryDate = input.nextLine();
       		System.out.print("Enter diary content: ");
       		String diaryContent = input.nextLine();

		Diary entry = new Diary(diaryId, diaryDate, diaryContent);

        	diaries.add(entry);
        	System.out.println("Diary entry created successfully!");

        	System.out.print("Do you want to lock the diary?\n(Enter yes or no): ");
        	String lockResponse = input.nextLine();
        	if (lockResponse.equalsIgnoreCase("yes")) {
            		entry.lockDiary();
            		System.out.println("The diary is now locked.");
        	} else {
            		entry.unlockDiary();
            		System.out.println("The diary is now unlocked.");
        	}
	}

}