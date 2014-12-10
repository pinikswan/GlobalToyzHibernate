package com.phoenixone.demo.da;

import java.util.List;

import com.phoenixone.demo.entities.Order;
import com.phoenixone.demo.entities.OrderDetail;
import com.phoenixone.demo.entities.Shopper;

public interface OrdersDA {

	public Shopper getShopperByOrderNo(String orderNo);
	public List<OrderDetail> getOrderDetailsOrderNo(String orderNo);
	public List<Order> getAllOrders();
}
