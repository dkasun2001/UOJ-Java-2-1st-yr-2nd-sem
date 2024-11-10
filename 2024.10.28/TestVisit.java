class TestVisit{
	public static void main(String[] args){
		Customer Kasun = new Customer("Kasun",false);
		Customer Dinu = new Customer("Dinu",true,"Premium");
		
		DiscountRate Premium = new DiscountRate("Premium");
		DiscountRate Gold = new DiscountRate("Gold");
		DiscountRate Silver = new DiscountRate("Silver");
		DiscountRate No = new DiscountRate("No");
		
		Date D10_11_2024 = new Date(10,11,2024);
		
		Visit V1 = new Visit(Kasun,1346.55,3342.4,No,D10_11_2024);
		Visit V2 = new Visit(Dinu,1500.00,1000.00,Premium,D10_11_2024);
		
		System.out.println(V1);
		System.out.println();
		System.out.println(V2);
	}
}