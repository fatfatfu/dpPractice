package org.myProj.dpPractice.StrategyDesignPattern;


public class StrategyOperation {
	private Strategy strategy;
	public StrategyOperation(Strategy strategy) {
		// TODO Auto-generated constructor stub
		this.strategy = strategy;
	}
	
	public double execStrategy(double num1,double num2){
		return strategy.doOperation(num1, num2);
	}
	
}
