package com.phoenixone.demo.entities;

import java.math.BigDecimal;

public class ToyOrder {

	private Toy toy;
	private int quantity;
	private BigDecimal totalPrice;

	public ToyOrder() {
	}

	public ToyOrder(Toy toy, int quantity) {
		this.toy = toy;
		this.quantity = quantity;
	}

	public Toy getToy() {
		return toy;
	}

	public void setToy(Toy toy) {
		this.toy = toy;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public BigDecimal getTotalPrice() {
		
		totalPrice =  toy.getPrice().multiply(new BigDecimal(quantity));
		
		return totalPrice;
	}



}
