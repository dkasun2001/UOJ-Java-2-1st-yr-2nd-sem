public class TestShape{
	public static void main(String[] args){
		Rectangle R1 = new Rectangle("Blue", 3, 5);
		System.out.println(R1);
		System.out.println("Area of Rectangle S1 is "+R1.getArea());
		
		Triangle T1 = new Triangle("Yellow", 7, 3);
		System.out.println(T1);
		System.out.println("Area of Triangle S1 is "+T1.getArea());
		
		/*
		Shape S1 = new Shape("Red"); 
		//we cannot do this. The class is abstract. It cannot bo instantiated.
		
		System.out.println(S1);
		S1.getArea();
		*/
		
		Shape S2 = new Rectangle("Blue", 3, 5); //we defined this subclass to use the abstract class
		System.out.println(S2);
		System.out.println("Area of Rectangle S1 is "+S2.getArea());
		
		
	}
	
}