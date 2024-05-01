package easy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SortColorsTest {
    SortColors sortColors = new SortColors();

    @Test
    public void test1() {
        int[] input = new int[]{2, 0, 2, 1, 1, 0};
        sortColors.sortColorsWithArray(input);
        int[] expected = new int[]{0, 0, 1, 1, 2, 2};
        Assertions.assertArrayEquals(expected, input);
    }

    @Test
    public void test2() {
        int[] input = new int[]{2, 0, 1};
        sortColors.sortColorsWithArray(input);
        int[] expected = new int[]{0, 1, 2};
        Assertions.assertArrayEquals(expected, input);
    }

    @Test
    public void test3() {
        int[] input = new int[]{2, 0, 2, 1, 1, 0};
        sortColors.sortColorsWithoutArray(input);
        int[] expected = new int[]{0, 0, 1, 1, 2, 2};
        Assertions.assertArrayEquals(expected, input);
    }

    @Test
    public void test4() {
        int[] input = new int[]{2, 0, 1};
        sortColors.sortColorsWithoutArray(input);
        int[] expected = new int[]{0, 1, 2};
        Assertions.assertArrayEquals(expected, input);
    }

    @Test
    public void test5() {
        int[] input = new int[]{2, 0, 2, 1, 1, 0};
        sortColors.sortColorsWithStream(input);
        int[] expected = new int[]{0, 0, 1, 1, 2, 2};
        Assertions.assertArrayEquals(expected, input);
    }

    @Test
    public void test6() {
        int[] input = new int[]{2, 0, 1};
        sortColors.sortColorsWithStream(input);
        int[] expected = new int[]{0, 1, 2};
        Assertions.assertArrayEquals(expected, input);
    }
}
