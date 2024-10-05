public class DogTest{
	
	public static void poke(Dog d){
			System.out.println(" "+d+" says " +d.speak());
			// System.out.println("and its average weight is "+d.avgBreedWeight())
		}
		
	public static void main(String[] args){
		Dog dog = new Dog("Spike");
		System.out.println(dog.getName()+" says "+dog.speak());
		
		Dog L1 = new Labrador("Timmy","Brown");
		System.out.println(L1.getName()+" says "+L1.speak());
		
		Dog Y1 = new Yorkshire("Lassy");
		System.out.println(Y1.getName()+" says "+Y1.speak());
		
		poke(dog);
		poke(L1);
		poke(Y1);
		
		
		
		
		
		
	} 
}