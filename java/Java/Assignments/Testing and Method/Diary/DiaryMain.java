import java.util.Scanner;
import java.util.ArrayList;
public class DiaryMain{
	public static void main(String[] args){
		ArrayList<Diary> diaries = new ArrayList<>();

		Diary entry = new Diary(diaryId, diaryDate, diaryContent);

		Scanner input = new Scanner(System.in);

		System.out.println("Welcome To Your Diary App!!\nWhat do you want to do?\n1. Create new diary\n2. Exit\nEnter numerical value: ");
		
		int response = input.nextInt();
		switch(response){
			case 1:
				System.out.println("Creating diary>>>>>>\nDo you want to:\n1. Lock diary\n2. Unlock diary ");
				int newResponse = input.nextInt();
				switch(newResponse){
					case 1: 
						System.out.printf("It is %b that diary is locked", entry.lockDiary());
						break;
					case 2:
						System.out.printf("It is %b that diary is locked", entry.unlockDiary());
						break;
				}
			case 2:
				entry.exitDiary();
				break;
		}
	}

}