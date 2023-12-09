<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>User details</h1>
<%
String name=request.getParameter("user");
String password=request.getParameter("pwd");
if(name.equals("roshi")&& password.equals("123"))
{
	response.sendRedirect("https://www.google.com/");
}
else
{
	out.println("invalid credentails");
	RequestDispatcher rd=request.getRequestDispatcher("loginjsp.jsp");
	rd.include(request,response);
}
%>
</body>
</html>