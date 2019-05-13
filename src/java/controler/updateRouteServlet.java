
package controler;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class updateRouteServlet extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        String id = request.getParameter("id");
          
           String rname1 = request.getParameter("rname1");
   
           String ppt1 = request.getParameter("ppt1");
             String dname1 = request.getParameter("dname1");
          
                     try 
        {
            Configuration cf=new Configuration();
            cf.configure();
            SessionFactory sf = cf.buildSessionFactory();
            Session session1 =sf.openSession();
            session1 =sf.openSession();
            Transaction tx = session1.beginTransaction();
            String hql = "update route  r set r.rname=:n1,r.dname=:d1,r.ppoint=:p1 where r.rcode=:r_no";
            Query query = session1.createQuery(hql);
            query.setParameter("n1",rname1);
            query.setParameter("d1",dname1);
            query.setParameter("p1",ppt1);
         
            query.setParameter("r_no",id);
            query.executeUpdate();
            out.print("<script>alert('Driver Detail has been Updated'); setTimeout(function(){window.location='routehome1.html'}, 1*500);</script>");
            tx.commit();
//            out.print("<script>alert('Driver detail has been Updated');</script>");
//               RequestDispatcher rd = request.getRequestDispatcher("driverdetail2.html");
//              rd.forward(request,response);
            session1.close();
            sf.close();
        }
          catch(Exception e)
          {
               e.printStackTrace();
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
