package easy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class IsOneSetIncludedInAnotherTest {
    IsOneSetIncludedInAnother isOneSetIncludedInAnother = new IsOneSetIncludedInAnother();

    @Test
    public void test1() {
        String ransomNote = "a", magazine = "b";
        Assertions.assertFalse(isOneSetIncludedInAnother.canConstruct(ransomNote, magazine));
    }

    @Test
    public void test2() {
        String ransomNote = "aa", magazine = "ab";
        Assertions.assertFalse(isOneSetIncludedInAnother.canConstruct(ransomNote, magazine));
    }

    @Test
    public void test3() {
        String ransomNote = "aa", magazine = "aab";
        Assertions.assertTrue(isOneSetIncludedInAnother.canConstruct(ransomNote, magazine));
    }
}
