package org.myProj.dpPractice.ChainOfResbosponibilityPattern;

public abstract class AbstractPosition {
	public static int WORKER = 1;
	public static int SECRETARY = 2;
	public static int BOSS = 3;

	protected int level;

	// next element in chain or responsibility
	protected AbstractPosition nextPos;

	public void setNextPos(AbstractPosition nextPos) {
		this.nextPos = nextPos;
	}

	public void logMessage(int level, String message) {
		if (this.level == level) {
			write(message);
		}
		if (this.level+1 == level) {
			write("處理中");
		}
		if (nextPos != null) {
			nextPos.logMessage(level, message);
		}
	}

	abstract protected void write(String message);
}
