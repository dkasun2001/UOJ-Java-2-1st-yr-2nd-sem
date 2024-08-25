public class TestCylinder{
	public static void main(String[] args){
		Cylinder Cy1 = new Cylinder();
		Cylinder Cy2 = new Cylinder(8.4);
		Cylinder Cy3 = new Cylinder(73.4,33);
		Cylinder Cy4 = new Cylinder(23.4,33,"Blue");
		
		System.out.println("Properties of Cylinder Cy1 is "+Cy1.getRadius()+". Height is "+Cy1.getHeight()+". Colour is "+Cy1.getColour());
		System.out.println("Properties of Cylinder Cy2 is "+Cy2.getRadius()+". Height is "+Cy2.getHeight()+". Colour is "+Cy2.getColour());
		System.out.println("Properties of Cylinder Cy3 is "+Cy3.getRadius()+". Height is "+Cy3.getHeight()+". Colour is "+Cy3.getColour());
		System.out.println("Properties of Cylinder Cy4 is "+Cy4.getRadius()+". Height is "+Cy4.getHeight()+". Colour is "+Cy4.getColour());
	}
}