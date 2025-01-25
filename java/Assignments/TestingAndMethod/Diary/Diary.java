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

	public boolean isLocked(){
		return isLocked;
	}

	public void lockDiary(){
		this.isLocked = true;
	}

	public void unlockDiary(){
		this. isLocked = false;
	}

	public void updateDiaryId(int newId){
		this.diaryId = newId;
	}

	public void updateDiaryDate(String newDate){
		this.diaryDate = newDate;
	}
	
	public void updateDiaryContent(String newContent){
		this.diaryContent = newContent;
	}
}