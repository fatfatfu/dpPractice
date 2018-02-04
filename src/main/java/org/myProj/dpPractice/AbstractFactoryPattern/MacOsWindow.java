package org.myProj.dpPractice.AbstractFactoryPattern;

public class MacOsWindow implements Window{

	@Override
	public void setTitle(String text) {
		System.out.println("MAC os title: "+text);		
	}

	@Override
	public void repaint() {
		System.out.println("MAC Windows specific behaviour");
	}

}
