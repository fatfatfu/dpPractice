package org.myProj.dpPractice.BridgePattern;

public class MobileGame implements MobileSoftware{

	@Override
	public void execute(String name) {
		System.out.println("execute game : "+name);
	}

}
