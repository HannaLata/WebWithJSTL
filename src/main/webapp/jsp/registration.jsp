<html>
<head>
    <title>My web application</title>
</head>
<body>
    <h2>Hello, input all data, please!</h2>
<br>
    <form action="user" method="post">
        <input type="text" name="action" value="register" hidden>
        <input type="text" size="40" name="login" placeholder="Input login" required>
        <br>
        <input type="password" size="40" name="password" placeholder="Input password" required>
        <br>
        <input type="text" size="40" name="first_name" placeholder="Input first name" required>
        <br>
        <input type="text" size="40" name="last_name" placeholder="Input last name" required>
        <br>
        <input type="email" size="40" name="email" placeholder="Input email" required>
        <br>
        <input type="text" size="40" name="phone" placeholder="Input phone">
        <br>
        <input type="submit" value="REGISTER">
    </form>
<br>
	<h3>
		<a href="/WebWithJSTL/index.jsp">GO BACK!</a>
	</h3>
</body>
</html>