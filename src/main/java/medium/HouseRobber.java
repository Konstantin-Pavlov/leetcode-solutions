package medium;

import java.util.Arrays;

public class HouseRobber {
    public int rob(int[] nums) {
        int length = nums.length;
        if (length == 0) {
            return 0;
        }
        if (length == 1) {
            return nums[0];
        }
        int[] temp = new int[length];
        temp[0] = nums[0];
        temp[1] = Math.max(nums[0], nums[1]);
        for (int i = 2; i < length; i++) {
            temp[i] = Math.max(temp[i - 1], nums[i] + temp[i - 2]);
        }
        System.out.println(Arrays.toString(temp));
        return temp[length - 1];
    }

    public int robWithoutAdditionalArray(int[] nums) {
        int length = nums.length;
        if (length == 0) {
            return 0;
        }
        if (length == 1) {
            return nums[0];
        }

        nums[1] = Math.max(nums[0], nums[1]);
        for (int i = 2; i < length; i++) {
            nums[i] = Math.max(nums[i - 1], nums[i] + nums[i - 2]);
        }

        return nums[length - 1];
    }
}
