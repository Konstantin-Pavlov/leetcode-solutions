package easy;

import java.util.HashMap;
import java.util.Map;

public class LongestPalindrome {
    public static int longestPalindrome(String s) {
        int palindromeLength = 0;
        Map<Character, Integer> lettersCount = new HashMap<>();
        for (char c : s.toCharArray()) {
            if (lettersCount.get(c) == null) {
                lettersCount.put(c, 1);
            } else {
                lettersCount.remove(c);
                palindromeLength += 2;
            }
        }
        if (!lettersCount.isEmpty()) {
            palindromeLength++;
        }
        return palindromeLength;
    }

    public static int longestPalindromeFastest(String s) {
        int[] freq = new int[128];
        int odds = 0;
        for (char c : s.toCharArray()) {
            freq[c]++;
            if (freq[c] == 2) {
                freq[c] = 0;
                odds += 2;
            }
        }
        return odds + 1 <= s.length() ? odds + 1 : odds;
    }
}
