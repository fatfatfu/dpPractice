package org.myProj.dpPractice.BuilderPattern;

public class Wrapper implements PackingMethod{

	@Override
	public String pack() {
		return Wrapper.class.getSimpleName();
	}

}
