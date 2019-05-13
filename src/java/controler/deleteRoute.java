
package controler;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import model.delete;
import model.deleteDAO;
import model.deleteRouteDAO;
import model.route;

public class deleteRoute extends HttpServlet {
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
            response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter(); 
           String code = request.getParameter("rc");
        String name = request.getParameter("rn");
        
        
        route d = new route();
        d.setRcode(code);
        d.setRname(name);
       
        deleteRouteDAO dd = new deleteRouteDAO();   

        
        if (dd.check1(d)) {
            HttpSession session = request.getSession();
            session.setAttribute("dname", name);
            out.print("<script>alert('Your Driver Details has been Deleted'); setTimeout(function(){window.location='routehome1.html'}, 1*1000);</script>");
           
        } else {
            
             out.print("<script>alert('Sorry....Please Match Id and Name'); setTimeout(function(){window.location='deleteroute.html'}, 1*1000);</script>");
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
