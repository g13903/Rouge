package servlet;

import java.io.*;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.concurrent.TimeUnit;

import javax.jdo.*;
import javax.servlet.http.*;

import org.apache.tools.ant.util.DateUtils;

import com.google.appengine.api.users.User;
import com.google.appengine.api.users.UserService;
import com.google.appengine.api.users.UserServiceFactory;

import model.Order;
import model.Price;
import ds.PMF;

public class HistoryServlet extends HttpServlet{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public void doGet(HttpServletRequest req,
            HttpServletResponse resp)
            throws IOException {
        PersistenceManagerFactory factory = PMF.get();
        PersistenceManager manager = factory.getPersistenceManager();
        resp.setCharacterEncoding("UTF-8");
        resp.setContentType("text/html");
        req.setCharacterEncoding("utf-8");
        PrintWriter out = resp.getWriter();
        List<Order> list = null;
        UserService userService = UserServiceFactory.getUserService(); 
    	User user = userService.getCurrentUser(); 
    	String name = user.getUserId();
        String query = "select from " + Order.class.getName() + " where userName == '"+name + "'";
        
        HttpSession session = req.getSession();
        Price price = (Price) session.getAttribute("getPrice");
        
        out.println("<html><body>");
        out.println("<h1>購入履歴</h1>");
        
        try {
            list = (List<Order>)manager.newQuery(query).execute();
        } catch(JDOObjectNotFoundException e){
            list = null;
        }
        if (list != null){
            for(Order data:list){
            	Date date = new Date(data.getDate());
            	SimpleDateFormat sdf = new SimpleDateFormat("yyyy'年'MM'月'dd'日'");
            	out.println("<p>"+sdf.format(date));
                out.println("商品名:" + data.getRouge() + "<br>個数:" + data.getNum()+"個" 
                		+ "     総額"+price.getRougePrice(data.getRougeIndex())*data.getNum() +"円"+ "</p>");
            }
        }
        manager.close();
        
        out.println("</body></html>");
	}

	
	
}
