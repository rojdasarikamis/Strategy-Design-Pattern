package players;

import permissions.Foot_No_Strike;
import permissions.Hand_No_Strike;
import player.player1;

public class Football_Referee extends player1{
	
	public Football_Referee(String name) {
		super(name);

		setHand_Holding_Behaviour(new Hand_No_Strike());
		setFooting_Holding_Behaviour(new Foot_No_Strike());
	}

}

