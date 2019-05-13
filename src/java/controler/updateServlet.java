
package controler;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class updateServlet extends HttpServlet {
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
         String id = request.getParameter("id");
          String name = request.getParameter("name");
           String age = request.getParameter("age");
           String ln = request.getParameter("ln");
           String salary = request.getParameter("salary");
           String name1 = request.getParameter("name1");
           String age1 = request.getParameter("age1");
           String ln1 = request.getParameter("ln1");
           String salary1 = request.getParameter("salary1");
                     try 
        {
            Configuration cf=new Configuration();
            cf.configure();
            SessionFactory sf = cf.buildSessionFactory();
            Session session1 =sf.openSession();
            session1 =sf.openSession();
            Transaction tx = session1.beginTransaction();
            String hql = "update driver  r set r.name=:n1,r.age=:a1,r.ln=:l1,r.salary=:s1 where r.id=:r_no";
            Query query = session1.createQuery(hql);
            query.setParameter("n1",name1);
            query.setParameter("a1",age1);
            query.setParameter("l1",ln1);
            query.setParameter("s1",salary1);
            query.setParameter("r_no",id);
            query.executeUpdate();
            out.print("<script>alert('Driver Detail has been Updated'); setTimeout(function(){window.location='driverdetail2.html'}, 1*500);</script>");
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
