package players;

import permissions.Foot_Strike;
import permissions.Hand_No_Strike;
import player.player1;

public class Midfielder extends player1{

	public Midfielder(String nameee) {
		super(nameee);

		setFooting_Holding_Behaviour(new Foot_Strike());
		setHand_Holding_Behaviour(new Hand_No_Strike());
	}
	
}
