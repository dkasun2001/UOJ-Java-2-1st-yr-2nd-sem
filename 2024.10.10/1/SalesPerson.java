public class SalesPerson extends Manager{
	protected double commissionRate;
	
	public SalesPerson(String name,int age, String gender,double baseSalary,double bonus, double commissionRate){
		super(name,age,gender,baseSalary,bonus);
		this.commissionRate = commissionRate;
	}
	
	@Override
	public double calculateSalary(){
		return (super.baseSalary+(super.baseSalary*this.commissionRate));
	};
	
	@Override
	public String displayEmployeeDetails(){
		return(super.displayEmployeeDetails()+"\n Commission Rate: "+this.commissionRate);
	};
}