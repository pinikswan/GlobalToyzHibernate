package com.phoenixone.demo.impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.phoenixone.demo.da.OrdersDA;
import com.phoenixone.demo.entities.Order;
import com.phoenixone.demo.entities.OrderDetail;
import com.phoenixone.demo.entities.Shopper;

public class OrdersDAImpl implements OrdersDA {

	public Shopper getShopperByOrderNo(String orderNo) {

		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("db-persistence");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		Query query = entityManager.createQuery("from order o where o.orderNo = ?");
		query.setParameter(1, orderNo);
		Shopper shopper = ((Order) query.getSingleResult()).getShopper();
		return shopper;
	}

	

	public List<OrderDetail> getOrderDetailsOrderNo(String orderNo) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("db-persistence");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		Query query = entityManager.createQuery("from orderDetail o where o.order.orderNo = ?");
		query.setParameter(1, orderNo);
		return query.getResultList();
	}

	public List<Order> getAllOrders() {
		EntityManagerFactory entityManagerFactory = Persistence
				.createEntityManagerFactory("db-persistence");
		EntityManager entityManager = entityManagerFactory
				.createEntityManager();
		Query query = entityManager.createQuery("from order");
		return query.getResultList();
	}

}
