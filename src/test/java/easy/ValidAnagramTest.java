package easy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ValidAnagramTest {
    ValidAnagram validAnagram = new ValidAnagram();

    @Test
    public void test1() {
        String s = "anagram";
        String t = "nagaram";
        Assertions.assertTrue(validAnagram.isAnagram(s, t));
    }

    @Test
    public void test2() {
        String s = "rat";
        String t = "car";
        Assertions.assertFalse(validAnagram.isAnagram(s, t));
    }

    @Test
    public void test3() {
        String s = "anagram";
        String t = "nagaram";
        Assertions.assertTrue(validAnagram.isAnagramWithoutMap(s, t));
    }

    @Test
    public void test4() {
        String s = "rat";
        String t = "car";
        Assertions.assertFalse(validAnagram.isAnagramWithoutMap(s, t));
    }

    @Test
    public void test5() {
        String s = "anagram";
        String t = "nagaram";
        Assertions.assertTrue(validAnagram.isAnagramWithoutCounter(s, t));
    }

    @Test
    public void test6() {
        String s = "rat";
        String t = "car";
        Assertions.assertFalse(validAnagram.isAnagramWithoutCounter(s, t));
    }

    @Test
    public void test7() {
        String s = "anagram";
        String t = "nagaram";
        Assertions.assertTrue(validAnagram.isAnagramWithStream(s, t));
    }

    @Test
    public void test8() {
        String s = "rat";
        String t = "car";
        Assertions.assertFalse(validAnagram.isAnagramWithStream(s, t));
    }
}
