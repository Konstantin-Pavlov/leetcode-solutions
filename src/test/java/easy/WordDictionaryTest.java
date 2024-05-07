package easy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class WordDictionaryTest {

    @Test
    public void test1() {
        WordDictionary dictionary = getDictionary();
        Assertions.assertFalse(dictionary.search("pad")); // return False
    }

    @Test
    public void test2() {
        WordDictionary dictionary = getDictionary();
        Assertions.assertTrue(dictionary.search("bad")); // return True
    }

    @Test
    public void test3() {
        WordDictionary dictionary = getDictionary();
        Assertions.assertTrue(dictionary.search(".ad")); // return True
    }

    @Test
    public void test4() {
        WordDictionary dictionary = getDictionary();
        Assertions.assertTrue(dictionary.search("b..")); // return True
    }

    @Test
    public void test5() {
        WordDictionary dictionary = getDictionary();
        Assertions.assertFalse(dictionary.search(".a")); // return True
    }

    @Test
    public void test6() {
        WordDictionary dictionary = getDictionary();
        Assertions.assertFalse(dictionary.search("a.")); // return True
    }

    private WordDictionary getDictionary() {
        WordDictionary dictionary = new WordDictionary();
        dictionary.addWord("bad");
        dictionary.addWord("dad");
        dictionary.addWord("mad");
        dictionary.addWord("a");
        return dictionary;
    }
}
