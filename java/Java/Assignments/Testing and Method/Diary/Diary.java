import java.util.ArrayList;
public class Diary{
	private int diaryId;
	private String diaryDate;
	private String diaryContent;
	private boolean isLocked;

	public Diary(int diaryId, String diaryDate, String diaryContent){
		if(diaryId > 0){
			this.diaryId = diaryId;
		}
		
		this.diaryDate = diaryDate;

		this.diaryContent = diaryContent;
	}

	public void setDiaryId(int diaryId){
		if(diaryId > 0){
			this.diaryId = diaryId;
		}
	}

	public int getDiaryId(){
		return diaryId;
	}
	
	public void setDiaryDate(String diaryDate){
		this.diaryId = diaryId;
	}

	public String getDiaryDate(){
		return diaryDate;
	}

	public void setDiaryContent(String diaryContent){
		this.diaryContent = diaryContent;
	}

	public String getDiaryContent(){
		return diaryContent;
	}

	public boolean lockDiary(){
		isLocked = true;
	}

	public boolean unlockDiary(){
		isLocked = false;
	}

	public void addEntry(){
		diaries.add(entry);
	}

	public void findEntryById(int diaryId){
		for(Diary entry: diaries){
			if(diaryId == entry.getDiaryId()){
				System.out.printf("Diary ID: %d%n", entry.getDiaryId());
				System.out.printf("Diary Date: %s%n", entry.getDiaryDate());
				System.out.printf("Diary Content: %s%n", entry.getDiaryContent());
			}
			else{
				System.out.println("No entry Id match found");
			}
		}
	}

	public void deleteEntry(int diaryId){
		for(Diary entry: diaries){
			if(diaryId == entry.getDiaryId()){
				diaries.remove(entry);							System.out.println("Diary deleted");
			}
			else{
				System.out.println("No entry Id match found");
			}

		}
	}

	public void updateDiaryIdById(int diaryId, int newId){
		for(Diary entry: diaries){
			if(diaryId = entry.getDiaryId()){
				entry.setDiaryId(newId);
				System.out.println("Diary Id updated");
			}
			else{
				System.out.println("No entry Id match found");
			}
		}
	}

	public void updateDiaryDateById(int diaryId, String newDate){
		for(Diary entry: diaries){
			if(diaryId == entry.getDiaryId()){
				entry.setDiaryDate(newDate);						System.out.println("Diary date updated");
			}
			else{
				System.out.println("No entry Id match found");
			}

		}
	}

	public void updateDiaryContentById(int diaryId, String newContent){
		for(Diary entry: diaries){
			if(diaryId == entry.getDiaryId()){
				entry.setDiaryContent(newContent);
				System.out.println("Diary content updated");
			}
			else{
				System.out.println("No entry Id match found");
			}
		}
	}

	public void displayEntries(){
		for(Diary entry: diaries){
			System.out.printf("Diary ID: %d%n", entry.getDiaryId());
			System.out.printf("Diary Date: %s%n", entry.getDiaryDate());
			System.out.printf("Diary Content: %s%n", entry.getDiaryContent());
		}

	}

	public void exitDiary(){
		System.out.println("Exiting>>>>>>\n We hope to see you back soon.");
	}
}