<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<% String name=request.getParameter("data");
Cookie c=new Cookie("MyCookie",name);
response.addCookie(c);
%>
<%
Cookie c1[]=request.getCookies();
for(int i=0;i<c1.length;i++)
{
	String name1=c1[i].getName();
	String value=c1[i].getValue();%>
<%=name1 %>  
<%=value %>
<%} %>
</body>
</html>