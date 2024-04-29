package easy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MergeIntervalsTest {
    @Test
    public void test1() {
        int[][] array = {{1, 4}, {0, 2}, {3, 5}};
        int[][] expected = {{0, 5}};
        Assertions.assertArrayEquals(expected, MergeIntervals.merge(array));
    }

    @Test
    public void test2() {
        int[][] array = {{1, 3}, {2, 6}, {8, 10}, {15, 18}};
        int[][] expected = {{1, 6}, {8, 10}, {15, 18}};
        Assertions.assertArrayEquals(expected, MergeIntervals.merge(array));
    }

    @Test
    public void test3() {
        int[][] array = {{1, 4}, {4, 5}};
        int[][] expected = {{1, 5}};
        Assertions.assertArrayEquals(expected, MergeIntervals.merge(array));
    }

    @Test
    public void test4() {
        int[][] array = {{1, 4}, {0, 4}};
        int[][] expected = {{0, 4}};
        Assertions.assertArrayEquals(expected, MergeIntervals.merge(array));
    }

    @Test
    public void test5() {
        int[][] array = {{1, 3}, {4, 7}, {2, 5}, {6, 8}};
        int[][] expected = {{1, 8}};
        Assertions.assertArrayEquals(expected, MergeIntervals.merge(array));
    }

    @Test
    public void test6() {
        int[][] array = {{1, 2}, {3, 4}, {5, 6}, {7, 8}};
        int[][] expected = {{1, 2}, {3, 4}, {5, 6}, {7, 8}};
        Assertions.assertArrayEquals(expected, MergeIntervals.merge(array));
    }

    @Test
    public void test7() {
        int[][] array = {{1, 4}, {0, 2}, {3, 5}, {6, 8}, {7, 9}};
        int[][] expected = {{0, 5}, {6, 9}};
        Assertions.assertArrayEquals(expected, MergeIntervals.merge(array));
    }

}
