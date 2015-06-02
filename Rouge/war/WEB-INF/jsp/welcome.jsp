<%-- 
    Document   : welcome
    Created on : 2014/12/22, 16:52:15
    Author     : 
--%>

<%@page 
import="com.google.appengine.api.users.*" 
contentType="text/html" pageEncoding="UTF-8"%>
<%
UserService userService = UserServiceFactory.getUserService(); 
User user = userService.getCurrentUser(); 

String msg; 
if( user != null ){  
	
	msg = "ようこそ! あなたは <b>" + user.getNickname() + "</b> という名前でログインしています。"     + " <a href='" + userService.createLogoutURL("/WelcomeServlet") + "'>サインアウト</a><br>"
		+" <a href='/LoginServlet'>ショッピングをはじめる</a>";    
	} else {   
		msg = "こんにちは! こちらから "     + "<a href='" + userService.createLoginURL("/WelcomeServlet") + "'>サインイン</a> してください!"; 
	} 

System.out.println( msg ); 
%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>ネットショッピング</title>
    </head>
    <body>
        <p class="round"> <%= msg%></p>
    </body>
</html>
