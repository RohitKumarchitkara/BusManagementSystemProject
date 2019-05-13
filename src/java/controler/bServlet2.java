/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controler;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import model.bus;
import model.busdao1;

/**
 *
 * @author ROHIT
 */
public class bServlet2 extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
            response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        String bid = request.getParameter("bid");
        String did = request.getParameter("did");
        String dname = request.getParameter("dname");
        String contact = request.getParameter("con");
        String dfrom = request.getParameter("dfrom");
        String arival = request.getParameter("aat");
        String atime = request.getParameter("at");
        bus d = new bus();
        
        d.setBId(bid);
         d.setDId(did);
        d.setName(dname);
        d.setContact(contact);
        d.setDeparture(dfrom);
        d.setArival(arival);
         d.setTime(atime);
        busdao1 a = new busdao1();

        
        if (a.add(d)) {
            HttpSession session = request.getSession();
            session.setAttribute("dname", dname);
            RequestDispatcher rd = request.getRequestDispatcher("busdetails2.html");
            rd.forward(request, response);

        } else {
            response.sendRedirect("busadd1.html");
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
