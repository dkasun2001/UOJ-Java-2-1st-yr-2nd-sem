public class CheckingAccount extends BankAccount{
	public CheckingAccount(double checkingAmount){
		super(checkingAmount);
	}
	
	public void deposit(double amount){
		bankBalance += amount;
		System.out.println("Deposit amount: "+amount+"\n Checking Account Balance: "+bankBalance);
	};
	
	
	public void withdraw(double amount){
		double fee = (amount*0.1);
		if(bankBalance > (amount+fee)){
			bankBalance -= (amount+fee);
			System.out.println("Withdraw amount: "+amount+"\n Fee "+fee+"\n Checking Account Balance: "+bankBalance);
		}else{
			System.out.println("Account Balance is not sufficient\n Checking Account Balance: "+bankBalance);
		}
		
	
		
	/*public String toString(){
		return "Checking Account Balance is "+getBankBalance();
	}*/	
		
		
	};
	
	
}