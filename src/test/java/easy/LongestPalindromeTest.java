package easy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class LongestPalindromeTest {
    @Test
    public void test1() {
        String s = "abccccdd";
        Assertions.assertEquals(7, LongestPalindrome.longestPalindrome(s));
    }

    @Test
    public void test2() {
        String s = "abccccdd";
        Assertions.assertEquals(7, LongestPalindrome.longestPalindromeFastest(s));
    }
}
