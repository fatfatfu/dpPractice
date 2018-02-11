package org.myProj.dpPractice.StrategyDesignPattern;

public class Slider implements IBreakingBall{
	
	@Override
	public String movement(String direction, String leftOrRight) {
		return leftOrRight+" pitcher throw a "+ direction+" "+this.getClass().getSimpleName();
	}

}
