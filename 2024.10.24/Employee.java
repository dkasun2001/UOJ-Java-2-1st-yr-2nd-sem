abstract public class Employee{
	protected int id;
	protected String name;
	protected int age;
	
	public Employee(int id,String name,int age){
		this.id = id;
		this.name = name;
		this.age =age;
	}
	
	@Override
	public String toString(){
		return ("Employee name : "+this.name+", id : "+this.id+", age : "+this.age);
	}
	
}