package com.phoenixone.demo.da;

import java.util.List;

import com.phoenixone.demo.entities.Order;
import com.phoenixone.demo.entities.OrderDetail;

public interface OrdersDA {

	public List<OrderDetail> getAllOrderDetails();
	public Order getOrderByOrderNo(String orderNo);
	public List<OrderDetail> getOrderDetailsOrderNo(String orderNo);
	public List<Order> getAllOrders();
}
