package permissions;

import behaviours.Hand_Holding_Behaviour;

public class Hand_No_Strike implements Hand_Holding_Behaviour{

	@Override
	public void Hand_Holding() {
		// TODO Auto-generated method stub
		System.out.println("The player can not catch and shoot the ball with the hand !!!");
		
	}
	

}
