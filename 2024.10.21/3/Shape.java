public interface Shape{
	double getArea();
public class Rectangle implements Shape{
	private int length;
	private int width;
	public Rectangle(int length,int width){
		this.length =length;
		this.width=width;
	}
	
	
	public String toString(){
		return"dfsdf";
	}
	
	//now we are implementing the abstract methods defined in the interface
	
	
	public double getArea(){
		return 3;
	}
}	
}