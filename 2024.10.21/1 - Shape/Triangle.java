public class Triangle extends Shape{
	private int base;
	private int height;
	
	public Triangle(String color, int base, int height){
		super(color); 
		this.base = base;
		this.height = height;
	}
	
	@Override
	public double getArea(){
		return((this.base*this.height)/2);
	}
	
	@Override
	public String toString(){
		return (super.toString()+" and Triangle[Base is "+this.base+", Height is "+this.height+" ]");
	}
	
}