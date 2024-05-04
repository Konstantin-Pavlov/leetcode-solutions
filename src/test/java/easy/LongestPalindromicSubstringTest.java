package easy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class LongestPalindromicSubstringTest {
    @Test
    public void test1() {
        String input = "babad";
        String expected = "bab";
        Assertions.assertEquals(expected, LongestPalindromicSubstring.longestPalindrome(input));
    }

    @Test
    public void test2() {
        String input = "cbbd";
        String expected = "bb";
        Assertions.assertEquals(expected, LongestPalindromicSubstring.longestPalindrome(input));
    }

    @Test
    public void test3() {
        String input = "bookkoob";
        String expected = "bookkoob";
        Assertions.assertEquals(expected, LongestPalindromicSubstring.longestPalindrome(input));
    }

    @Test
    public void test4() {
        String input = "abbazezalphaduethoohbookkoob";
        String expected = "bookkoob";
        Assertions.assertEquals(expected, LongestPalindromicSubstring.longestPalindrome(input));
    }

    @Test
    public void test5() {
        String input = "magnificentcatstacaretheremanymoreplacesthatemphasizetheabilityabbazezalphaduethoohbookkoobtogetoutthereandwin";
        String expected = "bookkoob";
        Assertions.assertEquals(expected, LongestPalindromicSubstring.longestPalindrome(input));
    }

    @Test
    public void test6() {
        String input = "sayitaintsoiwillnotgoturnthelightsoffcarrymehomenananananananananananananananananananananananananananananananananananananananana" +
                "verse2tomdelongelatenightcomehomeworksucksiknowsheleftmerosesbythestairssurprisesletmeknowshecareschorustomdelongesayitaintsoiwillnotgoturnthelightsoffcarrymehome";
        String expected = "nananananananananananananananananananananananananananananananananananananananan";
        Assertions.assertEquals(expected, LongestPalindromicSubstring.longestPalindrome(input));
    }
}
