package org.myProj.dpPractice.FacadePattern;

public class Fund {
	private Stock S1;
	private Stock S2;

	public Fund() {
		S1 = new StockT1();
		S2 = new StockT2();
	}

	public void buyFund() {
		S1.buy();
		S2.buy();
	}

	public void sellFund() {
		S1.sell();
		S2.sell();
	}
}
