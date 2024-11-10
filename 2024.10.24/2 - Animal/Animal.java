abstract public class Animal{
	private String color;
	private String animalType;
	private String gender;
	private String sound;
	
	public Employee(String color,String animalType,String gender){
		this.color = color;
		this.animalType = animalType;
		this.gender =gender;
		this.sound =sound;
	}
	
	public void getColour(){
		System.out.println(this.color);
	}
	
	public void setColour(String color){
		this.color = color
	}
	
	public void getAnimalType(){
		System.out.println(this.animalType);
	}
	
	public void setAnimalType(String animalType){
		this.animalType = animalType
	}
	
	public void getGender(){
		System.out.println(this.gender);
	}
	
	public void setGender(String gender){
		this.gender = gender
	}
	
	public void getSound(){
		System.out.println(this.sound);
	}
	
	public void setSound(String sound){
		this.sound = sound;
	}
	
	@Override
	public String toString(){
		return ("Animal Type : "+this.animalType+"\nColour : "+this.color+"\nGender : "+this.gender+"\nSound : "+this.sound);
	}
	
}