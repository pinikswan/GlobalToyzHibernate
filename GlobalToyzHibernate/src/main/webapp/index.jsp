<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<%@page import="java.util.*"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<link rel="stylesheet" href="css/index.css" />
<title>Horizon Airways</title>
</head>

<body>
	<font face="Arial, Helvetica, sans-serif" size="-1">


		<table>
			<tr padding="5px">
				<th>Order No.</th>
				<th>Order Date</th>
				<th>Shopper Name</th>
				<th>Shipping Mode</th>
				<th>Shipping Charges</th>
				<th>Giftwrap Charges</th>
				<th>Is Order Processed?</th>
				<th>Total</th>
				<th>Delivery Expiration Date</th>
				<th>Action</th>
			</tr>

			<c:forEach items="${applicationScope.orderDetails}" var="orderDetail">




				<tr>
					<td>${orderDetail.order.orderNo}</td>
					<td>${orderDetail.order.orderDate }</td>
					<td>${orderDetail.order.shopper.firstName}
						${orderDetail.order.shopper.lastName }</td>
					<td>${orderDetail.order.shippingMode.mode}</td>
					<td>${orderDetail.order.shippingCharges }</td>
					<td>${orderDetail.order.giftWrapCharges}</td>
					<td>${orderDetail.order.orderProcessed }</td>
					<td>${orderDetail.order.totalCost }</td>
					<td>${orderDetail.order.expirationDate }</td>
					<td><a href="./viewOrder?orderNo=${orderDetail.order.orderNo}"><b>View</b></a></td>
				</tr>

			</c:forEach>
		</table>

	</font>

</body>

</html>
