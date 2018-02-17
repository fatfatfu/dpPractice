package org.myProj.dpPractice.CommandPattern;

/**
 * ConcreteCommand 2
 * 
 * @author david
 */
public class SellStock implements IOrder {
	private StockCommand abcStock;

	public SellStock(StockCommand abcStock) {
		this.abcStock = abcStock;
	}

	public void execute() {
		abcStock.sell();
	}
}
