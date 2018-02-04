package org.myProj.dpPractice.FacadePattern;

public class StockT2 implements Stock{

	@Override
	public void buy() {
		System.out.println("BUY "+StockT2.class.getSimpleName());		
	}

	@Override
	public void sell() {
		System.out.println("SELL "+StockT2.class.getSimpleName());
	}

}
