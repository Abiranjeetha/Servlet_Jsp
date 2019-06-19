<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
${header["accept-language"]}<br/>
${header["user-agent"]}<br/>
${initParam.productname}<br/>
<%Cookie c=new Cookie("MyInfoCookie","Sam");
response.addCookie(c);%>
${cookie.MyInfoCookie.value}<br/>
<%request.setAttribute("mark1", 90);
session.setAttribute("mark2",64);
application.setAttribute("mark3", 74);
pageContext.setAttribute("mark4", 84,pageContext.PAGE_SCOPE);
%>
<jsp:forward page="/scope.jsp"></jsp:forward>
</body>
</html>