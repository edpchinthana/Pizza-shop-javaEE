<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import = "com.fasterxml.jackson.databind.*" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%Cookie[] cookies = request.getCookies();
	int check = 0;
	for(Cookie cookie : cookies){
		if(cookie.getName().equals("user")) {
			check=1;
			out.println(cookie.getValue());
		}
	}
	%>
</body>
</html>