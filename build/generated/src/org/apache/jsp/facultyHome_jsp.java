package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class facultyHome_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("<link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/bulma/0.7.4/css/bulma.min.css\">\n");
      out.write("<style>\n");
      out.write("body \n");
      out.write("{      \n");
      out.write("   background-image: url(\"uc.jpg\");\n");
      out.write("   height:110vh;\n");
      out.write("\t           \n");
      out.write("    background-size:cover; \n");
      out.write("    background-position: center;       \n");
      out.write("    margin: 0;\n");
      out.write("    padding: 0;\n");
      out.write(" }\n");
      out.write(".c {\n");
      out.write("display: flex;\n");
      out.write("justify-content: center;\n");
      out.write("align-items: center;\n");
      out.write("flex-wrap: wrap;\n");
      out.write("}\n");
      out.write(".a {\n");
      out.write("width:300px;\n");
      out.write("height:300px;\n");
      out.write("background: green;\n");
      out.write("}\n");
      out.write(".b {\n");
      out.write("width:300px;\n");
      out.write("height:300px;\n");
      out.write("background: blue;\n");
      out.write("padding-left: 20px;\n");
      out.write("}\n");
      out.write(".login-box{\n");
      out.write("    width: 320px;\n");
      out.write("    height: 500px;\n");
      out.write("    background: rgba(0, 0, 0, 0.5);\n");
      out.write("    color: wheat;\n");
      out.write("    top: 50%;\n");
      out.write("    margin-top: 54px;\n");
      out.write("    box-sizing: border-box;\n");
      out.write("    font-size: 20px;\n");
      out.write("     \n");
      out.write("}\n");
      out.write("#login-box1{\n");
      out.write("    width: 320px;\n");
      out.write("    height: 500px;\n");
      out.write("    background: rgba(0, 0, 0, 0.7);\n");
      out.write("    color: #fff;\n");
      out.write("    top: 50%;\n");
      out.write("    margin-left: 10px;\n");
      out.write("    margin-top: 54px;\n");
      out.write("    box-sizing: border-box;\n");
      out.write("  font-size: 30px;\n");
      out.write("   color: wheat;\n");
      out.write("  display: none;\n");
      out.write("}\n");
      out.write(".main \n");
      out.write("{\n");
      out.write("\tdisplay: flex;\n");
      out.write("justify-content: center;\n");
      out.write("align-items: center;\n");
      out.write("}\n");
      out.write(".head \n");
      out.write("{\n");
      out.write("\tdisplay: flex;\n");
      out.write("\tjustify-content: center;\n");
      out.write("\talign-items: center;\n");
      out.write("\tbackground-color:#0abde3;\n");
      out.write("\tcolor:white;\n");
      out.write("\tfont-size: 45px;\n");
      out.write("\theight: 100px;\n");
      out.write("\tpadding: 5px;\n");
      out.write("}\n");
      out.write(".nav{\n");
      out.write("\t\t\tdisplay: flex;\n");
      out.write("\t\t\tbackground-color: #333;\n");
      out.write("\t\t\tjustify-content: left;\n");
      out.write("\t\t\talign-items: left;\n");
      out.write("\t\t}\n");
      out.write("\n");
      out.write("\t\t.nav a{\n");
      out.write("\t\t\ttext-align: center;\n");
      out.write("\t\t\ttext-decoration: none;\n");
      out.write("\t\t\tcolor: #f1f1f1;\n");
      out.write("\t\t\tpadding: 12px 14px;\n");
      out.write("\t\t\twidth: 20%;\n");
      out.write("\n");
      out.write("\t\t}\n");
      out.write("\n");
      out.write("\t\t.nav a:hover{\n");
      out.write("\t\t\tcolor: #333;\n");
      out.write("\t\t\tbackground-color: #fff200;\n");
      out.write("\t\t}\n");
      out.write("\t\t.img1\n");
      out.write("\t\t{\n");
      out.write("                 background-image: url(\"l3.jpg\");\n");
      out.write("\t             height:100vh;\n");
      out.write("\t             background-repeat: no-repeat;\n");
      out.write("                background-size:cover; \n");
      out.write("                background-position: center;\n");
      out.write("\t\t}\n");
      out.write("                #btn\n");
      out.write("            {\n");
      out.write("                background-color:#0abde3;\n");
      out.write("                border: none;\n");
      out.write("                color:white;\n");
      out.write("                border-radius: 30px;\n");
      out.write("                padding:8px 16px;\n");
      out.write("                cursor:pointer;\n");
      out.write("                font-size: 20px;\n");
      out.write("              \n");
      out.write("         \n");
      out.write("          }\n");
      out.write("          \n");
      out.write("          a \n");
      out.write("          {\n");
      out.write("              text-decoration: none;\n");
      out.write("              \n");
      out.write("          }\n");
      out.write("           .bt1\n");
      out.write("            {\n");
      out.write("                background-color:#ff4757;\n");
      out.write("                border: none;\n");
      out.write("                color:white;\n");
      out.write("                border-radius: 30px;\n");
      out.write("               height: 45px;\n");
      out.write("               width: 250px;\n");
      out.write("               font-size: 25px;\n");
      out.write("            \n");
      out.write("              cursor: pointer;\n");
      out.write("              text-align: center;\n");
      out.write("              outline: none;\n");
      out.write("            }\n");
      out.write("         \n");
      out.write("            input[type=text]\n");
      out.write("            {\n");
      out.write("                border-radius: 20px;\n");
      out.write("                height: 20px;\n");
      out.write("                outline: none;\n");
      out.write("                padding: 11px;\n");
      out.write("                font-size: 15pt;\n");
      out.write("                width: 220px;\n");
      out.write("                font-family: \"Times New Roman\";\n");
      out.write("            }\n");
      out.write("            a \n");
      out.write("            {\n");
      out.write("                width: 150px;\n");
      out.write("            }\n");
      out.write("</style>\n");
      out.write("<script src=\"jquery-3.3.1 (1).js\">\n");
      out.write("    \n");
      out.write("  </script>\n");
      out.write("  <script type=\"text/javascript\">\n");
      out.write("    $(document).ready(function(){\n");
      out.write("  $(\"#b\").click(function(){\n");
      out.write("    $(\"#login-box1\").toggle();\n");
      out.write("  \n");
      out.write("  });\n");
      out.write("});\n");
      out.write("  </script>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("\t\n");
      out.write("\t\n");
      out.write("\t\n");
      out.write("                <div class=\"head\">\n");
      out.write("                    <b>Bus Management System</b>\n");
      out.write("                   \n");
      out.write("\t\t</div>\n");
      out.write("\t\t\n");
      out.write("\n");
      out.write("<div class=\"c\">\n");
      out.write("   \n");
      out.write("    <div class=\"login-box\">\n");
      out.write("        <center><img src=\"a1.png\" height=\"100px\" width=\"100px\"></center><br>\n");
      out.write("                    <form action=\"searchServlet\" method=\"post\">\n");
      out.write("                        \n");
      out.write("                        <center><b>Route Name</b> <br><input type =\"text\" name=\"rname\" required></center><br>\n");
      out.write("                        \n");
      out.write("                      \n");
      out.write("                        <center><b>Route Code</b> :<br><input type =\"text\" name=\"rcode\" required></center><br>\n");
      out.write("                \n");
      out.write("                      \n");
      out.write("                       \n");
      out.write("             \n");
      out.write("                        <center><button id=\"btn\"><b>Search</b></button></center>\n");
      out.write("                    </form>\n");
      out.write("         <center> <div id=\"b\"><a class=\"button is-danger\">More</a></div></center>\n");
      out.write("</div>\n");
      out.write("<div id=\"login-box1\">\n");
      out.write("   ");

       String sid = (String) session.getAttribute("name");
       System.out.println(sid);
   
      out.write("\n");
      out.write("    <center>\n");
      out.write("        <img src=\"a1.png\" height=\"100px\" width=\"100px\"><br><br><b>User</b>\n");
      out.write("        <br><br>\n");
      out.write("        <a href=\"viewProfile?rd=");
      out.print( sid );
      out.write("\"> <button class=\"bt1\"><b>Profile</b></button></a><br><br>\n");
      out.write("    <a href=\"viewRouteServlet\"> <button class=\"bt1\"><b>Routes Information</b></button></a><br><br>\n");
      out.write("                    \n");
      out.write("                    \n");
      out.write("    </center>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("</body>\n");
      out.write("</html>\n");
      out.write("\n");
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
