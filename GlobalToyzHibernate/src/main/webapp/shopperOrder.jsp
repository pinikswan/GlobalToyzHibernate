<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<%@page import="java.util.*"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="s" uri="/struts-tags"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
	<link rel="stylesheet" href="css/index.css" />
	<title>Global Toyz</title>
</head>
<body>
	<div>
		Order No:<s:property value="orderNo" />
	</div>
	<div>
		Customer Name: ${shopper.firstName}&nbsp;${shopper.lastName}
	</div>
	<div>
		Address: ${shopper.address}&nbsp;${shopper.city},${shopper.state}&nbsp;${shopper.country.name}&nbsp;${shopper.zip}
	</div>
	<div>
		Contact No: ${shopper.phone}
	</div>


	<table>
		<tr padding="5px">
			<th>Toy Id</th>
			<th>Toy Name</th>
			<th>Price</th>
			<th>Quantity</th>
			<th>Total Price</th>
		</tr>

		<c:forEach items="${requestScope.toyOrders.toyOrders}" var="toyOrder">

			<tr>
				<td>${toyOrder.toy.id}</td>
				<td>${toyOrder.toy.name}</td>
				<td>$ ${toyOrder.toy.price}</td>
				<td>${toyOrder.quantity}</td>
				<td>$ ${toyOrder.totalPrice}</td>

			</tr>


		</c:forEach>
		<tr>
			<td colspan="4">Grand total:</td>
			<td>$ ${toyOrders.grandTotal}</td>
		</tr>
	</table>

</body>
</html>