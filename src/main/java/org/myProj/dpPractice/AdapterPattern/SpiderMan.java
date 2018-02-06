package org.myProj.dpPractice.AdapterPattern;

public class SpiderMan implements ISonyHero{

	@Override
	public void power() {
		System.out.println("Spider Man ability : shoot web");
	}

	@Override
	public void movie() {
		System.out.println("Spider Man in the movie");
	}

}
