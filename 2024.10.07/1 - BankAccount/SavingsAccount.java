public class SavingsAccount extends BankAccount{
	public SavingsAccount(double savingsAmount){
		super(bankBalance);
	}
	
	public void deposit(double amount){
		bankBalance += amount;
		System.out.println("Deposit amount: "+amount+"\n Savings Account Balance: "+bankBalance);
	};
	
	
	public void withdraw(double amount){
		if(bankBalance > amount){
			bankBalance -= amount;
			System.out.println("Withdraw amount: "+amount+"\n Savings Account Balance: "+bankBalance);
		}else{
			System.out.println("Account Balance is not sufficient\n Savings Account Balance: "+bankBalance);
		}	
	};
	
	public Double getBankBalance(){
		return bankBalance;
	}
	
	public String toString(){
		return "Savings Account Balance is "+ getBankBalance();
	}
	
	
}