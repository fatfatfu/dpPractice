package org.myProj.dpPractice.StatePattern;

public class ElevatorDownState implements State{

	@Override
	public void Handle(Context context) {
		System.out.println("Elevator goes down");
		context.setState(this);	
		System.out.println(this.nowState());
	}

	public String nowState(){
		return "DOWN NOW";
	}
	
}
