package easy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ValidParenthesesTest {
    ValidParentheses validParentheses = new ValidParentheses();

    @Test
    public void test1() {
        String s = "()";
        Assertions.assertTrue(validParentheses.isValidWithStringBuilder(s));
    }

    @Test
    public void test2() {
        String s = "()[]{}";
        Assertions.assertTrue(validParentheses.isValidWithStringBuilder(s));
    }

    @Test
    public void test3() {
        String s = "(]";
        Assertions.assertFalse(validParentheses.isValidWithStringBuilder(s));
    }

    @Test
    public void test4() {
        String s = "[(])";
        Assertions.assertFalse(validParentheses.isValidWithStringBuilder(s));
    }

    @Test
    public void test5() {
        String s = "{[]}()";
        Assertions.assertTrue(validParentheses.isValidWithStringBuilder(s));
    }

    @Test
    public void test6() {
        String s = "(([]){})";
        Assertions.assertTrue(validParentheses.isValidWithStringBuilder(s));
    }

    @Test
    public void test7() {
        String s = "[(])";
        Assertions.assertFalse(validParentheses.isValidWithString(s));
    }

    @Test
    public void test8() {
        String s = "{[]}()";
        Assertions.assertTrue(validParentheses.isValidWithString(s));
    }

    @Test
    public void test9() {
        String s = "(([]){})";
        Assertions.assertTrue(validParentheses.isValidWithString(s));
    }

    @Test
    public void test10() {
        String s = "[(])";
        Assertions.assertFalse(validParentheses.isValidWithStack(s));
    }

    @Test
    public void test11() {
        String s = "{[]}()";
        Assertions.assertTrue(validParentheses.isValidWithStack(s));
    }

    @Test
    public void test12() {
        String s = "(([]){})";
        Assertions.assertTrue(validParentheses.isValidWithStack(s));
    }    @Test
    public void test13() {
        String s = "]";
        Assertions.assertFalse(validParentheses.isValidWithStack(s));
    }
}
