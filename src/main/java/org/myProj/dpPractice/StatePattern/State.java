package org.myProj.dpPractice.StatePattern;

public interface State {
	public void Handle(Context context);

	public String nowState();
}
