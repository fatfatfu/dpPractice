package org.myProj.dpPractice.StrategyDesignPattern;

public class BreakingBall {
	private IBreakingBall breakingball;

	public BreakingBall(IBreakingBall breakingball) {
		this.breakingball = breakingball;
	}

	public String pitch(String direction, String leftOrRight) {
		return breakingball.movement(direction, leftOrRight);
	}

}
