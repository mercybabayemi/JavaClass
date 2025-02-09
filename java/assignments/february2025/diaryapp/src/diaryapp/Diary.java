package diaryapp;

import java.util.ArrayList;
import java.util.NoSuchElementException;

public class Diary {
    private final String username;
    private final String password;
    private boolean isLocked;
    private final ArrayList<Entry> entries;
    private int lastEntryId;

    public Diary(String username, String password) {
        this.username = username;
        this.password = password;
        this.entries = new ArrayList<>();
        this.lastEntryId = 0;
    }

    public void unlockDiary(String password) {
        if(this.password.equals(password)) isLocked = false;
        else throw new SecurityException("Passwords do not match");
    }

    public boolean isLocked() {
        return this.isLocked;
    }

    public void lockDiary() {
        this.isLocked = true;
    }

    public int createEntry(String title, String entryBody) {
      //  ++this.lastEntryId;
        validateIfDairyIsLocked();
        Entry newEntry = new Entry(++this.lastEntryId, title, entryBody);
        entries.add(newEntry);
        return newEntry.getId();
    }

    private void validateIfDairyIsLocked() {
        if(isLocked()) throw new IllegalArgumentException("Diary is locked");
    }

    public int size() {
        return entries.size();
    }

    public void deleteEntry(int id) {
        validateIfDairyIsLocked();
        if (id <= 0 || id > entries.size()) throw new IndexOutOfBoundsException("Index " + id + " out of bounds for " + entries.size() );
        Entry entryToDelete = entries.get(id - 1);
        entries.remove(entryToDelete);
        --lastEntryId;
    }

    public Entry findEntryById(int id) {
        validateIfDairyIsLocked();
        if (id <= 0 || id > entries.size()) throw new IndexOutOfBoundsException("Index " + id + " out of bounds for " + entries.size() );
        return entries.get(id - 1);
    }

    public void updateEntry(int id, String title, String entryBody) {
        if (id <= 0 || id > entries.size()) throw new IndexOutOfBoundsException("Index " + id + " out of bounds for " + entries.size() );
        Entry temp = findEntryById(id);
        temp.setTitle(title);
        temp.setEntryBody(entryBody);
    }

    public String getUsername(){
        return this.username;
    }

    public String getPassword() {
        return this.password;
    }

    public void viewEntry(int id) {
        validateIfDairyIsLocked();
        Entry entry = null;
        for(int i = 1; i <= size(); i++) if (i == id) entry = entries.get(i - 1);
        if (entry == null) throw new NoSuchElementException("No such entry.");
        else System.out.println(entry);
    }

    @Override
    public String toString() {
        return "Diary:\nUsername: " + this.username + ", Entries: " + this.entries.size() ;
    }
}
