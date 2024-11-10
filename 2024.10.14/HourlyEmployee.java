public class HourlyEmployee extends Employee{
	private double hoursWorked;
	
	public Employee(String name, String phone,double payRate,double hoursWorked){
		super(name,phone,payRate);
		this.hoursWorked = hoursWorked;
	} 
	
	@Override
	public double pay(){
		return payRate*hoursWorked;
	}
}