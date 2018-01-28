package org.myProj.dpPractice.domain;

public class OperationSub extends OperationFather {
	@Override
	public double getResult() {
		return getNumA()-getNumB();
	}
}
