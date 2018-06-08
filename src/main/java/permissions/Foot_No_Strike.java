package permissions;

import behaviours.Footing_Holding_Behaviour;

public class Foot_No_Strike implements Footing_Holding_Behaviour {

	@Override
	public void Footer_Holding() {
		// TODO Auto-generated method stub
		System.out.println("The player can not catch and shoot the ball with the foot !!!");
		System.out.println(" ");
	}

}
