package diaryapp;

import java.time.LocalDate;

public class Entry {
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
        return """
                ID:  " + this.id +
                "Title: " + this.title + "
                "Body: " + this.body + "
                "DateCreated: " + this.dateCreated
                """;
    }
}
