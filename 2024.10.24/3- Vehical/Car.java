public class Car extends Vehical{
	private double fuelEfficincy = 15;
	private double fuelCapacity;
	
	public Car(String numPlate,String color,int buildYear){
		super(numPlate,color,buildYear);
		this.fuelCapacity=fuelCapacity;
	
	} 
	
	public double calculateRange(){
		return (this.fuelCapacity*this.fuelEfficincy);
	};
	
	@Override
	public String toString(){
		return (super.toString()+"\nRange :"+calculateRange());
	}
	
	
}