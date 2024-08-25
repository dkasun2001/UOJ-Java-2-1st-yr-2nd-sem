public class Invoice{
	private Customer customer;
	private int id;
	private double amount;
	
	public Invoice(int id,Customer customer,double amount){
		this.id = id;
		this.customer = customer;
		this.amount=amount;
	}
	
	public int getId(){
		return this.id;
	}
	
	public Customer getCustomer(){
		return this.customer;
	}
	
	public void setCustomer(Customer customer){
		this.customer = customer;
	}
	
	public double getAmount(){
	 	return this.amount;
	 }
	 
	public void setAmount(double amount){
		this.amount = amount;
	}
	
	public int getCustomerId(){
		return this.customer.getId();
	}
	
	public String getCustomerName(){
		return this.customer.getName();
	}
	
	public int getCustomerDiscount(){
		return this.customer.getDiscount();
	}
	
	public double getAmountAfterDiscount(){
		return(this.amount =this.amount-(this.amount*this.customer.getDiscount())/100); 
	}
	
	public String toString(){
		return("Invoice[id = "+this.id+" Customer = "+this.customer.getName()+" id: "+this.customer.getId()+" discount: "+this.customer.getDiscount()+"%"+" Amount: "+getAmountAfterDiscount()+"]");
	}
	
	
}