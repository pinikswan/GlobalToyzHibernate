package com.phoenixone.demo;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.phoenixone.demo.entities.OrderDetail;

public class App {
	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = Persistence
				.createEntityManagerFactory("db-persistence");
		EntityManager entityManager = entityManagerFactory
				.createEntityManager();

		/*
		 * Query query = entityManager.createQuery("from brand"); List<Brand>
		 * brands = query.getResultList();
		 * 
		 * for(Brand brand:brands) { System.out.println(brand.getId() + " " +
		 * brand.getName()); } System.out.println("--------------"); query =
		 * entityManager.createQuery("from category"); List<Category> categories
		 * = query.getResultList(); for(Category category:categories) {
		 * System.out.println(category.getId() + " " + category.getName() + " "
		 * + category.getDescription()); }
		 */

		Query query = entityManager.createQuery("from orderDetail");
		List<OrderDetail> orderDetails = query.getResultList();

		for (OrderDetail orderDetail : orderDetails) {
			System.out.println(orderDetail.getOrder().getOrderNo() + " "
					+ orderDetail.getOrder().getShopper().getFirstName() + " "
					+ orderDetail.getOrder().getShippingMode().getMode() + " "
					+ orderDetail.getOrder().getShippingCharges()
					+ orderDetail.getOrder().getGiftWrapCharges()
					+ orderDetail.getOrder().getOrderProcessed() + " "
					+ orderDetail.getOrder().getTotalCost() + " "
					+ orderDetail.getToy().getName());
		}
		
		

	/*	Query query = entityManager.createQuery("from orderDetail o where o.order.orderNo = ?");
		 query.setParameter(1, "000001");
		List<OrderDetail> orderDetailz = query.getResultList();

		for (OrderDetail orderDetail : orderDetailz) {
			System.out.println(orderDetail.getOrder().getOrderNo() + " " + orderDetail.getToy().getId() + " " + orderDetail.getQuantity());
		}*/
		
	}
}
