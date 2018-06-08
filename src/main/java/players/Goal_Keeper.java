package players;

import permissions.Foot_Strike;
import permissions.Hand_Strike;
import player.player1;

public class Goal_Keeper extends player1{

	public Goal_Keeper(String namee) {
		super(namee);
		setHand_Holding_Behaviour(new Hand_Strike());
		setFooting_Holding_Behaviour(new Foot_Strike());
		
	}

	

	
	
}