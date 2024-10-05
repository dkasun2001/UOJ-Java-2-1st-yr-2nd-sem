abstract public class Shape{
	private String color = "red";
	private boolean filled = true;
	
	public Shape(){
		this.color = "red";
		this.filled = true;
	}
	
	public Shape(String color, boolean filled){
		this.color = color; 
		this.filled =filled;
	}
	
	public String getColor(){
		return this.color;
	}
	
	public void setColor(String color){
		this.color = color;
	}
	
	public boolean isFilled(){
		return this.filled;
	}
	
	public void setFilled(boolean filled){
		this.filled = filled;
	}
	
	public String toString(){
		return "Shape[Color = "+getColor()+", isFilled = "+isFilled()+"  ]";
	}
	
	public abstract double getArea() ;
	
	public abstract double getPerimeter();
	
	
}