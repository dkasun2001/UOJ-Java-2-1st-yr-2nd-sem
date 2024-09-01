public class Shape{
	private String color;
	
	public Shape(String color){
		this.color = color; 
	}
	
	public String toString(){
		return "Shape[Color is "+this.color+" ]";
	}
	
	public double getArea(){
		System.err.println("Shape unknown! cannot compute area");
		return 0;
	}
}