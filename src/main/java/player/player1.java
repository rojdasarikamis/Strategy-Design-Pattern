package player;

import behaviours.Footing_Holding_Behaviour;
import behaviours.Hand_Holding_Behaviour;

public abstract class player1 {
	
	private Hand_Holding_Behaviour Hand_Holding_Behaviour1;
	private Footing_Holding_Behaviour Footing_Holding_Behaviour1;
	
	
	public player1() {
		this("not defined");
	}
	
	public player1(String name) {
		// TODO Auto-generated constructor stub
		System.out.println("The name of the player is " +name);
	}

	protected void  setHand_Holding_Behaviour(Hand_Holding_Behaviour Hand) {
		this.Hand_Holding_Behaviour1=Hand;
	}
	
	protected void setFooting_Holding_Behaviour(Footing_Holding_Behaviour Footer) {
		this.Footing_Holding_Behaviour1=Footer;
	}
	
	
	public void Hand_Situation() {
		this.Hand_Holding_Behaviour1.Hand_Holding();
		
	}
	
	public void Foot_Situation() {
		
		this.Footing_Holding_Behaviour1.Footer_Holding();
		
	}
	
}
