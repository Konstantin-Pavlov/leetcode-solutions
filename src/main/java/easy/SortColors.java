package easy;

import java.util.Arrays;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.IntStream;

public class SortColors {
    // slowest -  2ms Beats 13.77% of users with Java
    public void sortColorsWithArray(int[] nums) {
        int[] counter = new int[3];
        for (int num : nums) {
            counter[num]++;
        }

        Arrays.fill(nums, 0, counter[0], 0);
        Arrays.fill(nums, counter[0], counter[0] + counter[1], 1);
        Arrays.fill(nums, counter[0] + counter[1], counter[0] + counter[1] + counter[2], 2);

        for (int i = 0; i < nums.length; i++) {
            if (i < counter[0]) {
                nums[i] = 0;
            } else if (i < counter[0] + counter[1]) {
                nums[i] = 1;
            } else {
                nums[i] = 2;
            }
        }
    }

    // fastest
    public void sortColorsWithoutArray(int[] nums) {
        int zero = 0;
        int one = 0;
        int two = 0;
        int n = nums.length;
        for (int num : nums) {
            if (num == 0) {
                zero++;
            } else if (num == 1) {
                one++;
            } else {
                two++;
            }
        }

        for (int i = 0; i < n; i++) {
            if (i < zero) {
                nums[i] = 0;
            } else if (i < zero + one) {
                nums[i] = 1;
            } else {
                nums[i] = 2;
            }
        }

    }

    public void sortColorsWithStream(int[] nums) {
        AtomicInteger zero = new AtomicInteger();
        AtomicInteger one = new AtomicInteger();

        int n = nums.length;
        Arrays.stream(nums).forEach(num -> {
            if (num == 0) {
                zero.getAndIncrement();
            } else if (num == 1) {
                one.getAndIncrement();
            }
        });

        IntStream.range(0, n).forEach(i -> {
            if (i < zero.get()) {
                nums[i] = 0;
            } else if (i < zero.get() + one.get()) {
                nums[i] = 1;
            } else {
                nums[i] = 2;
            }
        });
    }

}
