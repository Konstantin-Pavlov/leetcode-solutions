package easy;

import easy.k_closest_points_to_origin.KClosestPointsToOrigin;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class KClosestPointsToOriginTest {
    @Test
    public void test1() {
        int[][] points = new int[][]{{1, 3}, {-2, 2}};
        int k = 1;
        int[][] output = new int[][]{{-2, 2}};
        Assertions.assertArrayEquals(output, KClosestPointsToOrigin.kClosest(points, k));
    }

    @Test
    public void test2() {
        int[][] points = new int[][]{{3, 3}, {5, -1}, {-2, 4}};
        int k = 2;
        int[][] output = new int[][]{{3, 3}, {-2, 4}};
        Assertions.assertArrayEquals(output, KClosestPointsToOrigin.kClosest(points, k));
    }
}
