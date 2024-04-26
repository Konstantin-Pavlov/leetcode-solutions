package easy;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class ContainsDuplicate {
    public static boolean containsDuplicateWithMap(int[] nums) {
        Map<Integer, Integer> numsCounter = new HashMap<>();
        for (int num : nums) {
            numsCounter.compute(num, (key, oldValue) -> oldValue == null ? 1 : oldValue + 1);
        }

        for (Map.Entry<Integer, Integer> entry : numsCounter.entrySet()) {
            if (entry.getValue() > 1) {
                return true;
            }
        }
        return false;
    }

    public static boolean containsDuplicateWithHashSet(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for (int num : nums) {
            if (!set.add(num)) {
                return true;
            }
        }
        return false;
    }
}
