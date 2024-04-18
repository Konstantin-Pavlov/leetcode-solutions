package easy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TwoSumTest {
    TwoSum twoSum = new TwoSum();

    @Test
    public void test0() {
        int[] nums = new int[]{2, 7, 11, 15};
        int target = 9;
        Assertions.assertArrayEquals(new int[]{0, 1}, twoSum.twoSum(nums, target));
    }

    @Test
    public void test1() {
        int[] nums = new int[]{3, 2, 4};
        int target = 6;
        Assertions.assertArrayEquals(new int[]{1, 2}, twoSum.twoSum(nums, target));
    }

    @Test
    public void test2() {
        int[] nums = new int[]{3, 3};
        int target = 6;
        Assertions.assertArrayEquals(new int[]{0, 1}, twoSum.twoSum(nums, target));
    }

    @Test
    public void test3() {
        int[] nums = new int[]{-2, -7, 6, -9, 11, 15};
        int target = 13;
        Assertions.assertArrayEquals(new int[]{0, 5}, twoSum.twoSum(nums, target));
    }
}
