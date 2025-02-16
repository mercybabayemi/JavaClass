package diaryapp;

import java.io.Serializable;
import java.time.LocalDate;

public class Entry implements Serializable {
    private int id;
    private String title;
    private String body;
    private LocalDate dateCreated;

    public Entry(int id, String title, String body) {
        this.id = id;
        this.title = title;
        this.body = body;
        this.dateCreated = LocalDate.now();
    }

    public LocalDate getDateCreated(){
        return dateCreated;
    }

    public int getId() {
        return this.id;
    }

    public void setTitle(String aNew) {
        this.title = aNew;
    }

    public String getTitle() {
        return this.title;
    }

    public void setEntryBody(String aNew) {
        this.body = aNew;
    }
    public String getEntryBody() {
        return this.body;
    }

    @Override
    public String toString() {
        return String.format("Entry: %nID: %d,%nTitle: %s,%nBody: %s,%nDateCreated: %s", this.id, this.title, this.body, this.dateCreated);
    }
}
