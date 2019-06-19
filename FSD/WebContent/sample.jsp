<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<jsp:useBean id="hello" class="com.pack.User" scope="session">
<jsp:setProperty name="hello" property="*"/>
</jsp:useBean>
Name of user is <jsp:getProperty name="hello" property="name"/> has age <jsp:getProperty name="hello" property="age"/>
<br/>
Name of user is <%= hello.getName() %> has age <%= hello.getAge() %>
<a href="/FSD/sample1.jsp">Click</a>
</body>
</html>