class DiscountRate{
	
	private double serviseDiscount;
	private double productServiseDiscount;
	
	private double serviceDiscountPremium =0.20;
	private double serviceDiscountGold =0.15;
	private double serviceDiscountSilver =0.10;
	
	private double productServicePremiumDiscount =0.10;
	private double productServiceGoldDiscount =0.10;
	private double productServiceSilverDiscount =0.10;
	
	public DiscountRate(String type){
		this.getServiseDiscountRate(type);
		
	}
	
	public void getServiseDiscountRate(String type){
		if(type.equals("Premium")){
			this.serviseDiscount= this.serviceDiscountPremium;
			this.productServiseDiscount=this.productServicePremiumDiscount;
		}
		else if(type.equals("Gold")){
			this.serviseDiscount= this.serviceDiscountGold;
			this.productServiseDiscount=this.productServiceGoldDiscount;
		}
		else if(type.equals("Silver")){
			this.serviseDiscount= this.serviceDiscountSilver;
			this.productServiseDiscount=this.productServiceSilverDiscount;
		}else{
			this.serviseDiscount= 0;
			this.productServiseDiscount=0.10;
		}
	}
	
	public double getServiseDiscount(){
		return serviseDiscount;
	}
	
	public double getProductServiseDiscount(){
		return productServiseDiscount;
	}
}