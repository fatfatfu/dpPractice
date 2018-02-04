package org.myProj.dpPractice.TemplatePattern;

public abstract class GameTemplate {
	abstract void create();

	abstract void start();

	abstract void end();

	public final void play() {

		create();
		start();
		end();
	}
}
