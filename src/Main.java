
import player.player1;
import players.Football_Referee;
import players.Goal_Keeper;
import players.Midfielder;
import players.Pivot;

/**
 * 
 * @author RojdaSarikamýþ
 *
 */

public class Main {
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		player1 Manuel_Neuer = new  Goal_Keeper("MANUEL NEURER");
		Manuel_Neuer.Hand_Situation();
		Manuel_Neuer.Foot_Situation();
		
		
		
		player1 Cuneyt_Cakir =new Football_Referee("CÜNEYT ÇAKIR");
		Cuneyt_Cakir.Hand_Situation();
		Cuneyt_Cakir.Foot_Situation();
		
		
		
		player1 Paul_Pogba = new Midfielder("PAUL POGBA");
		Paul_Pogba.Hand_Situation();
		Paul_Pogba.Foot_Situation();
		
		
		
		player1 No_Name = new Pivot ();
		No_Name.Hand_Situation();
		No_Name.Foot_Situation();
		
	
	}

}
