package org.myProj.dpPractice.ChainOfResbosponibilityPattern;

public class Normalworker extends AbstractPosition {
	public Normalworker(int level) {
		this.level = level;
	}

	@Override
	protected void write(String message) {
		System.out.println("公文流程 : " + message);
	}

}
