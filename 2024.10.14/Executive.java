public class Executive extends Employee{
	private double bounes;
	
	public Employee(String name, String phone,double payRate,double bounes){
		super(name,phone,payRate);
		this.bounes = bounes;
	} 
	
	@Override
	public double pay(){
		return payRate+bounes;
	}
}