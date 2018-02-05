package org.myProj.dpPractice.StatePattern;

public interface State {
	public void handle(Context context);

	public String nowState();
}
