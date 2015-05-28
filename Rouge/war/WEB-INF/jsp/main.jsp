<%-- 
    Document   : main
    Created on : 2014/12/22, 17:22:21
    Author     : 
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%> 
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>注文確認</title>
    </head>
    <body>
        <h1>注文画面</h1>
        <c:out value="${name}"/>さん、ログイン中
        <a href ="/WelcomeServlet">トップへ</a>
        <a href ="/Logout">ログアウト</a>
        <br>
        注文する個数を入力して確認ボタンを押してください。
        
        <p><a href="/ConfirmServlet"></a></p>
        <form action ="/ConfirmServlet" method="post">
            CANMAKE(550円)<input type="text" size="3" name="rouge1" value = "0">
            &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
            MAYBELLINE(1200円)<input type="text" size="3" name="rouge2" value = "0">
            &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
            ANNASUI(2800円)<input type="text" size="3" name="rouge3" value = "0">
            <br>
            <img src="http://www.chomotto.com/mobox/4901008305592.jpg" width="250" height="300">
            <img src="http://store.maybelline.co.jp/static/product_images/default/L00002/L00002.jpg" width="250" height="280">
            <img src="http://fashion-lovers.net/wp-content/uploads/2014/08/tamarumaki-20140802-20.jpg" width="250" height="280">
            <br>
            <br>
            MAC(3300円)<input type="text" size="3" name="rouge4" value = "0">
            &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
            &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
            CHANEL(4500円)<input type="text" size="3" name="rouge5" value = "0">
            &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
            &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
            KiSHiORiGiNAL(12000円)<input type="text" size="3" name="rouge6" value = "0">
            <br>
            <img src =http://ecx.images-amazon.com/images/I/31sO8oJK%2BfL._SY300_.jpg width="250" height="280">
            <img src="http://model-kobe.main.jp/image/chanel/lip/rouge-coco.jpg" width="250" height="280">
            <img src="http://image.rakuten.co.jp/dimples/cabinet/03268230/img59230146.jpg" width="250" height="330">
            <br>
            <br>
            <input type="submit" value="確認">
        </form>
    
    </body>
</html>
