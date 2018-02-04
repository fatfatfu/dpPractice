package org.myProj.dpPractice.BuilderPattern;

public class Bottle implements PackingMethod{

	@Override
	public String pack() {
		return Bottle.class.getSimpleName();
	}

}
