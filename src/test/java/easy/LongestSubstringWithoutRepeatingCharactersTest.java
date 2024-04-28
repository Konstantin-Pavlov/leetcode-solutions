package easy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class LongestSubstringWithoutRepeatingCharactersTest {
    @Test
    public void test1() {
        String s = "abcabcbb";
        int expected = 3;
        Assertions.assertEquals(expected, LongestSubstringWithoutRepeatingCharacters.lengthOfLongestSubstring(s));
    }

    @Test
    public void test2() {
        String s = "bbbbb";
        int expected = 1;
        Assertions.assertEquals(expected, LongestSubstringWithoutRepeatingCharacters.lengthOfLongestSubstring(s));
    }

    @Test
    public void test3() {
        String s = "pwwkew";
        int expected = 3;
        Assertions.assertEquals(expected, LongestSubstringWithoutRepeatingCharacters.lengthOfLongestSubstring(s));
    }

    @Test
    public void test4() {
        String s = "qwerty";
        int expected = 6;
        Assertions.assertEquals(expected, LongestSubstringWithoutRepeatingCharacters.lengthOfLongestSubstring(s));
    }

    @Test
    public void test5() {
        String s = "aab";
        int expected = 2;
        Assertions.assertEquals(expected, LongestSubstringWithoutRepeatingCharacters.lengthOfLongestSubstring(s));
    }

    @Test
    public void test6() {
        String s = "dvdf";
        int expected = 3;
        Assertions.assertEquals(expected, LongestSubstringWithoutRepeatingCharacters.lengthOfLongestSubstring(s));
    }

    @Test
    public void test7() {
        String s = "abcbdbefg";
        int expected = 5;
        Assertions.assertEquals(expected, LongestSubstringWithoutRepeatingCharacters.lengthOfLongestSubstring(s));
    }
}
