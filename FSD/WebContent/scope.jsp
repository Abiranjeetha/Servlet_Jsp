<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
${requestScope.mark1}<br/>
${sessionScope.mark2}<br/>
${applicationScope.mark3}<br/>
${pageScope.mark4}<br/>
${pageContext.request.contextPath}<br/>
${pageContext.request.scheme}<br/>
${pageContext.request.protocol}<br/>
${pageContext.request.serverName}<br/>
${pageContext.request.serverPort}<br/>
${pageContext.session.id}<br/>
${pageContext.session.creationTime}<br/>
${pageContext.session.lastAccessedTime}<br/>
</body>
</html>