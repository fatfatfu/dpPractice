package org.myProj.dpPractice.CommandPattern;

/**
 * ConcreteCommand 1
 * 
 * @author david
 */
public class BuyStock implements IOrder {
	private StockCommand abcStock;

	public BuyStock(StockCommand abcStock) {
		this.abcStock = abcStock;
	}

	@Override
	public void execute() {
		abcStock.buy();
	}

}
