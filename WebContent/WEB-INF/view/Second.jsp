<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix = "core" uri = "http://java.sun.com/jsp/jstl/core" %>
    <%@ taglib prefix="f" uri="http://www.springframework.org/tags/form"  %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
${msg}

<f:form action="saveFriend.html"  method="POST" >
<table>
<tr>
 		<td>Name:</td>
 		<td><f:input path="friendName"/></td>
 	</tr>
 	 	<tr>
 		<td>Location:</td>
 		<td><f:input path="location"/></td>
 	</tr>
 	<tr>
 		<td><input type="submit"></td>
 	</tr>
</table>
</f:form>
</body>
</html>