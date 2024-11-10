public class PermentEmployee extends Employee{
	private double monthlySalary;
	
	public PermentEmployee(int id,String name,int age,double monthlySalary){
		super(id,name,age);
		this.monthlySalary = monthlySalary;
	} 
	
	@Override
	public String toString(){
		return (super.toString()+", Monthly Salary : $"+this.monthlySalary);
	}
}