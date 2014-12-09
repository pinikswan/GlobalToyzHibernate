package com.phoenixone.demo.service;

import java.util.List;

import com.phoenixone.demo.da.OrdersDA;
import com.phoenixone.demo.entities.Order;
import com.phoenixone.demo.entities.OrderDetail;

public class OrderDetailsService {

	private OrdersDA da;

	public OrderDetailsService() {

	}

	public OrderDetailsService(OrdersDA da) {

		this.da = da;
	}

	public List<OrderDetail> getOrderDetails() {
		return da.getAllOrderDetails();
	}
	
	public Order getOrderByOrderNo(String orderNo){
		return da.getOrderByOrderNo(orderNo);
	}

	public OrdersDA getDa() {
		return da;
	}

	public void setDa(OrdersDA da) {
		this.da = da;
	}

	public List<OrderDetail> getOrderDetailsByOrderNo(String orderNo) {
		return da.getOrderDetailsOrderNo(orderNo);
	}

}
