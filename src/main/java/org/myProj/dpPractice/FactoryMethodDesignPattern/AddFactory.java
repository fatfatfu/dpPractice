package org.myProj.dpPractice.FactoryMethodDesignPattern;

public class AddFactory implements Ifactory{

	@Override
	public void createOperaion() {
		System.out.println("createOperaion() : Add Operation");
	}
	
}
