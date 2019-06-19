<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<c:set var="item1" value="20" scope="page"/>
<c:set var="item2" value="30" scope="request"/>
<c:set var="item3" value="40" scope="session"/>
<c:set var="item4" value="50" scope="application"/>
<c:out value="${pageScope.item1}"/><br/>
<c:out value="${requestScope.item2}"/><br/>
<c:out value="${sessionScope.item3}"/><br/>
<c:out value="${applicationScope.item4}"/><br/>
<c:remove var="item2"/>
<c:out value="${requestScope.item2}"/><br/>
<c:out value="${sessionScope.item3}"/><br/>
<c:set var="salary" scope="session" value="${2000*2}"/>
<c:if test="${salary>2000}">
	<h2>My salary is <c:out value="${salary}"/></h2>
</c:if>
<c:set var="sal" scope="session" value="${2000*2}"/>
<c:choose>
<c:when test="${sal<2000}">
	<h2>Salary is low</h2>
</c:when>
<c:when test="${sal>2000}">
	<h2>Salary is ok</h2>
</c:when>
<c:otherwise>
	<h2>No comments</h2>
</c:otherwise>
</c:choose>
<c:forEach var="i" begin="1" end="15" step="2">
	Item <c:out value="${i}"/>
</c:forEach>
<br/>
<c:forTokens items="abc,pqr,xyz" delims="," var="item">
	<c:out value="${item}"/>
</c:forTokens>
<c:catch var="e">
	<% int i=10/0; %>
</c:catch>
<c:if test="${e!=null}">
	caught exception is ${e} and message is ${e.message}
</c:if>
<br/>
<c:url var="u" value="/FSD/fethc.jsp"/>
<form action="${u}">
</form>
<c:redirect url="http://www.google.com"/>
</body>
</html>