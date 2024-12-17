import java.util.Scanner;
import java.util.ArrayList;
public class DiaryMain{
	public static void main(String[] args){
		ArrayList<Diary> diaries = new ArrayList<>();

		Scanner input = new Scanner(System.in);
		System.out.println("Do you want to create a new diary ?\nEnter yes or no: ");
		String diaryDeterminant = input.nextLine();

		System.out.println("Welcome To Your Diary App!!\nWhat do you want to do?\n1. Create new diary\n2. View diary entries\n3. Exit\nEnter numerical value: ");
		int response = input.nextInt();

		switch(response){
			case 1:
				System.out.println("Creating diary>>>>>");						
				System.out.println("Enter diary Id: ");
				int diaryId = input.nextInt();
				input.nextLine();
				System.out.println("Enter diary date(dd-mm-yyyy): ");
				String diaryDate = input.nextLine();
				System.out.println("Enter diary content: ");
				String diaryContent = input.nextLine();

				Diary entry = new Diary(diaryId, diaryDate, DiaryContent);
				entry.addEntry();
				System.out.println("Diary entry created successfully!");

				System.out.println("Do you want to lock diary? (Enter yes/no): ");
				String lockResponse = input.nextLine();
				if(lockResponse.equalsIgnoreCase("yes")){
					entry.lockDiary();
					System.out.println("The diary is now locked.");
				}
				else{
					entry.unlockDiary();
					System.out.println("The diary is now unlocked.")
				}
				break;
			case 2:
				System.out.println("Displaying all diary entries:");
                    		for(Diary entry : diaries){
                       		System.out.printf("Diary ID: %d, Date: %s, Content: %s, Locked: %b\n", entry.getDiaryId(), entry.getDiaryDate(), entry.getDiaryContent(), entry.isLocked());
                   		 }
                    		break;

			case 3:
				System.out.println("Exiting>>>>>>\nWe hope to see you back soon.");
                   		input.close();
                    		return;
                	default:
                   		System.out.println("Invalid choice! Please try again.");
                    		break;

		}
	}

}