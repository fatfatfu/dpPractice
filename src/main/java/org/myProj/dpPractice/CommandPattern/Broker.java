package org.myProj.dpPractice.CommandPattern;

import java.util.ArrayList;
import java.util.List;
/**
 * invoker
 * @author david
 *
 */
public class Broker {
	private List<IOrder> orderList = new ArrayList<IOrder>();

	public void takeOrder(IOrder order) {
		orderList.add(order);
	}

	public void placeOrders() {

		for (IOrder order : orderList) {
			order.execute();
		}
		orderList.clear();
	}
}
