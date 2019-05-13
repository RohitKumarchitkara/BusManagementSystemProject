package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import model.Sign1;
import model.driver;
import java.util.Iterator;
import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.Connection;
import org.hibernate.Session;

public final class newregistration_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("          <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css\">\n");
      out.write("  <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js\"></script>\n");
      out.write("  <script src=\"https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js\"></script>\n");
      out.write("  <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js\"></script>\n");
      out.write("        <style>\n");
      out.write("            body \n");
      out.write("            {\n");
      out.write("                background-color: black;\n");
      out.write("            }\n");
      out.write("             .header \n");
      out.write("          {\n");
      out.write("              height: 100px;\n");
      out.write("              background-color: black;\n");
      out.write("              color: white;\n");
      out.write("            \n");
      out.write("              \n");
      out.write("              font-size: 20px;\n");
      out.write("              width: 600px;\n");
      out.write("              position: relative;\n");
      out.write("              left: 330px;\n");
      out.write("              top: 50px;\n");
      out.write("              flex-wrap: wrap;\n");
      out.write("              border: 3px solid white;\n");
      out.write("          }\n");
      out.write("         .main\n");
      out.write("         {\n");
      out.write("             background-color: grey;\n");
      out.write("             height: 200px;\n");
      out.write("             display: flex;\n");
      out.write("             border: 2px solid black;\n");
      out.write("             flex-wrap: wrap;\n");
      out.write("             \n");
      out.write("         }\n");
      out.write("         #customers {\n");
      out.write("    font-family: \"Trebuchet MS\", Arial, Helvetica, sans-serif;\n");
      out.write("    border-collapse: collapse;\n");
      out.write("    width: 100%;\n");
      out.write("}\n");
      out.write("\n");
      out.write("#customers td, #customers th {\n");
      out.write("    border: 3px solid black;\n");
      out.write("    padding: 20px;\n");
      out.write("}\n");
      out.write("\n");
      out.write("#customers tr:nth-child(even){background-color: white;}\n");
      out.write("#customers tr:nth-child(odd){background-color: graytext;}\n");
      out.write("#customers tr:hover {background-color: #303952;color: white;}\n");
      out.write("\n");
      out.write("#customers th {\n");
      out.write("    padding-top: 12px;\n");
      out.write("    padding-bottom: 12px;\n");
      out.write("    text-align: left;\n");
      out.write("    background-color: dodgerblue;\n");
      out.write("    color: white;\n");
      out.write("}\n");
      out.write(".head \n");
      out.write("{\n");
      out.write("\tdisplay: flex;\n");
      out.write("\tjustify-content: center;\n");
      out.write("\talign-items: center;\n");
      out.write("\tbackground-color:#0fcbea;\n");
      out.write("\tcolor:white;\n");
      out.write("\tfont-size: 45px;\n");
      out.write("\theight: 100px;\n");
      out.write("\tpadding: 5px;\n");
      out.write("}\n");
      out.write("         </style>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        \n");
      out.write("\t\t<div class=\"head\">\n");
      out.write("             <b>User Records</b>\n");
      out.write("\t\t</div>\n");
      out.write("        <div class=\"cont\">\n");
      out.write("<!--            <table border=\"3 solid black\" id=\"customers\">-->\n");
      out.write("  <table class=\"table table-dark table-hover\">\n");
      out.write("<tr>\n");
      out.write("    <th><B>User ID</b></th>\n");
      out.write("    <th><b>User Name</b></th>\n");
      out.write("    <th><b>Password</b></th>\n");
      out.write("    <th><b>Email</b></th>\n");
      out.write("    <th><b>Route</b></th>\n");
      out.write("    <th><b>Check</b></th>\n");
      out.write("</tr>\n");

Configuration cf=new Configuration();
cf.configure("cfgpackage/hibernate1.cfg.xml");
SessionFactory sf = cf.buildSessionFactory();
  Session session1 =sf.openSession();
session1 =sf.openSession();
String SQL_QUERY ="from Sign1";
Query query = session1.createQuery(SQL_QUERY);
Iterator it=query.iterate();
while(it.hasNext())
{
Sign1 e=(Sign1)it.next();
String id=e.getUid();
String name=e.getName();
String pass=e.getPassword(); 
String mail = e.getEmail();
String route = e.getRoute();

      out.write("                  \n");
      out.write("<tr>\n");
      out.write("<td id='");
      out.print(id);
      out.write('\'');
      out.write('>');
      out.print(id);
      out.write("</td>\n");
      out.write("<td>");
      out.print(name);
      out.write("</td>\n");
      out.write("<td>");
      out.print(pass);
      out.write("</td>\n");
      out.write("<td>");
      out.print(mail);
      out.write("</td>\n");
      out.write("<td>");
      out.print(route);
      out.write("</td>\n");
      out.write("<td><button onclick=\"submit('");
      out.print(id);
      out.write("')\">Accept</button>\n");
      out.write("</tr>\n");

}
session1.close();

      out.write("\n");
      out.write("</table>\n");
      out.write("            \n");
      out.write("            s\n");
      out.write("        </div>\n");
      out.write("    <script>\n");
      out.write("        const xhr = new XMLHttpRequest();\n");
      out.write("        function submit(submitId) {\n");
      out.write("            const id = document.getElementById(submitId).textContent;\n");
      out.write("            xhr.open(\"GET\", \"/busmanagementsystem/permission?id=\"+id);\n");
      out.write("            xhr.send();\n");
      out.write("        }\n");
      out.write("    </script>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
