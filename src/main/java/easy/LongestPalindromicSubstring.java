package easy;

public class LongestPalindromicSubstring {

    public static String longestPalindrome(String s) {
        char[] chars = s.toCharArray();
        int n = chars.length;
        int longestStart = 0;
        int longestEnd = 0;
        for (int start = 0; start < n; start++) {
            for (int end = start + 1; end <= n; end++) {
                if (end - start > longestEnd - longestStart) {
                    if (isPalindrome(chars, start, end - 1)) {
                        longestStart = start;
                        longestEnd = end;
                    }
                }
            }
        }
        return new String(chars, longestStart, longestEnd - longestStart);
    }

    private static boolean isPalindrome(char[] chars, int start, int end) {
        while (start < end) {
            if (chars[start] != chars[end]) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }

}
