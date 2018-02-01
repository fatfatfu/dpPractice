package org.myProj.dpPractice.FactoryMethodDesignPattern;

public class OperationFactory {
	public Ifactory getOperation(String operate) {
		if(operate==null){
			return null;
		}
		if(operate.equalsIgnoreCase("ADD")){
			return new AddFactory();
		}
		if(operate.equalsIgnoreCase("SUB")){
			return new SubFactory();
		}
		return null;
	}
}
