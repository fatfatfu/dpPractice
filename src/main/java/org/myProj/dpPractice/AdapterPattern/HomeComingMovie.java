package org.myProj.dpPractice.AdapterPattern;

public class HomeComingMovie extends SpiderMan implements ISonyHero {
	private IronMan rdj;
	public HomeComingMovie(IronMan ironman) {
		this.rdj = ironman;
	}
	
	@Override
	public void power() {
		super.power();
	}

	@Override
	public void movie() {
		super.movie();
		System.out.println("make iron man in "+HomeComingMovie.class.getSimpleName());
		rdj.movie();
	}

}
