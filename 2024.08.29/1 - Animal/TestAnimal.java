public class TestAnimal{
	public static void main(String [] args){
		
		Dog D1 = new Dog("Dog1");
		Dog D2 = new Dog("Dog2");
		System.out.println(D1);
		
		D1.greets();
		D1.greets(D2);
		
		Cat C1 = new Cat("Cat1");
		System.out.println(C1);
		C1.greets();
	}
}