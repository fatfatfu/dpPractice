package org.myProj.dpPractice.TemplatePattern;

public class BasketBallGame extends GameTemplate{

	@Override
	void create() {
		System.out.println("Create BasketBall court");
	}

	@Override
	void start() {
		System.out.println("play "+BasketBallGame.class.getSimpleName());
	}

	@Override
	void end() {
		System.out.println("play "+BasketBallGame.class.getSimpleName()+" for 48 minutes");
	}

}
