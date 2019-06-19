<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
for(int i=1;i<=6;i++) 
{
%>
<h1><%= i %>Hello<%= i %></h1>
<%
}
%>
<br/><br/>
<% for(int i=0;i<5;i++)
	{
%>
out.println(i);
<% } %>
<br/><br/>
<%! int j=10; %>
<%= ++j %>
<br/><br/>
<% int k=10; %>
<%= ++k %>
<br/><br/>
<% a=5; %>
<% int a=7; %>
<%! int a=3; %>
<%= this.a %> 
<%= a %>

</body>
</html>