<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<table border="2">
<tr>
<th>id</th>
<th>name</th>
<th>username</th>
<th>password</th>
</tr>
<c:forEach items="${data }" var="s">
<td>${s.id }</td>
<td>${s.name }</td>
<td>${s.username }</td>
<td>${s.password }</td>
</c:forEach>
</table>

</form>
</body>
</html>