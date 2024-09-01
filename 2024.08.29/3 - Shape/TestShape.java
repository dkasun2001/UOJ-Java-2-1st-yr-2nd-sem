public class TestShape{
	public static void main(String[] args){
		Rectangle R1 = new Rectangle("Blue", 3, 5);
		System.out.println(R1);
		System.out.println(R1.getArea());
		
		Triangle T1 = new Triangle("Yellow", 7, 3);
		System.out.println(T1);
		System.out.println(T1.getArea());
		
		Shape S1 = new Shape("Red");
		System.out.println(S1);
		S1.getArea();
		
		
	}
	
}