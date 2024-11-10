abstract public class Shape{
	private String color;
	
	public Shape(String color){
		this.color = color; 
	}
	
	public String toString(){
		return "Shape[Color is "+this.color+" ]";
	}
	
	abstract public double getArea(); 
	// incomplete because the definition is missing
}