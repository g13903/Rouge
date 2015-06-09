<%-- 
    Document   : confirm
    Created on : 2014/12/22, 17:34:08
    Author     : 
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ page import="model.Price"%>
<% Price getPrice = (Price) session.getAttribute("getPrice"); %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title></title>
    </head>
    <body>
        <h1>注文確認</h1>
        <c:out value="${name}"/>さん、ログイン中
        <a href ="/WelcomeServlet">トップへ</a>
        <a href ="/Logout">ログアウト</a>
       
        
        <p>以下のご注文でよろしいでしょうか</p>
        
      
        <p>CANMAKE   &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
            <%= getPrice.getRouge(1) %>個   <%= getPrice.getRougeMulPrice(1) %> 円</p>
        <p>MAYBELLINE   &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
            <%= getPrice.getRouge(2) %>個   <%= getPrice.getRougeMulPrice(2) %> 円</p>
        <p>ANNASUI       &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
            <%= getPrice.getRouge(3) %>個   <%= getPrice.getRougeMulPrice(3) %> 円</p>
        <p>MAC            &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
            <%= getPrice.getRouge(4) %>個   <%= getPrice.getRougeMulPrice(4) %> 円</p>
        <p>CHANEL         &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
        	<%= getPrice.getRouge(5) %>個   <%= getPrice.getRougeMulPrice(5) %> 円</p>
        <p> KiSHiORiGiNAL   &nbsp;&nbsp;
        	<%= getPrice.getRouge(6) %>個   <%= getPrice.getRougeMulPrice(6) %> 円</p>
        <p>合計            <%= getPrice.getSumRouge() %>個 <%= getPrice.getSumPrice() %> 円</p>
        <a href ="/Done">決定</a>
   
    </body>
</html>
