package org.myProj.dpPractice.ObserverPattern;

public class StockObserver extends Observer{
	public StockObserver(Subject subject) {
	      this.subject = subject;
	      this.subject.attach(this);
	}
	
	@Override
	public void update() {
	    System.out.println( "Stock watcher : stock 10" + subject.getState()  ); 
	}

}
