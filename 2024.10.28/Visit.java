class Visit{
	private Customer customer;
	private DiscountRate discountRate;
	private Date date;
	private double serviseExpense;
	private double productExpense;
	
	public Visit(Customer customer,double serviseExpense,double productExpense,DiscountRate discountRate,Date date){
		this.customer=customer;
		this.serviseExpense=serviseExpense;
		this.productExpense=productExpense;
		this.discountRate=discountRate;
		this.date=date;
	}
	
	public String getName(){
		return this.customer.getName();
	}
	
	public String getDate(){
		return this.date.getDate();
	}
	
	
	public double getServiseExpense(){
		return this.serviseExpense-(this.serviseExpense*discountRate.getServiseDiscount());
	}
	
	public void setServiseExpense(double ex){
		this.serviseExpense=ex;
	}
	
	public double getProductExpense(){
		return this.productExpense-(this.productExpense*this.discountRate.getProductServiseDiscount());
	}
	
	public void setProductExpense(double ex){
		this.productExpense=ex;
	}
	
	public double getTotalExpense(){
		return (this.getProductExpense()+this.getServiseExpense());
	}
	
	public String toString(){
		return (this.customer.toString()+"\nTotal Expense: "+this.getProductExpense()+" + "+this.getServiseExpense()+" = "+this.getTotalExpense()+"\nDate = "+this.getDate());
	}
	
	
	
}