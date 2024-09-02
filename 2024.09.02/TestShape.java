public class TestShape {
    public static void main(String[] args) {

        // Test Circle
        Circle C1 = new Circle(3.2, "Pink", true);
		System.out.println(C1);
        System.out.println(C1.getArea());

        // Test Rectangle
        Rectangle R1 = new Rectangle(23,43, "Blue", false);
        System.out.println(R1);
        System.out.println(R1.getPerimeter());
		
    }
}
