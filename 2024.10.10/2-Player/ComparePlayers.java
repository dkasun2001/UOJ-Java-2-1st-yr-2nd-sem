import java.util.Scanner;
public class ComparePlayers{
	public static void main(String[] args){
		Player player1 = new Player();
		Player player2 = new Player();
		Scanner scan = new Scanner(System.in);
		
		player1.readPlayer(player1);
		player2.readPlayer(player2);
		
		if((player1.getJerseyNumber()==player2.getJerseyNumber()) && (player1.getTeam().equals(player2.getTeam()))){
			System.out.println("The Two players are equals");
		}else{
			System.out.println("The Two players are not equals");
		}
		
		//Prompt for and read in information for player 1
		//Prompt for and read in information for player 2
		//Compare player 1 to player 2 and print a message saying
		//Whether they are equal		
	} 	
}