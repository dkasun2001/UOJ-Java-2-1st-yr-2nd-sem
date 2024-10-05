public class Labrador extends Dog{
	private String colour;
	
	public Labrador(String name, String colour){
		super(name);
		this.colour = colour;
	}
	
	public String getColour(){
		return (this.colour);
	}
	
	@Override
	public String getName(){
		return (super.getName());
	}
	
	@Override
	public String speak(){
		return("Woof! Woof!");
	}
	
	@Override
	public String toString(){
		return "The Labrador "+getName();
	}
}