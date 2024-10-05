public class Dog{
	private String name;
	
	public Dog(String name){
		this.name = name;
	}
	
	public String toString(){
		return this.name;
	}
	
	public String speak(){
		return("Bark! Bark!");
	}
	
	public String getName(){
		return (this.name);
	}
}