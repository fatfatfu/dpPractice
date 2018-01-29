package org.myProj.dpPractice.domain;

import org.myProj.dpPractice.StrategyDesignPattern.Strategy;

public class OperationSubV2 implements Strategy {

	@Override
	public double doOperation(double num1, double num2) {
		return num1-num2;
	}
	
}
