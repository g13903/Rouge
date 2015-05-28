<%-- 
    Document   : registerConfirm
    Created on : 2015/01/14, 13:31:56
    Author     : 
--%>

<%@page import="model.Data"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<%
Data registerUser = (Data) session.getAttribute("registerUser");
%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>ユーザー登録</title>
    </head>
    <body>
        <p>下記のユーザーを登録します</p>
        <p>
        名前：<%= registerUser.getUserName() %><br>
        パスワード：<%= registerUser.getPass() %><br>
        </p>
        <a href="/RegisterUser">戻る</a>
        <a href="/RegisterUser?action=done">登録</a>
    </body>
</html>
