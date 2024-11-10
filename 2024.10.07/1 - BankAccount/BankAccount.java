public abstract class BankAccount{
	protected double bankBalance=0;
	
	public BankAccount(double bankBalance){
		this.bankBalance = bankBalance;
		
	}
	
	public BankAccount(){
		this.bankBalance = 0;
		
	}
	
	public abstract void deposit();
	public abstract void withdraw();
}