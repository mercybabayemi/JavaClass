package diaryapp;

import java.util.ArrayList;

public class Diary {
    private final String username;
    private final String password;
    private boolean isLocked;
    private final ArrayList<Entry> entries;
    private int entryCount;

    public Diary(String username, String password) {
        this.username = username;
        this.password = password;
        this.entries = new ArrayList<>();
        this.entryCount = 0;
    }

    public void unlockDiary(String password) {
        if(this.password.equals(password)) isLocked = false;
        if(!this.password.equals(password)) isLocked = true;
    }

    public boolean isLocked() {
        return this.isLocked;
    }

    public void lockDiary() {
        this.isLocked = true;
    }

    public int createEntry(String title, String entryBody) {
        ++this.entryCount;
        Entry entry1 = new Entry(this.entryCount, title, entryBody);
        entries.add(entry1);
        return entry1.getId();
    }

    public int size() {
        return entries.size();
    }

    public void deleteEntry(int id) {
        if (id <= 0 || id > entries.size()) throw new IndexOutOfBoundsException("Index " + id + " out of bounds for " + entries.size() );
        Entry entryToDelete = entries.get(id - 1);
        entries.remove(entryToDelete);
        --entryCount;
    }

    public Entry findEntryById(int id) {
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

    @Override
    public String toString() {
        return "Diary [Username: " + this.username + ", Entries: " + this.entries.size() + "]";
    }
}
