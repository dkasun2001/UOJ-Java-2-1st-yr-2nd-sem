public class Yorkshire extends Dog{
	public Yorkshire(String name){
		super(name);
	}
	
	@Override
	public String speak(){
		return("Bak! Bak!");
	}
	
	@Override
	public String getName(){
		return (super.getName());
	}
	
	@Override
	public String toString(){
		return "The Yorkshire "+getName();
	}
}