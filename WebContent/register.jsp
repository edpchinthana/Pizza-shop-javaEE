<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <link rel="icon" type="image/png" href="./res/images/favicon.ico">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Register</title>
    <link rel = "stylesheet" type = "text/css" href = "css/common.css" />
    <link rel = "stylesheet" type = "text/css" href = "css/register.css" />
</head>
<body>
    <!--Navigation bar-->
    <div id="navigationBar" class="navbar-active">
        <ul>
            <li><a href="index.jsp">Bruno's Pizzeria</a></li>
            <li><a href="order.jsp">Order Now</a></li>
            <li><a href="register.jsp">Register</a></li>
            <li><a href="login.jsp">Login</a></li>
        </ul>
    </div>
    <div class="panel" id="description-wrapper">
        <img src="res/images/register_bg1.png">
        <div id="description">
            <h1>Register Now!</h1>
            <form class="register-form">
                <input type="text" placeholder="Display Name" required><br>
                <input type="email" placeholder="Email Address" required><br>
                <input type="password" placeholder="Password" required><br>
                <input type="password" placeholder="Retype Password" required><br>
                <input class="submit-button" type="submit"value="Register">
            </form>
        </div>
    </div>
</body>
</html>