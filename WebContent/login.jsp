<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <link rel="icon" type="image/png" href="./res/images/favicon.ico">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Login</title>
    <link rel = "stylesheet" type = "text/css" href = "css/common.css" />
    <link rel = "stylesheet" type = "text/css" href = "css/login.css" />
</head>
<body>
        <!--Navigation bar-->
        <div id="navigationBar"class="navbar-active">
            <ul>
                <li><a href="index.jsp">Bruno's Pizzeria</a></li>
                <li><a href="order.html">Order Now</a></li>
                <li><a href="register.jsp">Register</a></li>
                <li><a href="login.jsp">Login</a></li>
            </ul>
        </div>
        <div class="panel" id="description-wrapper">
            <img src="res/images/login_bg1.jpg">
            <div id="description">
                <h1>Welcome Back !</h1>
                <form class="login-form" method="post" action="login">
                    <input name="emailAddress" type="email" placeholder="Email Address" required><br>
                    <input name="password" type="password" placeholder="Password" required><br>
                    <input class="submit-button" type="submit"value="Login">
                </form>
            </div>
        </div>
</body>
</html>