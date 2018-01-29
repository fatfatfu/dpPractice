package org.myProj.dpPractice.domain;

import org.myProj.dpPractice.StrategyDesignPattern.Strategy;

public class OperationAddV2 implements Strategy {

	@Override
	public double doOperation(double num1, double num2) {
		// TODO Auto-generated method stub
		return num1+num2;
	}
}
