package easy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ContainsDuplicateTest {
    @Test
    public void test1() {
        int[] nums = new int[]{1, 2, 3, 1};
        Assertions.assertTrue(ContainsDuplicate.containsDuplicateWithMap(nums));
    }

    @Test
    public void test2() {
        int[] nums = new int[]{1, 2, 3, 4};
        Assertions.assertFalse(ContainsDuplicate.containsDuplicateWithMap(nums));
    }

    @Test
    public void test3() {
        int[] nums = new int[]{1, 1, 1, 3, 3, 4, 3, 2, 4, 2};
        Assertions.assertTrue(ContainsDuplicate.containsDuplicateWithMap(nums));
    }

    @Test
    public void tes4() {
        int[] nums = new int[]{1, 2, 3, 1};
        Assertions.assertTrue(ContainsDuplicate.containsDuplicateWithHashSet(nums));
    }

    @Test
    public void test5() {
        int[] nums = new int[]{1, 2, 3, 4};
        Assertions.assertFalse(ContainsDuplicate.containsDuplicateWithHashSet(nums));
    }

    @Test
    public void test6() {
        int[] nums = new int[]{1, 1, 1, 3, 3, 4, 3, 2, 4, 2};
        Assertions.assertTrue(ContainsDuplicate.containsDuplicateWithHashSet(nums));
    }
}
