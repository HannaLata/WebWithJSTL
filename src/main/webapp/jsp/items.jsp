<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>  

<html>
<head>
	<title>Store</title>
</head>
<body>
<c:set var="user" value="${user}" scope="session" />
<h3>Hello, <c:out value="${user.firstName}" /> <c:out value="${user.login}" /></h3>
</body>
</html>