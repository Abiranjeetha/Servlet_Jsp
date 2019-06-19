<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import="java.util.*"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%=request.getParameter("n1") %><br/>
<%=request.getParameter("sal") %><br/>
<%=request.getParameter("gen") %><br/>
<%String s[]=request.getParameterValues("n5");
for(int i=0;i<s.length;i++)
{
%>
<%=s[i] %><br/>
<%} %>
<br/>
<%Enumeration e=request.getParameterNames();
while(e.hasMoreElements())
{
	String s1=(String)e.nextElement();
	String s2=request.getParameter(s1);
%>
<%=s1 %><%=s2 %>
<%} %>
<br/>
<%=request.getScheme() %><br/>
<%=request.getProtocol() %><br/>
<%=request.getServerName() %><br/>
<%=request.getServerPort() %><br/>
<%=request.getContextPath() %><br/>
<%=request.getServletPath() %><br/>
<%=request.getRequestURI() %><br/>
<br/><br/>
<%=request.getHeader("accpet-language") %>
<%=request.getHeader("accept-Charset") %>
<%Enumeration e1=request.getHeaderNames();
while(e1.hasMoreElements())
{
	String s3=(String)e1.nextElement();
	String s4=request.getHeader(s3);
%>
<%=s3 %><%=s4 %>
<%} %>
<br/>
<% request.setAttribute("subject", "Maths"); %>
<jsp:include page="/req.jsp" />
</body>
</html>