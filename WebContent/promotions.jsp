<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="model.Item, java.util.List"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <link rel="icon" type="image/png" href="./res/images/favicon.ico">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Promotions</title>
    <link rel = "stylesheet" type = "text/css" href = "css/common.css" />
    <link rel = "stylesheet" type = "text/css" href = "css/promotions.css" />
</head>
<body>
            <!--Navigation bar-->
            <div id="navigationBar"class="navbar-active">
                <ul>
                    <li><a href="index.jsp">Bruno's Pizzeria</a></li>
                    <li><a href="promotions">Promotions</a></li>
           	<%Cookie[] cookies = request.getCookies();
				int check = 0;
				String displayName = null;
				for(Cookie cookie : cookies){
					if(cookie.getName().equals("user")) {
						check=1;
						displayName = cookie.getValue();
					}
				}
				if(check==1){
					out.println("<li style='padding-left:20vw;padding-right:10px;'><img src='res/images/profile.png' width='16px' style='padding-top:0px; margin-right:10px;'>"+displayName+"</li><li style='padding-right:5vw'><a href='logout'>Logout</a></li>");
				}else{
					out.println("<li><a href='register.jsp'>Register</a></li><li><a href='login.jsp'>Login</a></li>");
				}
				%>
                    
                </ul>
            </div>
            <div class="panel">
                <div class="promotions">
                    <h1>Promotions</h1>
                    <div class="pizza-row">
                    	<% 
                    	if(request.getAttribute("itemList")!=null){
                    		List<Item> itemList = (List<Item>) request.getAttribute("itemList"); 
                    		if(itemList.size()>0){
                    			for (Item item: itemList) {  
                        			%>
                        			<div class="card">
                                <img src="<%out.println(item.getPhotoUrl());%>" alt="pizza">
                                <h3 class="item-name"><%out.println(item.getItemName());%></h3>
                                <h2 class="price"><%out.println(item.getPrice());%></h2>
                            </div>                   			
                        		<%}
                    		}else{
                    			out.println("No item found.");
                    		}
                    	}
                    	%>
                    </div>
                </div>
            </div>
</body>
</html>