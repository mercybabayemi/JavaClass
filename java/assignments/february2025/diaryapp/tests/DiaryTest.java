import diaryapp.Diary;
import diaryapp.Entry;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class DiaryTest {
    private Diary diary;

    @BeforeEach
    public void setUp() {
        diary = new Diary("username", "password");
    }

    @Test
    public void testThat_diaryIsUnlocked_whenPasswordIsCorrect() {
        diary.unlockDiary("password");
        assertFalse(diary.isLocked());
    }

    @Test
    public void testThat_diaryIsLocked_whenPasswordIsIncorrectToUnlockDiary() {
        diary.unlockDiary("pass");
        assertTrue( diary.isLocked());
    }

    @Test
    public void testThat_diaryIsLocked_whenLockDiaryIsUsed() {
        diary.lockDiary();
        assertTrue( diary.isLocked());
    }

    @Test
    public void testThat_diaryCreateEntry_andAddToEntries(){
        diary.createEntry("Title", "Entry Body");
        diary.createEntry("Title", "Entry Body");
        diary.createEntry("Title", "Entry Body");
        assertEquals(3, diary.size());
    }

    @Test
    public void testThat_diaryCreateEntry_andDeleteEntryRemoveFromEntries(){
        diary.createEntry("Title", "Entry Body");
        diary.createEntry("Title", "Entry Body");
        diary.createEntry("Title", "Entry Body");
        assertEquals(3, diary.size());
        diary.deleteEntry(2);
        assertEquals(2, diary.size());
    }

    @Test
    public void testThat_diaryCreateEntry_andDeleteEntryRemoveFromDiaryThrowsExceptionWhenIdIsNegativeOrGreaterThanEntryCount(){
        diary.createEntry("Title", "Entry Body");
        diary.createEntry("Title", "Entry Body");
        diary.createEntry("Title", "Entry Body");
        assertThrows(IndexOutOfBoundsException.class, () -> diary.deleteEntry(-1));
        assertThrows(IndexOutOfBoundsException.class, () -> diary.deleteEntry(4));
    }

    @Test
    public void testThat_diaryFindEntryById_andReturnEntry(){
        diary.createEntry("Title", "Entry Body");
        diary.createEntry("Title", "Entry Body");
        diary.createEntry("Title", "Entry Body");
        Entry entryFound = diary.findEntryById(2);
        assertEquals(2, entryFound.getId());
    }

    @Test
    public void testThat_diaryFindEntryById_throwsExceptionWhenIdIsNegativeOrGreaterThanEntryCount(){
        diary.createEntry("Title", "Entry Body");
        diary.createEntry("Title", "Entry Body");
        diary.createEntry("Title", "Entry Body");
        assertThrows(IndexOutOfBoundsException.class, () -> diary.findEntryById(-1));
        assertThrows(IndexOutOfBoundsException.class, () -> diary.findEntryById(4));
    }

    @Test
    public void testThat_diaryUpdateEntry(){
        diary.createEntry("Title", "Entry Body");
        diary.createEntry("Title", "Entry Body");
        diary.updateEntry(1, "newTitle", "newBody");
        assertEquals(2, diary.size());
        assertEquals("newBody", diary.findEntryById(1).getEntryBody());
        assertEquals("newTitle", diary.findEntryById(1).getTitle());
    }

    @Test
    public void testThat_diaryUpdateEntry_throwsExceptionWhenIdIsNegativeOrDoesNotExistOrGreaterThanEntryCount(){
        diary.createEntry("Title", "Entry Body");
        diary.createEntry("Title", "Entry Body");
        diary.createEntry("Title", "Entry Body");
        assertThrows(IndexOutOfBoundsException.class, () -> diary.updateEntry(-1, "newTitle", "newBody"));
        assertThrows(IndexOutOfBoundsException.class, () -> diary.updateEntry(5, "newTitle", "newBody"));
    }


}
