package easy;

import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Map;

// https://leetcode.com/problems/longest-substring-without-repeating-characters/submissions/1243674678/
public class LongestSubstringWithoutRepeatingCharacters {
    public static int lengthOfLongestSubstring(String s) {
        LinkedHashSet<Character> characters = new LinkedHashSet<>();
        int left = 0;
        int right = 0;
        int result = 0;
        while (right < s.length()) {
            char c = s.charAt(right);
            if (characters.contains(c)) {
                while (characters.contains(c)) {
                    characters.removeFirst();
                    left++;
                }
            } else {
                characters.add(c);
                result = Math.max(result, right - left + 1);
                right++;
            }
        }
        return result;
    }

    public static int lengthOfLongestSubstringChatVersion(String s) {
        Map<Character, Integer> charIndexMap = new HashMap<>();
        int left = 0; // Start of the sliding window
        int result = 0; // Result to store the maximum length found

        for (int right = 0; right < s.length(); right++) {
            char currentChar = s.charAt(right);

            if (charIndexMap.containsKey(currentChar)) {
                // Move the left side of the window to the right of the last occurrence of currentChar
                left = Math.max(left, charIndexMap.get(currentChar) + 1);
            }

            // Update the latest index of the character to the current position
            charIndexMap.put(currentChar, right);
            // Calculate the length of the current substring and update result if it's the longest so far
            result = Math.max(result, right - left + 1);
        }

        return result;
    }

}
