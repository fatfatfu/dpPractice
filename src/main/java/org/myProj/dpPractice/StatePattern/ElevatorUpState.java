package org.myProj.dpPractice.StatePattern;

public class ElevatorUpState implements State{

	@Override
	public void handle(Context context) {
		
		context.setState(this);
		if(context.getFloor()<10){
			System.out.println("Elevator goes up");
		}else{
			if(context.getFloor()==10){
				System.out.println("Top floor");
				context.setState(new ElevatorDownState());
				context.getState().handle(context);
			}
		}
	}
	
	public String nowState(){
		return "UP NOW";
	}

}
