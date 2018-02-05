package org.myProj.dpPractice.StatePattern;

public class ElevatorStopState implements State {

	@Override
	public void handle(Context context) {
		context.setState(this);
		if(context.getFloor()==0){
			System.out.println("WAITING IN LOBBY");
		}else{
			context.setState(new ElevatorUpState());
			context.getState().handle(context);
		}
	}

	public String nowState() {
		return "LOBBY NOW";
	}
}
