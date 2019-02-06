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
import model.adminDAO;
import model.driver;
import model.driverDAO;

public class driverServlet extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        String did = request.getParameter("dID");
        String dname = request.getParameter("dname");
        String dsalary = request.getParameter("dsalary");
        String dage = request.getParameter("dage");
        String dln = request.getParameter("dln");
        driver d = new driver();
        d.setId(did);
        d.setName(dname);
        d.setSalary(dsalary);
        d.setAge(dage);
        d.setLn(dln);
        driverDAO a = new driverDAO();

        
        if (a.update(d)) {
            HttpSession session = request.getSession();
            session.setAttribute("dname", dname);
            RequestDispatcher rd = request.getRequestDispatcher("driverdetails.jsp");
            rd.forward(request, response);

        } else {
            response.sendRedirect("driverupdate.jsp");
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
