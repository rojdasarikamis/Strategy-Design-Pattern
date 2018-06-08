package players;

import permissions.Foot_No_Strike;
import permissions.Hand_Strike;
import player.player1;

public class Pivot extends player1{
	
	public Pivot() {
		
		setHand_Holding_Behaviour(new Hand_Strike());
		setFooting_Holding_Behaviour(new Foot_No_Strike());
		
		
	}

}
