package easy;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.IntStream;

public class ValidAnagram {
    public static void main(String[] args) {
//        String s = "anagram";
//        String t = "nagaram";
//        Map<Character, Integer> lettersCount = new HashMap<>();
//
//        for (char c : s.toCharArray()) {
//            if(lettersCount.containsKey(c)){
//                int tmp = lettersCount.get(c);
//                lettersCount.put(c, tmp+1);
//            } else {
//                lettersCount.put(c, 1);
//            }
//        }
//        System.out.println(lettersCount);
//
//        for (char c : t.toCharArray()) {
//            if(lettersCount.containsKey(c)){
//                int tmp = lettersCount.get(c);
//                lettersCount.put(c, tmp-1);
//            } else {
//                break;
//            }
//        }
//
//        System.out.println(lettersCount);
//
//        for (Map.Entry<Character, Integer> entry : lettersCount.entrySet()) {
//            if(entry.getValue() != 0){
//                System.out.println(false);
//                return;
//            }
//        };
//
//        System.out.println("ok");

    }

    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        Map<Character, Integer> lettersCount = new HashMap<>();

        for (char c : s.toCharArray()) {
            lettersCount.compute(c, (key, oldValue) -> (oldValue == null) ? 1 : oldValue + 1);
        }

        System.out.println(lettersCount);

        for (char c : t.toCharArray()) {
            Integer oldValue = lettersCount.get(c);
            if (oldValue == null || oldValue <= 0) {
                return false;
            }
            lettersCount.put(c, oldValue - 1);
        }

        System.out.println(lettersCount);

        for (Map.Entry<Character, Integer> entry : lettersCount.entrySet()) {
            if (entry.getValue() != 0) {
                return false;
            }
        }

        return true;
    }

    public boolean isAnagramWithoutMap(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        int[] lettersCount = new int[26];

        for (char c : s.toCharArray()) {
            lettersCount[c - 'a']++;
        }

        for (char c : t.toCharArray()) {
            lettersCount[c - 'a']--;
        }

        for (int count : lettersCount) {
            if (count != 0) {
                return false;
            }
        }
        return true;
    }

    public boolean isAnagramWithoutCounter(String s, String t) {
        char[] sChars = s.toCharArray();
        char[] tChars = t.toCharArray();

        Arrays.sort(sChars);
        Arrays.sort(tChars);

        return Arrays.equals(sChars, tChars);
    }

    public boolean isAnagramWithStream(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        int[] lettersCount = new int[26];
        s.chars().forEach(c -> lettersCount[c - 'a']++);
        t.chars().forEach(c -> lettersCount[c - 'a']--);
        return IntStream.of(lettersCount).noneMatch(count -> count != 0);
    }
}
