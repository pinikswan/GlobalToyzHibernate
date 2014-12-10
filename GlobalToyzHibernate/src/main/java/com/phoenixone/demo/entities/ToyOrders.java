package com.phoenixone.demo.entities;

import java.math.BigDecimal;
import java.util.List;
import java.util.Map;

public class ToyOrders {

	private List<ToyOrder> toyOrders;
	private BigDecimal grandTotal;

	public ToyOrders() {

	}

	public ToyOrders(List<ToyOrder> toyOrders) {
		this.toyOrders = toyOrders;
	}

	public List<ToyOrder> getToyOrders() {
		return toyOrders;
	}

	public void setToyOrders(List<ToyOrder> toyOrders) {
		this.toyOrders = toyOrders;
	}

	public BigDecimal getGrandTotal() {
		grandTotal = new BigDecimal(0);

		for (ToyOrder toyOrder : toyOrders) {
			grandTotal = grandTotal.add(toyOrder.getTotalPrice());
		}
		return grandTotal.setScale(2, BigDecimal.ROUND_HALF_UP);
	}



}
