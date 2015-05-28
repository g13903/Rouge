/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package servlet;

import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import model.Price;

/**
 *
 * @author 
 */

public class ConfirmServlet extends HttpServlet {
    private static final long serialVersionUID=1L;
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String forwardPath = null;
        String action = request.getParameter("action");
        if(action==null) {
            forwardPath = "/WEB-INF/jsp/main.jsp";
        }
        else if(action.equals("done")) {
            HttpSession session = request.getSession();
            /*Price price = (Price) session.getAttribute("getPrice");
            
            //RegisterUserLogic logic = new RegisterUserLogic();
            //logic.register(registerUser);
            */
            session.removeAttribute("getPrice");
            
            forwardPath = "/WEB-INF/jsp/confirm.jsp";
        }
        
        
        
        //RequestDispatcher dispatcher=request.getRequestDispatcher("/WEB-INF/jsp/main.jsp");
            //dispatcher.forward(request,response);
    }
    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        String rouge1 = request.getParameter("rouge1");
        String rouge2 = request.getParameter("rouge2");
        String rouge3 = request.getParameter("rouge3");
        String rouge4 = request.getParameter("rouge4");
        String rouge5 = request.getParameter("rouge5");
        String rouge6 = request.getParameter("rouge6");
        
        
        
        Price getPrice = new Price(rouge1,rouge2,rouge3,rouge4,rouge5,rouge6);
        
        HttpSession session = request.getSession();
        session.setAttribute("getPrice",getPrice);
        
            
            RequestDispatcher dispatcher=request.getRequestDispatcher("/WEB-INF/jsp/confirm.jsp");
            dispatcher.forward(request,response);
      
            //response.sendRedirect("/LoginServlet");
        
    }
}
