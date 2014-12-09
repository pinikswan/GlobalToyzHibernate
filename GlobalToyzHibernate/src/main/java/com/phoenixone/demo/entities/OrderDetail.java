package com.phoenixone.demo.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;


@Entity(name = "orderDetail")
@Table(name = "OrderDetail")
public class OrderDetail implements Serializable {

	private Order order;
	private Toy toy;
	private Integer quantity;

	public OrderDetail() {

	}

	public OrderDetail(Order order, Toy toy, Integer quantity) {
		super();
		this.order = order;
		this.toy = toy;
		this.quantity = quantity;
	}

	@Id
	@OneToOne
	@JoinColumn(name = "cOrderNo", referencedColumnName = "cOrderNo", insertable = false, updatable = false)
	public Order getOrder() {
		return order;
	}

	public void setOrder(Order order) {
		this.order = order;
	}

	@Id
	@OneToOne
	@JoinColumn(name = "cToyId", referencedColumnName = "cToyId", insertable = false, updatable = false)
	public Toy getToy() {
		return toy;
	}

	public void setToy(Toy toy) {
		this.toy = toy;
	}

	@Column(name = "siQty")
	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

}