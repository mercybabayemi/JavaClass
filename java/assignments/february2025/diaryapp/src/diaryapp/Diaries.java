package diaryapp;

import java.util.ArrayList;
import java.util.NoSuchElementException;

public class Diaries {
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
}
