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
	<title></title>
</head>
<body>

	Order No:
	<s:property value="orderNo" />
	<br /> Customer Name: ${shopper.firstName}&nbsp; ${shopper.lastName}
	<br /> Address:
	${shopper.address}&nbsp;${shopper.city}&nbsp;${shopper.state}&nbsp;
	${shopper.country.name}&nbsp; ${shopper.zip}
	<br /> Contact No: ${shopper.phone}


	<table>
		<tr padding="5px">
			<th>Toy Id</th>
			<th>Toy Name</th>
			<th>Price</th>
			<th>Quantity</th>
			<th>Total Price</th>
		</tr>

		<c:forEach items="${requestScope.toyOrders}" var="toyOrder">

			<tr>
				<td>${toyOrder.key.id}</td>
				<td>${toyOrder.key.name}</td>
				<td>${toyOrder.key.price}</td>
				<td>${toyOrder.value}</td>
				<td>${toyOrder.value * toyOrder.key.price}</td>

			</tr>
		

		</c:forEach>
			<tr><td colspan="4">Grand total:</td>
			<td> ${tOrders.grandTotal}</td>
			</tr>
	</table>

</body>
</html>