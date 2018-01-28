package org.myProj.dpPractice.domain;

public class SimpleOperation {
	
	public static OperationFather getInstance(String oper){
		OperationFather operation = null;
		switch (oper) {
		case "+":
			operation = new OperationAdd();
			break;
		case "-":
			operation = new OperationSub();
			break;
		default:
			break;
		}
		return operation;
	}
}
