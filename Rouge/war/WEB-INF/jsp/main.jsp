
<%-- 
    Document   : main
    Created on : 2014/12/22, 17:22:21
    Author     : 
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%> 
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page import= "ds.PMF"%>
<%@page import= "javax.jdo.*" %>
<%@page import = "model.Order" %>
<%@page import= "java.util.*" %>
<!DOCTYPE html>
<html>
    <head>
        
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>注文確認</title>
        <style type="text/css">
        .box {
			float: left;
		}
		
		.boxContainer {
			overflow: hidden;
		}
		
		/* clearfix */
		.boxContainer:before,
		.boxContainer:after {
		    content: "";
		    display: table;
		}
		 
		.boxContainer:after {
		    clear: both;
		}
		 
		/* For IE 6/7 (trigger hasLayout) */
		.boxContainer {
		    zoom: 1;
		}

        </style>
    </head>
    <body>
    <%
    PersistenceManagerFactory factory = PMF.get();
    PersistenceManager manager = factory.getPersistenceManager();
    int RougeSell[]={0,0,0,0,0,0,0};
   
    for(int i = 1;i<=6;i++){
    	String query = "select from " + Order.class.getName() + " where rouge == "+i;
    	List<Order> list;
   		try{
    	list = (List<Order>)manager.newQuery(query).execute();
   		}catch(JDOObjectNotFoundException e){
	   	list=null;
   		}
   		if(list!=null){
   				for(Order data:list){
   						RougeSell[i] += data.getNum();
   				}
   		}
   		
    }
    manager.close();
    
    
    %>
        <h1>注文画面</h1>
        <c:out value="${name}"/>さん、ログイン中
        <a href ="/WelcomeServlet">トップへ</a>
        <a href ="/Logout">ログアウト</a>
        <br>
        注文する個数を入力して確認ボタンを押してください。
        
        <p><a href="/ConfirmServlet"></a></p>
        <form action ="/ConfirmServlet" method="post">
        <div class="boxContainer">
        <div class="box">
            CANMAKE(550円)<input type="text" size="3" name="rouge1" value = "0"><br>
            今までの売り上げ・・・<%=RougeSell[1] %>個！<br>
            <img src="http://www.chomotto.com/mobox/4901008305592.jpg" width="250" height="300">
        </div>
            
        <div class="box">
            MAYBELLINE(1200円)<input type="text" size="3" name="rouge2" value = "0"><br>
            今までの売り上げ・・・<%=RougeSell[2] %>個！<br>
            <img src="http://store.maybelline.co.jp/static/product_images/default/L00002/L00002.jpg" width="250" height="280">
        </div>
        <div class="box">
            ANNASUI(2800円)<input type="text" size="3" name="rouge3" value = "0"><br>
            今までの売り上げ・・・<%=RougeSell[3] %>個！<br>
            <img src="http://fashion-lovers.net/wp-content/uploads/2014/08/tamarumaki-20140802-20.jpg" width="250" height="280">
        </div>
        
        </div>
        <br>
        
        <div class="boxContainer">
        <div class="box">
            MAC(3300円)<input type="text" size="3" name="rouge4" value = "0"><br>
            今までの売り上げ・・・<%=RougeSell[4] %>個！<br>
			<img src =http://ecx.images-amazon.com/images/I/31sO8oJK%2BfL._SY300_.jpg width="250" height="280">        </div>
            
        <div class="box">
            CHANEL(4500円)<input type="text" size="3" name="rouge5" value = "0"><br>
            今までの売り上げ・・・<%=RougeSell[5] %>個！<br>
            <img src="http://model-kobe.main.jp/image/chanel/lip/rouge-coco.jpg" width="250" height="280">
        </div>
        <div class="box">
            KiSHiORiGiNAL(12000円)<input type="text" size="3" name="rouge6" value = "0"><br>
            今までの売り上げ・・・<%=RougeSell[6] %>個！<br>
            <img src="http://image.rakuten.co.jp/dimples/cabinet/03268230/img59230146.jpg" width="250" height="330">
        </div>
        </div>

            <input type="submit" value="確認">
        </form>
    
    </body>
</html>
