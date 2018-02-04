package org.myProj.dpPractice.FacadePattern;

public class StockT1 implements Stock{

	@Override
	public void buy() {
		System.out.println("BUY "+StockT1.class.getSimpleName());
	}

	@Override
	public void sell() {
		System.out.println("SELL"+StockT1.class.getSimpleName());
	}

}
