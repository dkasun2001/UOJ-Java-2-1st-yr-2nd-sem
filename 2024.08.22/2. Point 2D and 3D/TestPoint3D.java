public class TestPoint3D {
    public static void main(String[] args) {
        Point3D point1 = new Point3D();
        Point3D point2 = new Point3D(3);
        Point3D point3 = new Point3D(2, 4);
        Point3D point4 = new Point3D(5, 1, 2);

        System.out.println("point1: " + point1);
        System.out.println("point2: " + point2);
        System.out.println("point3: " + point3);
        System.out.println("point4: " + point4);
    }
}