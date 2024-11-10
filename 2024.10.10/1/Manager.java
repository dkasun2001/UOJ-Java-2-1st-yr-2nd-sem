public class Manager extends Employee{
	protected double baseSalary;
	protected double bonus;
	
	public Manager(String name,int age, String gender,double baseSalary,double bonus){
		super(name,age,gender);
		this.baseSalary = baseSalary;
		this.bonus = bonus;
	}
	
	public double calculateSalary(){
		return (this.baseSalary+this.bonus);
	};
	
	public String displayEmployeeDetails(){
		return(" Name: "+super.name+"\n Age:"+super.age+"\n Gender: "+super.gender+"\n Base Salary: "+this.baseSalary+"\n Bonus: "+this.bonus+"\n Salary: "+calculateSalary());
	};
}