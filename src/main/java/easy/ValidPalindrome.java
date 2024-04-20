package easy;

public class ValidPalindrome {
    public boolean isPalindrome(String s) {
        StringBuilder sb = new StringBuilder(s.toLowerCase().replaceAll("[^a-zA-Z]", ""));
        return sb.toString().contentEquals(sb.reverse());
    }
}
