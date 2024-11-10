abstract public class Payment{

	protected double paymentAmount;
	
	public Payment(double paymentAmount){
		this.paymentAmount=paymentAmount;
	}
	
	abstract void processPayment(double payment);
}