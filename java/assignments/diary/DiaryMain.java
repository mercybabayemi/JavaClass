package Assignments.Diary;

import java.util.Scanner;
import java.util.ArrayList;
public class DiaryMain{
	public static void main(String[] args){
		ArrayList<Diary> diaries = new ArrayList<>();

		Scanner input = new Scanner(System.in);
		System.out.println("Do you want to create a new diary ?\n(Enter yes or no): ");
		String diaryDeterminant = input.nextLine();

		while(diaryDeterminant.equalsIgnoreCase("yes")) {
			System.out.println("Welcome To Your Diary App!!!\nWhat do you want to do?\n1. Add new diary\n2. View diary entries\n3. Update a diary entry\n4. Delete a diary entry\n5. Exit\nEnter numerical value: ");
            		int response = input.nextInt();
            		input.nextLine();
			
			switch(response){
				case 1:
					addDiary(input,diaries);
					break;
				case 2:
					viewDiaries(diaries);
					break;
				case 3:
					updateDiary(input,diaries);
					break;
				case 4:
					deleteDiary(input, diaries);
					break;
				case 5:
					System.out.println("Exiting>>>>");
					break;
				default:
					System.out.println("Invalid choice!!!\nPlease try again and enter right value: ");
					response = input.nextInt();
            				input.nextLine();
			}

			System.out.println("Do you want to create a new diary ?\n(Enter yes or no): ");
			diaryDeterminant = input.nextLine();
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
    	public static void viewDiaries(ArrayList<Diary> diaries) {
        	System.out.println("Displaying all diary entries:");
        	if (diaries.isEmpty()) {
            		System.out.println("No diary entries found.");
        	} else {
            		for (Diary entry : diaries) {
                		System.out.printf("Diary ID: %d%nDate: %s%nContent: %s%nLocked: %b%n", entry.getDiaryId(), entry.getDiaryDate(), entry.getDiaryContent(), entry.isLocked());
            		}
        	}
    	}

	public static void updateDiary(Scanner input, ArrayList<Diary> diaries){
        	System.out.println("Enter the diary ID to update: ");
        	int diaryId = input.nextInt();
        	input.nextLine();

        	Diary diaryToUpdate = null;
        	for (Diary entry : diaries) {
           		if (entry.getDiaryId() == diaryId) {
                		diaryToUpdate = entry;
				break;
           		}
        	}
        	
		if (diaryToUpdate == null) {
            		System.out.println("Diary entry not found!");
        	}
		else {
			System.out.println("Enter new diary Id: ");
            		int newId = input.nextInt();
			input.nextLine();
            		System.out.println("Enter new diary date: ");
            		String newDate = input.nextLine();
            		System.out.print("Enter new diary content: ");
            		String newContent = input.nextLine();
			
			diaryToUpdate.updateDiaryId(newId);
            		diaryToUpdate.updateDiaryDate(newDate);
            		diaryToUpdate.updateDiaryContent(newContent);
            		System.out.println("Diary entry updated successfully!");
        	}
    	}
	
	public static void deleteDiary(Scanner input, ArrayList<Diary> diaries){
        	System.out.print("Enter the diary ID to remove: ");
        	int diaryId = input.nextInt();
        	input.nextLine();
        	Diary diaryToRemove = null;
        	for (Diary entry : diaries) {
            		if (entry.getDiaryId() == diaryId) {
                		diaryToRemove = entry;
                		break;
            		}
        	}

        	if (diaryToRemove == null) {
            		System.out.println("Diary entry not found!");
        	} 
		else {
            		diaries.remove(diaryToRemove);
            		System.out.println("Diary entry removed successfully!");
        	}
    	}

}