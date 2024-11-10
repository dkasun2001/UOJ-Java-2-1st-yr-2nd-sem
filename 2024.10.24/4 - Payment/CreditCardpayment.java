public class CreditCardpayment extends Payment{
	private double creditcardLimit;
	
	public CreditCardpayment(double paymentAmount, double creditcardLimit){
		super(paymentAmount);
		this.creditcardLimit =creditcardLimit;
	}
	
	
	public void processPayment(double payment){
		
		if(super.paymentAmount<=this.creditcardLimit){
			this.creditcardLimit=this.creditcardLimit-super.paymentAmount;
			System.out.println("Your payment has been successfull/nCredit Limit : "+this.creditcardLimit);
		}else{
			System.out.println("Your payment has been unsuccessfull\nYour have't enough Credit Limit : "+this.creditcardLimit);
		}
		
		return("Your payment has been successfull")
	}
	
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