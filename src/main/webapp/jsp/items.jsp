<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>  

<html>
<head>
	<title>Store</title>
</head>
<body>
<h3>Hello, <c:out value="${user.firstName} ${user.lastName}" /> </h3>
<br>
	<form action="user" method="post">
    <input type="text" name="action" value="user-cabinet" hidden>
    <input type="submit" value="user cabinet">
    </form>
<br>
<c:forEach items="${itemCollection}" var="item">
	<form action="#">
	<input hidden="true" name="userId" value="${user.id}">
	<input hidden="true" name="itemId" value="${item.id}">
	<c:out value="${item.code} ${item.name} ${item.price} ${item.availability}" />
	<input type="submit" value="buy"> 
	</form>
	<br>
</c:forEach>
</body>
</html>