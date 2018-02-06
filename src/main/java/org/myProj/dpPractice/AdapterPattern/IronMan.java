package org.myProj.dpPractice.AdapterPattern;

public class IronMan implements IMarvelHero{

	@Override
	public void superability() {
		System.out.println("Iron man ability :Hi-tech armor and rich");
	}

	@Override
	public void movie() {
		System.out.println("Iron man in the movie");
	}

}
