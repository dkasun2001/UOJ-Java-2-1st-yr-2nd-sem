public class TestCylinder{
	public static void main(String[] args){

		
		Cylinder Cy1 = new Cylinder(1.11,2.22);
		
		System.out.println(Cy1.getRadius());
		//System.out.println(Cy1.setHeight());
		//System.out.println(Cy1.getVolume());
		
		System.out.println(Cy1.toString());
		System.out.println(Cy1.findArea());
		
	}
}