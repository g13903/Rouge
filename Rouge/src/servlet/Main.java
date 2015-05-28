/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package servlet;

import java.io.IOException;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import model.Data;
import model.GetDataListLogic;
//import model.User;

/**
 *
 * @author 
 */

public class Main extends HttpServlet {

    private static final long serialVersionUID = 1L;


    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
  
        GetDataListLogic getMutterListLogic=new GetDataListLogic();
        List<Data> dataList=getMutterListLogic.execute();
        request.setAttribute("dataList", dataList);
    
          
        HttpSession session = request.getSession();
        String name=(String)session.getAttribute("name");
        
         if(name==null){
            response.sendRedirect("/WelcomeServet/");
        }else{
            RequestDispatcher dispatcher=request.getRequestDispatcher("/WEB-INF/jsp/main.jsp");
            dispatcher.forward(request,response);
        }
    }
    /**
     * Handles the HTTP
     * <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs                                                                                                
     * @throws IOException if an I/O error occurs
     */
    @Override      
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
     
            request.setCharacterEncoding("UTF-8");
            //String text=request.getParameter("text");
            
            /*if(text!=null&&text.length()!=0){
                /*ServletContext application = this.getServletContext();
                List<Mutter> mutterList=(List<Mutter>)application.getAttribute("mutterList");
        
        HttpSession session = request.getSession();
        String userId=(String)session.getAttribute("userId");
        
        Mutter mutter=new Mutter(userId,text);
        PostMutterLogic postMutterLogic=new PostMutterLogic();
        postMutterLogic.execute(mutter);
        GetMutterListLogic getMutterListLogic=new GetMutterListLogic();
        List<Mutter> mutterList=getMutterListLogic.execute();
        request.setAttribute("mutterList",mutterList ); 
            }else{
                request.setAttribute("errorMsg","������������������������������������������");
            
            }*/
            RequestDispatcher dispatcher= request.getRequestDispatcher("/WEB-INF/jsp/main.jsp");
            dispatcher.forward(request, response);
    }
    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>
}
