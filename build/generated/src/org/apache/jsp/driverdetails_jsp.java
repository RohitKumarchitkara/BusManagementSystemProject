package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class driverdetails_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("        <style>\n");
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
      out.write("         .con\n");
      out.write("         {\n");
      out.write("             background-color: white;\n");
      out.write("             border: 4px solid black;\n");
      out.write("             height: 500px;\n");
      out.write("             display: flex;\n");
      out.write("         }\n");
      out.write("         .A\n");
      out.write("         {\n");
      out.write("             height: 500px;\n");
      out.write("             border: 2px solid black;\n");
      out.write("               margin-left: 350px;\n");
      out.write("               width: 500px;\n");
      out.write("         }\n");
      out.write("         input[type=text] {\n");
      out.write("  width: 200px;\n");
      out.write("  padding: 5px 20px;\n");
      out.write(" \n");
      out.write("  box-sizing: border-box;\n");
      out.write("  border: 2px solid black;\n");
      out.write("  outline: none;\n");
      out.write("}\n");
      out.write("    input[type=text]:hover\n");
      out.write("    {\n");
      out.write("        box-shadow: 10px 10px 10px black;\n");
      out.write("        border: 10px solid dodgerblue;\n");
      out.write("    }\n");
      out.write("     .btn\n");
      out.write("              {\n");
      out.write("                background-color:dodgerblue;\n");
      out.write("                border: none;\n");
      out.write("                color:white;\n");
      out.write("                border-radius: 10px;\n");
      out.write("               height: 45px;\n");
      out.write("               width: 130px;\n");
      out.write("               font-size: 15px;\n");
      out.write("               margin-left: 200px;\n");
      out.write("              cursor: pointer;\n");
      out.write("            \n");
      out.write("             \n");
      out.write("            }\n");
      out.write("            .btn:hover\n");
      out.write("            {\n");
      out.write("                box-shadow: 10px 10px 20px black;\n");
      out.write("            }\n");
      out.write("            .B\n");
      out.write("            {\n");
      out.write("               border: 2px solid black;\n");
      out.write("               height: 500px;\n");
      out.write("               width: 500px;\n");
      out.write("               margin-left: 0px;\n");
      out.write("            }\n");
      out.write("            .bt1\n");
      out.write("            {\n");
      out.write("                background-color:dodgerblue;\n");
      out.write("                border: none;\n");
      out.write("                color:white;\n");
      out.write("                border-radius: 10px;\n");
      out.write("               height: 45px;\n");
      out.write("               width: 250px;\n");
      out.write("               font-size: 25px;\n");
      out.write("               margin-left: 100px;\n");
      out.write("              cursor: pointer;\n");
      out.write("              text-align: center;\n");
      out.write("            }\n");
      out.write("            .bt1:hover\n");
      out.write("            {\n");
      out.write("                box-shadow: 10px 10px 20px black;\n");
      out.write("            }\n");
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div class=\"main\">\n");
      out.write("        <div class=\"header\">\n");
      out.write("            <h1><b><center>Driver Details</center></b></h1>\n");
      out.write("        </div>\n");
      out.write("        </div>\n");
      out.write("            <div class=\"con\">\n");
      out.write("               \n");
      out.write("                <div class=\"A\">\n");
      out.write("                  <br><br>\n");
      out.write("                    <form action=\"search.jsp\" method=\"post\">\n");
      out.write("                        <b>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Driver ID</b> :&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input type =\"text\" name=\"dID\"><br>\n");
      out.write("                        <br>\n");
      out.write("                        <br>\n");
      out.write("                        <b>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Driver Name</b> :&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input type =\"text\" name=\"dname\"><br>\n");
      out.write("                        <br>\n");
      out.write("                        <br>\n");
      out.write("                       \n");
      out.write("             \n");
      out.write("                        <button class=\"btn\"><b>Search</b></button>\n");
      out.write("                    </form>\n");
      out.write("                </div>\n");
      out.write("           \n");
      out.write("                <div class=\"B\">\n");
      out.write("                    <br><br><br>\n");
      out.write("                    <a href=\"driverupdate.jsp\"> <button class=\"bt1\"><b>Add Record</b></button></a><br><br><br>\n");
      out.write("                    <a href=\"viewrecord.jsp\"><button class=\"bt1\"><b>View Record</b></button></a><br><br><br>\n");
      out.write("                    <a href=\"deleteRecord.jsp\"><button class=\"bt1\"><b>Delete Record</b></button></a><br><br><br>\n");
      out.write("                    <button class=\"bt1\"><b>New Record</b></button><br><br><br>\n");
      out.write("                    <button class=\"bt1\"><b>Update Record</b></button><br><br><br>\n");
      out.write("                </div>\n");
      out.write("                \n");
      out.write("                 \n");
      out.write("                    \n");
      out.write("            </div>\n");
      out.write("      \n");
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
