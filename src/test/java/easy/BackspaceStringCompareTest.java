package easy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class BackspaceStringCompareTest {
    @Test
    public void test1() {
        String s = "ab#c";
        String t = "ad#c";
        Assertions.assertTrue(BackspaceStringCompare.backspaceCompare(s, t));
    }

    @Test
    public void test2() {
        String s = "ab##";
        String t = "c#d#";
        Assertions.assertTrue(BackspaceStringCompare.backspaceCompare(s, t));
    }

    @Test
    public void test3() {
        String s = "a#c";
        String t = "b";
        Assertions.assertFalse(BackspaceStringCompare.backspaceCompare(s, t));
    }

    @Test
    public void test4() {
        String s = "a##c";
        String t = "#a#c";
        Assertions.assertTrue(BackspaceStringCompare.backspaceCompare(s, t));
    }

    @Test
    public void test5() {
        String s = "y#fo##f";
        String t = "y#f#o##f";
        Assertions.assertTrue(BackspaceStringCompare.backspaceCompare(s, t));
    }

    @Test
    public void test6() {
        String s = "xywrrmp";
        String t = "xywrrmu#p";
        Assertions.assertTrue(BackspaceStringCompare.backspaceCompare(s, t));
    }
}

