package easy;

import java.util.Arrays;

// fib
// https://leetcode.com/problems/climbing-stairs/description/
public class ClimbingStairs {
    public int climbStairs(int n) {
        int[] nums = new int[n + 1];
        Arrays.fill(nums, -1);
        return helperWithMemo(n, nums);
    }

    private int helperWithMemo(int n, int[] nums) {
        if (nums[n] != -1) {
            return nums[n];
        }
        if (n <= 2) {
            return n;
        }
        int result = helperWithMemo(n - 1, nums) + helperWithMemo(n - 2, nums);
        nums[n] = result;
        return result;
    }
}
