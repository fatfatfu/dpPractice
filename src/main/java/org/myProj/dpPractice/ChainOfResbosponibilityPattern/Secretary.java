package org.myProj.dpPractice.ChainOfResbosponibilityPattern;

public class Secretary extends AbstractPosition{
	public Secretary(int level) {
		this.level = level;
	}

	@Override
	protected void write(String message) {
		System.out.println("公文流程 : " + message);
	}
}
