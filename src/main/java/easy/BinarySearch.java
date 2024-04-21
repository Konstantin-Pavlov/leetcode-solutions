package easy;

public class BinarySearch {
    public int search(int[] nums, int target) {
        return binarySearchWithRecursion(nums, target, 0, nums.length - 1);
    }

    private int binarySearchWithRecursion(int[] nums, int target, int left, int right) {
        if (left > right) {
            return -1; // Base case: element not found
        }

        int mid = left + (right - left) / 2; // Calculate the mid index
        /*
        The expression int mid = left + (right - left) / 2; calculates the middle index (mid) of a given range specified by the left and right indices.

        Here's a breakdown of how it works:

        (right - left) calculates the length of the range. For example, if left is 0 and right is 5, the length of the range is (5 - 0) = 5.
        (right - left) / 2 calculates the distance from the left index to the middle of the range. It effectively finds half of the range length.
        For example, in the above case, (5 - 0) / 2 = 2 represents the distance from index 0 to the middle index 2.
        left + (right - left) / 2 then adds this distance to the left index to find the middle index within the specified range.
        For example, if left is 0, the expression becomes 0 + 2 = 2, indicating that the middle index within the range 0 to 5 is 2.
        This calculation ensures that the middle index is correctly determined regardless of whether the range is even or odd in length.
        If the range is odd, the middle index will be the exact midpoint; if it's even, the middle index will be slightly biased towards the left end of the range.
        This approach ensures consistent behavior and avoids potential integer overflow issues.
         */

        if (nums[mid] == target) {
            return mid; // Base case: element found
        } else if (nums[mid] > target) {
            return binarySearchWithRecursion(nums, target, left, mid - 1); // Search in the left half
        } else {
            return binarySearchWithRecursion(nums, target, mid + 1, right); // Search in the right half
        }
    }

    public int binarySearchWithWhile(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] == target) {
                return mid;
            }
            if (nums[mid] < target) {
                left = mid + 1;
            }
            if (nums[mid] > target) {
                right = mid - 1;
            }

        }
        return -1;
    }
}
