package org.myProj.dpPractice.StrategyDesignPattern;

public class CurveBall implements IBreakingBall{

	@Override
	public String movement(String direction, String leftOrRight) {
		if(direction.equalsIgnoreCase("horizontal")){
			return "pitcher connot throw a "+ direction+" "+this.getClass().getSimpleName();
		}else{
			return leftOrRight+" pitcher throw a "+ direction+" "+this.getClass().getSimpleName();
		}
	}

}
