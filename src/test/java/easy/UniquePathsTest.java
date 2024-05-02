package easy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class UniquePathsTest {
    UniquePaths paths = new UniquePaths();

    @Test
    public void test1() {
        int m = 3, n = 2, expected = 3;
        Assertions.assertEquals(expected, paths.uniquePaths(m, n));
    }

    @Test
    public void test2() {
        int m = 3, n = 7, expected = 28;
        Assertions.assertEquals(expected, paths.uniquePaths(m, n));
    }
}
