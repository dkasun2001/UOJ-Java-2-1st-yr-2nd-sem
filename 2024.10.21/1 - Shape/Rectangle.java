public class Rectangle extends Shape{
	private int length;
	private int width;
	
	public Rectangle(String color, int length, int width){
		super(color); 
		this.length = length;
		this.width = width;
	}
	
	@Override
	public double getArea(){
		return(this.length*this.width);
	}
	
	@Override
	public String toString(){
		return (super.toString()+" and Rectangle[Length is "+this.length+", Width is "+this.width+" ]");
	}
	
}