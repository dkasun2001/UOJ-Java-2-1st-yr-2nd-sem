abstract public class Vehical{
	protected String numPlate;
	protected String color;
	protected int buildYear;
	
	

	public Vehical(String numPlate,String color,int buildYear){
		this.numPlate = numPlate;
		this.color = color;
		this.fuelCapacity = buildYear;
	}
	
	@Override
	abstract public double calculateRange();
	
	@Override
	abstract public double calculateBalanceFuel();
	
	@Override
	public String toString(){
		return ("Vehical N0. : "+this.numPlate+"\nColor : "+this.color+"\nBuild Year:"+this.buildYear);
	}
	
}