public class TestInvoice{
	public static void main(String[] args){
		Customer C1 = new Customer(7,"Kasun",30);
		
		Invoice I1 = new Invoice(70,C1,10000);
		
		System.out.println(I1);
	}
}