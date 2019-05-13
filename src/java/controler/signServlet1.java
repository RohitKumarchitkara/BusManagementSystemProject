
package controler;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import model.Sign1;
import model.sign;
import model.signDAO;

public class signServlet1 extends HttpServlet {

   
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
               response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        String uname = request.getParameter("username");
        String uid = request.getParameter("uid");
        String pass = request.getParameter("password");
        String mail = request.getParameter("email");
        String route1 = request.getParameter("rt");
        
        Sign1 s = new Sign1();
        s.setName(uname);
        s.setPassword(pass);
        s.setUid(uid);
        s.setEmail(mail);
        s.setRoute(route1);
        s.setPermission("NULL");
        signDAO a = new signDAO();
        if (a.create1(s)) {
            HttpSession session = request.getSession();
            session.setAttribute("rno",uid);
            session.setAttribute("dname", uname);
            RequestDispatcher rd = request.getRequestDispatcher("loginsignup.jsp");
            rd.forward(request, response);
        } else {
            out.print("<script type=\"text/javascript\">");
            out.print("alert('Nothing to display')");
            out.print("location='loginsignup.jsp'");
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
