package org.myProj.dpPractice.TemplatePattern;

public class BaseBallGame extends GameTemplate{

	@Override
	void create() {
		System.out.println("Create Baseball field");		
	}

	@Override
	void start() {
		System.out.println("play "+BaseBallGame.class.getSimpleName());		
	}

	@Override
	void end() {
		System.out.println("play "+BaseBallGame.class.getSimpleName()+" for 9 innings");
	}

}
