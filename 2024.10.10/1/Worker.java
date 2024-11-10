public class Worker extends Employee{
	protected double hourlyRate;
	protected double hoursWork;
	
	public Worker(String name,int age, String gender,double hourlyRate,double hoursWork){
		super(name,age,gender);
		this.hourlyRate = hourlyRate;
		this.hoursWork = hoursWork;
	}
	
	public double calculateSalary(){
		return (this.hoursWork*this.hourlyRate);
	};
	
	public String displayEmployeeDetails(){
		return(" Name: "+super.name+"\n Age:"+super.age+"\n Gender: "+super.gender+"\n Hourly Rate: "+this.hourlyRate+"\n Hours Work: "+this.hoursWork+"\n Salary: "+calculateSalary());
	};
}