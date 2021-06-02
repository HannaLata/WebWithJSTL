<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>  


<html>
<head>
    <title>User cabinet</title>
</head>
<body>
<h3>This is your account!</h3>

	<form action="user" method="post">
    <input type="text" name="action" value="user-cabinet" hidden>
    <input type="submit" value="my cart">
    
</form>

<br>
<h3>
    <a href="/WebWithJSTL_war/index.jsp">GO BACK!</a>
</h3>
</body>
</html>