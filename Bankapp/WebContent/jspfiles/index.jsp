<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<script type="text/javascript">
	function deleteCustomer(customerId)
	{
		if(confirm('Do you want to delete this customer?'))
			{
				var url='/Bankapp/DeleteCustomerController?custid='+customerId;
				window.location.href=url;
			}
	}
</script>
</head>
<body>
<h2>Banking Application</h2>
<form method="post" action="/Bankapp/CustomerController">
<table>
<tr>
	<td>Name</td>
	<td><input type="text" name="name"/></td>
</tr>
<tr>
	<td>Address</td>
	<td><input type="text" name="address"/></td>
</tr>
<tr>
	<td>Salary</td>
	<td><input type="text" name="salary"/></td>
</tr>
<tr>
	<td>City</td>
	<td><input type="text" name="city"/></td>
</tr>
<tr>
	<td colspan="2">
	<input type="submit" value="Add"/>
	</td>
</tr>
</table>
</form>
<h3>List of Customer</h3>
<c:if test="${!empty custlist}">
<table>
<tr>
	<th width="180">Customer ID</th>
	<th width="160">Name</th>
	<th width="60">Address</th>
	<th width="80">Salary</th>
	<th width="80">City</th>
</tr>
<c:forEach items="${custlist}" var="customer">
	<tr>
		<td><a href="<c:url value='/EditCustomerController?custid=${customer.id}'/>">${customer.id}</a></td>
		<td>${customer.name}</td>
		<td>${customer.address}</td>
		<td>${customer.salary}</td>
		<td>${customer.city}</td>
		<td><img src="<c:url value='/images/delete.jpg'/>" title="Delete Customer" onclick="javascript:deleteCustomer(${customer.id})" width="30"/>
			<a href="<c:url value='/EditCustomerController?custid=${customer.id}'/>">
			<img src="<c:url value='/images/edit.jpg'/>" title="Edit Customer" width="30"/>
			</a>	
		</td>
	</tr>
</c:forEach>
</table>
</c:if>
</body>
</html>