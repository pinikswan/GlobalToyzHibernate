package com.phoenixone.demo.filter;

import java.io.IOException;
import java.util.List;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

import com.phoenixone.demo.entities.Order;
import com.phoenixone.demo.impl.OrdersDAImpl;
import com.phoenixone.demo.service.OrderDetailsService;

public class IndexFilter implements Filter {

	public void destroy() {

	}

	public void doFilter(ServletRequest request, ServletResponse response,
			FilterChain chain) throws IOException, ServletException {
		chain.doFilter(request, response);

	}

	public void init(FilterConfig filterConfig) throws ServletException {
		
		OrderDetailsService service = new OrderDetailsService(new OrdersDAImpl());
		List<Order> orders = service.getAllOrders();

		filterConfig.getServletContext().setAttribute("orders",
				orders);

	}

}
