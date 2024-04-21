package easy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class BinarySearchTest {
    BinarySearch binarySearch = new BinarySearch();

    @Test
    public void Test1() {
        int[] nums = new int[]{-1, 0, 3, 5, 9, 12};
        int target = 9;
        int expectedIndex = 4;

        Assertions.assertEquals(expectedIndex, binarySearch.search(nums, target));
    }

    @Test
    public void Test2() {
        int[] nums = new int[]{-1, 0, 3, 5, 9, 12};
        int target = 2;
        int expectedIndex = -1;

        Assertions.assertEquals(expectedIndex, binarySearch.search(nums, target));
    }

    @Test
    public void Test3() {
        int[] nums = new int[]{-1, 0, 3, 5, 9, 12};
        int target = 9;
        int expectedIndex = 4;

        Assertions.assertEquals(expectedIndex, binarySearch.binarySearchWithWhile(nums, target));
    }

    @Test
    public void Test4() {
        int[] nums = new int[]{-1, 0, 3, 5, 9, 12};
        int target = 2;
        int expectedIndex = -1;

        Assertions.assertEquals(expectedIndex, binarySearch.binarySearchWithWhile(nums, target));
    }

    @Test
    public void Test5() {
        int[] nums = new int[]{5};
        int target = 5;
        int expectedIndex = 0;

        Assertions.assertEquals(expectedIndex, binarySearch.binarySearchWithWhile(nums, target));
    }
}
