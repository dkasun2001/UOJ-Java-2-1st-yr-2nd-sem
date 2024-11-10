public class PartTimeEmployee extends Employee{
	private double hourlyRate;
	private double worksHours;
	
	public PartTimeEmployee(int id,String name,int age,double hourlyRate,double worksHours;){
		super(id,name,age);
		this.hourlyRate = hourlyRate;
		this.worksHours = worksHours;
	} 
	
	public void calSalary(){
		System.out.println("Part-Time Salary : $"+(hourlyRate*worksHours))
	}
	
	@Override
	public String toString(){
		return (super.toString()+", Hourly Rate : $"+this.hourlyRate+", Works Hours : "+this.worksHours);
	}
}