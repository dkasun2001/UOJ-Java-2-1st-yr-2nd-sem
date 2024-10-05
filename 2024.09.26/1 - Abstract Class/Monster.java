abstract public class Monster{
	private String name;
	public Monster(String name){
		this.name=name;
	}
	
	public String attack(){
		return "@!#!$! don't know how to attack";
	}
	
	abstract public String abstractAttack();

}