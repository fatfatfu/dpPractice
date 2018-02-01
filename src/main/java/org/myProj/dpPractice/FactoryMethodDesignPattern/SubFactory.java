package org.myProj.dpPractice.FactoryMethodDesignPattern;

public class SubFactory implements Ifactory{

	@Override
	public void createOperaion() {
		System.out.println("createOperaion() : Sub Operation");
	}
	
}
