package medium;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class TopKFrequentWordsTest {
    TopKFrequentWords frequentWords = new TopKFrequentWords();

    @Test
    public void test1() {
        String[] words = {"i", "love", "leetcode", "i", "love", "coding"};
        int k = 2;
        List<String> expected = new ArrayList<>(List.of("i", "love"));
        Assertions.assertEquals(expected, frequentWords.topKFrequent(words, k));
    }

    @Test
    public void test2() {
        String[] words = {"the", "day", "is", "sunny", "the", "the", "the", "sunny", "is", "is"};
        int k = 4;
        List<String> expected = new ArrayList<>(List.of("the", "is", "sunny", "day"));
        Assertions.assertEquals(expected, frequentWords.topKFrequent(words, k));
    }
}
