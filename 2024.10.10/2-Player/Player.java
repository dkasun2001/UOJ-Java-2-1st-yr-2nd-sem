import java.util.Scanner;
public class Player{
	private String name;
	private String team;
	private int jerseyNumber;
	
	public void setName(String name){
		this.name = name;
	}
	
	public void setTeam(String team){
		this.team = team;
	}
	
	public void setJerseyNumber(int jerseyNumber){
		this.jerseyNumber = jerseyNumber;
	}
	
	public String getName(){
		return this.name;
	}
	
	public String getTeam(){
		return this.team;
	}
	
	public int getJerseyNumber(){
		return this.jerseyNumber;
	}
	
	public void readPlayer(Player p1){
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Name: ");
		name = scan.nextLine();
		p1.setName(name);
		
		
		System.out.print("Team: ");
		team = scan.nextLine();
		p1.setTeam(team);
		
		System.out.print("Jersey Number: ");
		jerseyNumber = scan.nextInt();
		p1.setJerseyNumber(jerseyNumber);
		
	}
}