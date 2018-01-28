package org.myProj.dpPractice.domain;

public class OperationAdd extends OperationFather {
	@Override
	public double getResult() {
		return getNumA()+getNumB();
	}
}
