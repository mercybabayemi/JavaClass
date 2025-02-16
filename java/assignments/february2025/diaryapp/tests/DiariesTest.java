import diaryapp.Diaries;
import diaryapp.Diary;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.NoSuchElementException;

import static org.junit.jupiter.api.Assertions.*;

public class DiariesTest {
    private Diaries diaries;
    private Diary diary;

    @BeforeEach
    void setUp() {
        diary = new Diary("username", "password");
        diaries = new Diaries();
    }
    
    @Test
    public void testThat_diariesAdd(){
        diaries.add("username", "password");
        assertEquals("username", diary.getUsername());
    }

    @Test
    public void testThat_diariesFindByUsername(){
        diaries.add("username", "password");
        Diary found = diaries.findByUsername("username");
        assertEquals("username", found.getUsername());
    }

    @Test
    public void testThat_diariesFindByUsernameThrowsExceptionWhenNotFound(){
        diaries.add("username", "password");
        assertThrows(NoSuchElementException.class , () -> diaries.findByUsername("user"));
    }

    @Test
    public void testThat_diariesDeleteDiary(){
        diaries.add("username", "password");
        diaries.delete("username", "password");
        assertEquals(0, diaries.size());
    }

    @Test
    public void testThat_diariesDeleteDiaryThrowsExceptionWhenNotFound(){
        assertThrows(NoSuchElementException.class , () -> diaries.delete("username", "password"));
    }

    @Test
    public void testThat_diariesSendNotificationWhenNoNewEntries(){

    }
}