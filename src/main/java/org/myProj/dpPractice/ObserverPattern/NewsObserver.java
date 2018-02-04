package org.myProj.dpPractice.ObserverPattern;

public class NewsObserver  extends Observer{
	public NewsObserver(Subject subject) {
	      this.subject = subject;
	      this.subject.attach(this);
	}

	@Override
	public void update() {
	      System.out.println( "News watcher: channel " + subject.getState()  ); 
	}
}
