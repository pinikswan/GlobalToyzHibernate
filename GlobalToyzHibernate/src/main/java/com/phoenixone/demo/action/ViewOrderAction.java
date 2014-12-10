package com.phoenixone.demo.action;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.apache.struts2.interceptor.RequestAware;

import com.opensymphony.xwork2.ActionSupport;
import com.phoenixone.demo.entities.OrderDetail;
import com.phoenixone.demo.entities.Shopper;
import com.phoenixone.demo.entities.ToyOrder;
import com.phoenixone.demo.entities.ToyOrders;
import com.phoenixone.demo.impl.OrdersDAImpl;
import com.phoenixone.demo.service.OrderDetailsService;

public class ViewOrderAction extends ActionSupport implements RequestAware {

	
	private static final long serialVersionUID = 1L;
	private String orderNo;
	private Map<String, Object> request;

	public String execute() throws Exception {
		Shopper shopper = null;

		OrderDetailsService service = new OrderDetailsService(
				new OrdersDAImpl());
		shopper =  service.getShopperByOrderNo(orderNo);
		
		
		List<OrderDetail> orderdetails = service.getOrderDetailsByOrderNo(orderNo);
		List<ToyOrder> toyOrderList = new ArrayList<ToyOrder>();
		for (OrderDetail orderDetail : orderdetails) {

			ToyOrder toyOrder = new ToyOrder(orderDetail.getToy(),  orderDetail.getQuantity());
			toyOrderList.add(toyOrder);
		}
		ToyOrders toyOrders = new ToyOrders(toyOrderList);
		request.put("shopper", shopper);
		request.put("toyOrders", toyOrders);
		return SUCCESS;
	}

	public String getOrderNo() {
		return orderNo;
	}

	public void setOrderNo(String orderNo) {
		this.orderNo = orderNo;
	}

	public void setRequest(Map<String, Object> request) {
		this.request = request;

	}

}
