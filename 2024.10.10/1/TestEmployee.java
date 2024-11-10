class TestEmployee{
	public static void main(String[] args){
		Employee manager = new Manager("Kasun",23, "Male",150000,20453);
		Employee worker = new Worker("Kamal",50, "Male",4599,4);
		Employee salesPerson = new SalesPerson("Tharu",20, "21",112000,23000, 5);
		
		
		System.out.println(salesPerson.calculateSalary());
		System.out.println(worker.calculateSalary());
		
		System.out.println(worker.displayEmployeeDetails());
		System.out.println(salesPerson.displayEmployeeDetails());
		
		
	}
}