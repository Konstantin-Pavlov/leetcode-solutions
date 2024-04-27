package easy.k_closest_points_to_origin;

class Point implements Comparable<Point> {
    private final int x;
    private final int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public int compareTo(Point other) {
        double distance1 = Math.sqrt(x * x + y * y);
        double distance2 = Math.sqrt(other.x * other.x + other.y * other.y);
        return Double.compare(distance1, distance2);
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    @Override
    public String toString() {
        return String.format("(%d; %d)", x, y);
    }
}
