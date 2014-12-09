package com.phoenixone.demo.entities;

import java.math.BigDecimal;
import java.util.Map;

public class ToyOrders {

	private Map<Toy, Integer> toyOrders;
	private BigDecimal grandTotal;

	public ToyOrders() {

	}

	public ToyOrders(Map<Toy, Integer> toyOrders) {
		super();
		this.toyOrders = toyOrders;
	}

	public Map<Toy, Integer> getToyOrders() {
		return toyOrders;
	}

	public void setToyOrders(Map<Toy, Integer> toyOrders) {
		this.toyOrders = toyOrders;
	}

	public BigDecimal getGrandTotal() {
		grandTotal = new BigDecimal(0);
		
		for(Toy toy: toyOrders.keySet()){
			grandTotal = grandTotal.add(toy.getPrice().multiply(new BigDecimal(toyOrders.get(toy))));
		}
		return grandTotal.setScale(2, BigDecimal.ROUND_HALF_UP);
	}

	public void setGrandTotal(BigDecimal grandTotal) {
		this.grandTotal = grandTotal;
	}
	
	

}
