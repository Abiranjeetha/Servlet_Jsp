<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<link rel = "stylesheet" type="text/css" href="cssfiles/form.css">
<style>
#column1
{
	float:left;
	width:20%;
	border-style="solid";
	border-width: 5px;
}
#column2
{
	float:left;
	width:60%;
 	border-style="solid";
 	border-width: 5px;
}
.tab
{
background-color: #f1f1f1;
border: none;
float: left;
color: black;
width: 33.33%;
height: 50px;
font-size: 25px;
text-align: left;
font-weight: 550;
}
.tab:hover
{
background-color: #777D7D;
}
table
{
border-collapse:collapse;
}
table th
{
border-right:2.5px solid #D1D5D5;
}
table th:last-child
{
border-right:0;
}
table th:nth-child(7)
{
border-right:0;
}
table th:nth-child(8)
{
border-right:0;
}
table td
{
border:2.5px solid #D1D5D5;
border-left:0;
}
table tr:first-child td
{
border-top:0;
}
table tr:last-child td
{
border-bottom: 0;
}
table tr td:last-child
{
border-right:0;
}
table tr td:nth-child(7)
{
border-right:0;
}
table tr td:nth-child(8)
{
border-right:0;
}
table td:first-child
{
border-right:0;
border-bottom:0;
}
table th:first-child
{
border-right:0;
}
</style>
</head>
<body>
<div style="background-color:#EAEDED;height:90px;">
<br/>
<%@ include file="header.jsp" %>
</div>
<br/>
<br/>
<br/>
<div id="column1">
<form style="background-color:#EAEDED;">
<br/>
<h2 align="center">PROFILE</h2>
<br/>
<div align="center">
<br/>
<br/>
<img alt="not available" src="add1.png" width=200>
<br/>
<h2><%=session.getAttribute("username") %></h2>
<h3>*<%=session.getAttribute("rating") %></h3>
<h3>Contact</h3>
<h6><%=session.getAttribute("contact") %></h6>
<h3>Address</h3>
<h6><%=session.getAttribute("address") %></h6>
<br/>
</div>
</form>
</div>
<div id="column2" style="padding-left:50px;">
<div>
  <a href="/grizzly-store-vendor-web/ListproductController"><input type="button" value="PRODUCT" class="tab"></a>
  <a href="/grizzly-store-vendor-web/ListvendorsController"><input type="button" value="VENDOR" class="tab"></a>
  <a href="#home"><input type="button" value=" " class="tab"></a>
</div>
<br><br><br><br>
<div>
<select id="btn">
<option>choose action</option>
<option>add</option>
<option>delete</option>
</select>
&nbsp;&nbsp;&nbsp;&nbsp;
<input type="text" id="btn" placeholder="Category name"/>
&nbsp;&nbsp;&nbsp;&nbsp;
<select id="btn">
<option>sort by</option>
</select>
<div style="float:right;"><a href="addproduct.jsp"><input type="submit" value="Add Product" id="btn"></a></div>
<br/>
<br/>
<c:if test="${!empty prdlist}">
<table>
<tr>
	<th width="20"></th> 
	<th width="180" align="center">Products list</th>
	<th width="180" align="center">Brand </th>
	<th width="180" align="center">Category</th>
	<th width="180" align="center">Rating</th>
	<th width="180" align="center">Offer</th>
	<th width="140" align="center"></th>
	<th width="90" align="center"></th>
</tr>
<c:forEach items="${prdlist}" var="product">
	<tr>
		<td><input type="radio" name="product"></td>
		<td align="center" height="30">${product.pname}</td>
		<td align="center" height="30">${product.pbrand}</td>
		<td align="center" height="30">${product.pcategory}</td>
		<td align="center" height="30">${product.rating}</td>
		<td align="center" height="30">${product.discount}</td>
		<td ><form action="/grizzly-store-vendor-web/ViewproductController?pid=${product.pid}" method="post" style="padding-left:50px;"><input type="submit" value="view" style="border-radius:20px;"></form></td>
		<td ><form action="/grizzly-store-vendor-web/RemoveproductController?pid=${product.pid}" method="post"><input type="submit" value="remove" style="border-radius:20px;"></form></td>
	</tr>
</c:forEach>
</table>
</c:if>
</div>
<br/>
<br/>
</div>
</body>
</html>