package org.myProj.dpPractice.ChainOfResbosponibilityPattern;

public class President extends AbstractPosition {
	public President(int level) {
		this.level = level;
	}

	@Override
	protected void write(String message) {
		System.out.println("公文流程 : " + message);
	}
}
