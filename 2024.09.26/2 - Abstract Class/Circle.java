public class Circle extends Shape{
	private double radius = 1.0;
	
	public Circle(){
		super();
		this.radius = 1.0;
	}
	
	public Circle(double radius){
		super();
		this.radius = radius;
	}
	
	public Circle(double radius, String color, boolean filled){
		super(color, filled);
		this.radius = radius;
	}
	
	public double getRadius(){
		return this.radius;
	}
	
	public void setRadius(double radius){
		this.radius = radius;
	}
	
	public double getArea(){
		return(3.14*this.radius*this.radius);
	}
	
	public double getPerimeter(){
		return(2*3.14*this.radius);
	}
	
	@Override
	public String toString(){
		return "Circle [ "+super.toString()+", radius = "+getRadius()+" ]";
	}
	
	
}