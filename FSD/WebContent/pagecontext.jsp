<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%request.setAttribute("Track1", "Java"); %>
<%=request.getAttribute("Track1") %><br/>
<%pageContext.setAttribute("Track2", "Testing",pageContext.REQUEST_SCOPE); %>
<%=pageContext.getAttribute("Track2",pageContext.REQUEST_SCOPE) %>
</body>
</html>