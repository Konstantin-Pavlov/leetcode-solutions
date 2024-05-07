package easy;

import java.util.HashSet;
import java.util.Set;

class WordDictionary {
    Set<String> words;

    public WordDictionary() {
        words = new HashSet<>();
    }

    public void addWord(String word) {
        words.add(word);
    }

    public boolean search(String word) {
        int wordLength = word.length();
        if (words.contains(word)) {
            return true;
        }
        if (word.contains(".")) {
            for (String currentWord : words) {
                if (currentWord.length() == wordLength && isMatch(currentWord, word, wordLength)) {
                    return true;
                }
            }
        }
        return false;
    }

    private boolean isMatch(String currentWord, String pattern, int patterLength) {
        for (int i = 0; i < patterLength; i++) {
            if (pattern.charAt(i) != '.' && pattern.charAt(i) != currentWord.charAt(i)) {
                return false;
            }
        }
        return true;

    }
}
