package com.phoenixone.demo.service;

import java.util.List;

import com.phoenixone.demo.da.OrdersDA;
import com.phoenixone.demo.entities.Order;
import com.phoenixone.demo.entities.OrderDetail;
import com.phoenixone.demo.entities.Shopper;

public class OrderDetailsService {

	private OrdersDA da;

	public OrderDetailsService() {

	}

	public OrderDetailsService(OrdersDA da) {

		this.da = da;
	}

	public OrdersDA getDa() {
		return da;
	}

	public void setDa(OrdersDA da) {
		this.da = da;
	}

	public Shopper getShopperByOrderNo(String orderNo) {
		return da.getShopperByOrderNo(orderNo);
	}

	public List<OrderDetail> getOrderDetailsByOrderNo(String orderNo) {
		return da.getOrderDetailsOrderNo(orderNo);
	}

	public List<Order> getAllOrders() {
		return da.getAllOrders();
	}

}
