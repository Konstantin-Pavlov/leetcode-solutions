package medium;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class HouseRobberTest {
    HouseRobber robber = new HouseRobber();

    @Test
    public void test1() {
        int[] nums = {1, 2, 3, 1};
        int expected = 4;
        Assertions.assertEquals(expected, robber.rob(nums));
    }

    @Test
    public void test2() {
        int[] nums = {2, 7, 9, 3, 1};
        int expected = 12;
        Assertions.assertEquals(expected, robber.rob(nums));
    }

    @Test
    public void test3() {
        int[] nums = {0};
        int expected = 0;
        Assertions.assertEquals(expected, robber.rob(nums));
    }

    @Test
    public void test4() {
        int[] nums = {6, 3, 10, 8, 2, 10, 3, 5, 10, 5, 3};
        int expected = 39;
        Assertions.assertEquals(expected, robber.rob(nums));
    }

    @Test
    public void test5() {
        int[] nums = {1, 2, 3, 1};
        int expected = 4;
        Assertions.assertEquals(expected, robber.robWithoutAdditionalArray(nums));
    }

    @Test
    public void test6() {
        int[] nums = {2, 7, 9, 3, 1};
        int expected = 12;
        Assertions.assertEquals(expected, robber.robWithoutAdditionalArray(nums));
    }

    @Test
    public void test7() {
        int[] nums = {0};
        int expected = 0;
        Assertions.assertEquals(expected, robber.robWithoutAdditionalArray(nums));
    }

    @Test
    public void test8() {
        int[] nums = {6, 3, 10, 8, 2, 10, 3, 5, 10, 5, 3};
        int expected = 39;
        Assertions.assertEquals(expected, robber.robWithoutAdditionalArray(nums));
    }
}
