class PaypalPayment extends Payment{
	private double accBalance;
	private double depositBalance;
	
	public PaypalPayment(double paymentAmount,double accBalance){
		super(paymentAmount);
		this.accBalance= accBalance;
	}
	
	public PaypalPayment(double paymentAmount,double accBalance,double depositBalance){
		super.(paymentAmount);
		this.accBalance= accBalance;
		this.depositBalance=depositBalance;
	}
	
	public void setDepositBalance(depositBalance){
		this.depositBalance=depositBalance;
	}
	
	public void getAccBalance(){
		System.out.println(this.accBalance);
	}
	
	public void processPayment(double payment){
		return("Your payment has been successfull")
	}
}