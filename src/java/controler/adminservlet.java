
package controler;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import model.admin;
import model.admin1;
import model.adminDAO;
import model.user;
import model.userDao;

public class adminservlet extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
            
          String uname = request.getParameter("username");
            String pwd = request.getParameter("password");
            admin1 ad = new admin1();
            ad.setName(uname);
            ad.setPass(pwd);
            
          adminDAO a = new adminDAO();
       
          if(a.check(ad))
          {
             HttpSession session = request.getSession();
              session.setAttribute("uname",uname);
              RequestDispatcher rd = request.getRequestDispatcher("adminhome.html");
              rd.forward(request,response); 
              
          }
          else
          {
               out.print("<script>alert('UserName And Password Does not Match...Please try Again..'); setTimeout(function(){window.location='animationlogin1.html'}, 1*1000);</script>");
             // response.sendRedirect("animationlogin1.html");
          }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
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
