public class testPoint {
    public static void main(String[] args) {
        Point p1 = new Point();
        p1.move(3, 3);
        System.out.println(p1.distance(new Point(0.0, 0.0))); // Fixed the method access
    }
}
