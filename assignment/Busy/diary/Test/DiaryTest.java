//import org.junit.Test;
//import org.junit.jupiter.api.BeforeEach;
//
//import static org.junit.jupiter.api.Assertions.*;
//
//public class DiaryTest {
//    private Diary diary;
//
//    @Test
//    public void testThat_Diary_IsOffByDefault() {
//        Diary diary = new Diary("123", "username", "password");
//        assertEquals(diary.getIsLocked(),false);
//    }
//
//    @Test
//    public void testThatDiaryCanBeLocked() {
//        Diary diary = new Diary("123", "username", "password");
//        diary.isLocked();
//        assertTrue(diary.getIsLocked());
//    }
//
//    @Test
//    public void testThatDiaryCanBeUnlocked() {
//        Diary diary = new Diary("123", "username", "password");
//        diary.isUnLocked();
//        assertFalse(diary.getIsLocked());
//    }
//
//    @Test
//    public void testThatDiaryCanBeUnlockedAndLocked() {
//        Diary diary = new Diary("123", "username", "password");
//        diary.isUnLocked();
//        diary.isLocked();
//        assertTrue(diary.getIsLocked());
//    }
//
//    @Test
//    public void testThatDiaryCanBeCreated() {
//        assertTrue(diary.getIsLocked());
//        Diary diary = new Diary("123", "username", "password");
//
//
//    }
//
//}
