<%-- 
    Document   : login
    Created on : 2015/01/16, 10:09:38
    Author     : 
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Rouge Store</title>
    </head>
    <body>
        <form action ="/LoginServlet" method="post">
            名前:<input type="text" name="name"><br>
            パスワード:<input type="password" name="pass"><br>
            <input type="submit" value="ログイン">
        </form>
    </body>
</html>
