package easy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ValidPalindromeTest {
    ValidPalindrome validPalindrome = new ValidPalindrome();

    @Test
    public void test1() {
        String s = "()";
        Assertions.assertTrue(validPalindrome.isPalindrome(s));
    }

    @Test
    public void test2() {
        String s = "A man, a plan, a canal: Panama";
        Assertions.assertTrue(validPalindrome.isPalindrome(s));
    }

    @Test
    public void test3() {
        String s = "race a car";
        Assertions.assertFalse(validPalindrome.isPalindrome(s));
    }

    @Test
    public void test4() {
        String s = " ";
        Assertions.assertTrue(validPalindrome.isPalindrome(s));
    }
}
