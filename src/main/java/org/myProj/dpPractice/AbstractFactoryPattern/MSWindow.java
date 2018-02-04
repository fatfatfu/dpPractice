package org.myProj.dpPractice.AbstractFactoryPattern;

public class MSWindow implements Window{

	@Override
	public void setTitle(String text) {
		System.out.println("window os title: "+text);
	}

	@Override
	public void repaint() {
		System.out.println("MS Windows specific behaviour");
	}


}
