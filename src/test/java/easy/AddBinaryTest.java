package easy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static easy.AddBinary.addBinary;

public class AddBinaryTest {
    @Test
    public void test1() {
        String a = "11";
        String b = "1";
        Assertions.assertEquals("100", addBinary(a, b));
    }

    @Test
    public void test2() {
        String a = "1010";
        String b = "1011";
        Assertions.assertEquals("10101", addBinary(a, b));
    }

    @Test
    public void test3() {
        String a = "1111";
        String b = "1111";
        Assertions.assertEquals("11110", addBinary(a, b));
    }
}
