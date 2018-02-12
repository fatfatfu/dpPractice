package org.myProj.dpPractice.BridgePattern;

public class MobileTool implements MobileSoftware{

	@Override
	public void execute(String name) {
		System.out.println("run tool : "+name);		
	}

}
