package easy;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Objects;

public class MergeIntervals {
    public static int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, Comparator.comparing((int[] arr) -> arr[0]));
        int lstIndex = intervals.length;
        int currentIndex = 0;
        while (currentIndex < lstIndex - 1) {
            if (ifOverlap(new int[][]{intervals[currentIndex], intervals[currentIndex + 1]})) {
                int min = getMin(intervals, currentIndex);
                int max = getMax(intervals, currentIndex);
                intervals[currentIndex + 1] = new int[]{min, max};
                intervals[currentIndex] = null;
            }
            currentIndex++;
        }
        return Arrays.stream(intervals).filter(Objects::nonNull).toArray(int[][]::new);
    }

    private static int getMax(int[][] intervals, int currentIndex) {
        return Math.max(
                Math.max(intervals[currentIndex][0], intervals[currentIndex][1]),
                Math.max(intervals[currentIndex + 1][0], intervals[currentIndex + 1][1]));
    }

    private static int getMin(int[][] intervals, int currentIndex) {
        return Math.min(
                Math.min(intervals[currentIndex][0], intervals[currentIndex][1]),
                Math.min(intervals[currentIndex + 1][0], intervals[currentIndex + 1][1]));
    }

    private static boolean ifOverlap(int[][] pair) {
        return pair[0][0] > pair[1][0]
                || pair[0][1] >= pair[1][0];
    }

}
