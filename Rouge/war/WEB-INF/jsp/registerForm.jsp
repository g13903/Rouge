<%-- 
    Document   : main
    Created on : 2015/01/14, 14:00:28
    Author     : 
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>ユーザー登録</title>
    </head>
    <body>
        <form action ="/RegisterUser" method="post">
         名前：<input type="text" name="name"><br>
         パスワード：<input type="password" name="pass"><br>
         <input type="submit" value="確認">
        </form>  
    </body>
</html>