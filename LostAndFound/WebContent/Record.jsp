<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@page import="test.*"%>
<html>
<head>
<%
RecordData obj= new RecordData();//Creating class Object
String name=request.getParameter("uname"); 
String access=request.getParameter("accessory");
obj.readDataBase(name,access);//Calling add Method
%>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Data Capture page</title>
</head>
<body>
<form>
<%  
out.print("Thanks "+name+" Data Recorded Successfully !!!!");  
%> <br> 
Current Time: <%out.print("\n"+java.util.Calendar.getInstance().getTime()); %>
</form>
</body>
</html>