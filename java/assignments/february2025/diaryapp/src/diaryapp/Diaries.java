package diaryapp;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.NoSuchElementException;

public class Diaries implements Serializable {
    private final ArrayList<Diary> diaries;

    public Diaries() {
        diaries = new ArrayList<>();
    }

    public void add(String username, String password) {
        Diary newDiary = new Diary(username, password);
        diaries.add(newDiary);
    }

    public Diary findByUsername(String username) {
        for (Diary diary : diaries) {
            if(diary.getUsername().equals(username)) return diary;
        }
        throw new NoSuchElementException("No diary found with username " + username);
    }

    public void delete(String username, String password) {
        Diary diaryToDelete = null;
        for (Diary diary : diaries) {
            if(diary.getPassword().equals(password) && diary.getUsername().equals(username)) {
                diaryToDelete = diary;
                break;
            }
        }
        if(diaryToDelete == null) throw new NoSuchElementException("No diary found with username " + username + " and password ");
        diaries.remove(diaryToDelete);
    }

    public ArrayList<Diary> getAllDiaries() {
        return diaries;
    }

    public int size() {
        return diaries.size();
    }

    public void checkForReminders(){
        Calendar currentCalender = Calendar.getInstance();
        for(Diary diary: diaries){
            LocalDate lastEntryDate = diary.getLastEntry();

            long diffInMilliSeconds = currentCalender.getTimeInMillis() - lastEntryDate.atStartOfDay(ZoneId.systemDefault()).toInstant().toEpochMilli();
            long diffInDays = diffInMilliSeconds / (1000 * 60 * 60 * 24);
            if(diffInDays >= 7) sendReminder(diary);
        }
    }

    private void sendReminder(Diary diary) {
        System.out.println("""
                REMINDER:
                You have not written a new entry in your diary since 
                """ + diary.getLastEntry());
    }
}
