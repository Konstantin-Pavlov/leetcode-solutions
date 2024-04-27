package easy.k_closest_points_to_origin;

import java.util.Arrays;
import java.util.stream.IntStream;

public class KClosestPointsToOrigin {
    public static int[][] kClosest(int[][] points, int k) {
        Point[] pointsArray = Arrays.stream(points)
                .map(point -> new Point(point[0], point[1]))
                .toArray(Point[]::new);

        Arrays.sort(pointsArray);
        Arrays.stream(pointsArray).forEach(System.out::println);
        System.out.println();

        points = Arrays.stream(pointsArray)
                .limit(k)
                .map(point -> new int[]{point.getX(), point.getY()})
                .toArray(int[][]::new);
        return points;
    }

//    public static void main(String[] args) {
//        int k = 2;
//        int[][] points = new int[][]{{3, 3}, {5, -1}, {-2, 4}};
//        Point[] pointsArray = Arrays.stream(points)
//                .map(point -> new Point(point[0], point[1]))
//                .toArray(Point[]::new);
//
////        Arrays.stream(pointsArray).forEach(System.out::println);
//        Arrays.sort(pointsArray);
//        Arrays.stream(pointsArray).forEach(System.out::println);
//        System.out.println();
//
//        points = Arrays.stream(pointsArray)
//                .limit(k)
//                .map(point -> new int[]{point.getX(), point.getY()})
//                .toArray(int[][]::new);
//
//
//        Arrays.stream(points).forEach(point -> System.out.printf("(%d; %d)%n", point[0], point[1]));
//
//    }
}
