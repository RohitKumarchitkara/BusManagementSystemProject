package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import model.Sign1;
import java.util.ArrayList;

public final class NewResgistration_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("  <title>New Registration</title>\n");
      out.write("<style>\n");
      out.write("\n");
      out.write("* {\n");
      out.write("box-sizing: border-box;\n");
      out.write("}\n");
      out.write("   body{\n");
      out.write("      background-image: url(bul.jpg);\n");
      out.write("      -webkit-background-size:cover;\n");
      out.write("      background-size: cover;\n");
      out.write("      background-position: center center;\n");
      out.write("      background-repeat: no-repeat;\n");
      out.write("      background-attachment: fixed;\n");
      out.write("      background-color: #999;\n");
      out.write("      height: 100%;\n");
      out.write("      margin: 0;\n");
      out.write("      font-family: Arial, Helvetica, sans-serif;\n");
      out.write("     }\n");
      out.write("header {\n");
      out.write("  text-align: center;\n");
      out.write("  color:white;\n");
      out.write("  border: 5px solid rgba(0,0,0,.5); \n");
      out.write("  background: rgba(0,0,0,.5);\n");
      out.write("  box-sizing: content-box;\n");
      out.write("}\n");
      out.write("nav {\n");
      out.write("  overflow: hidden;\n");
      out.write("  background-color: #e9e9e9;\n");
      out.write("}\n");
      out.write("nav a {\n");
      out.write("  float: left;\n");
      out.write("  display: block;\n");
      out.write("  color: black;\n");
      out.write("  text-align: center;\n");
      out.write("  padding: 14px 16px;\n");
      out.write("  text-decoration: none;\n");
      out.write("  font-size: 18px;\n");
      out.write("}\n");
      out.write("nav a:hover {\n");
      out.write("  background-color: #c6c6c6;\n");
      out.write("  color: black;\n");
      out.write("}\n");
      out.write("nav a.active {\n");
      out.write("  background-color: #2980B9;\n");
      out.write("  color: white;\n");
      out.write("}\n");
      out.write("nav .search-container {\n");
      out.write("  float: right;\n");
      out.write("}\n");
      out.write("nav input[type=text] {\n");
      out.write("  padding: 6px;\n");
      out.write("  margin-top: 8px;\n");
      out.write("  font-size: 17px;\n");
      out.write("  border: none;\n");
      out.write("}\n");
      out.write("nav .search-container button {\n");
      out.write("  float: right;\n");
      out.write("  padding: 6px 10px;\n");
      out.write("  margin-top: 8px;\n");
      out.write("  margin-right: 16px;\n");
      out.write("  background: #c6c6c6;\n");
      out.write("  font-size: 17px;\n");
      out.write("  border: none;\n");
      out.write("  cursor: pointer;\n");
      out.write("}\n");
      out.write("nav .search-container button:hover {\n");
      out.write("  background: #9a9a9a;\n");
      out.write("}\n");
      out.write("\n");
      out.write("/*----table----*/\n");
      out.write("\n");
      out.write("table {\n");
      out.write("  border: 1px solid #ccc;\n");
      out.write("  border-collapse: collapse;\n");
      out.write("  margin: 0;\n");
      out.write("  padding: 0;\n");
      out.write("  width: 100%;\n");
      out.write("  table-layout: fixed;\n");
      out.write("}\n");
      out.write("\n");
      out.write("table caption {\n");
      out.write("  border: 5px solid rgba(0,0,0,.5); \n");
      out.write("  background: rgba(0,0,0,.5);\n");
      out.write("  box-sizing: content-box;\n");
      out.write("  font-size: 2.5em;\n");
      out.write("  margin: .5em 0 .85em;\n");
      out.write("  color:white;\n");
      out.write("  font-weight: bold;\n");
      out.write("}\n");
      out.write("\n");
      out.write("table tr {\n");
      out.write("  background-color: #f8f8f880;\n");
      out.write("  border: 1px solid #ddd;\n");
      out.write("  padding: .35em;\n");
      out.write("}\n");
      out.write("\n");
      out.write("table th,\n");
      out.write("table td {\n");
      out.write("  padding: .625em;\n");
      out.write("  text-align: center;\n");
      out.write("}\n");
      out.write("\n");
      out.write("table td{\n");
      out.write("  font-weight: bold;\n");
      out.write("}\n");
      out.write("\n");
      out.write("table td a{\n");
      out.write("  display: block;\n");
      out.write("  color: #f1f1f1;\n");
      out.write("  text-align: center;\n");
      out.write("/*  width: 30px;\n");
      out.write("*/  text-decoration: none;\n");
      out.write("  font-size: 30px;\n");
      out.write("  background-color:dodgerblue;\n");
      out.write("  border-radius: 3px; \n");
      out.write("}\n");
      out.write("#rem{\n");
      out.write("  display: block;\n");
      out.write("  color: #f1f1f1;\n");
      out.write("  text-align: center;\n");
      out.write("/*  width: 30px;\n");
      out.write("*/  text-decoration: none;\n");
      out.write("  font-size: 30px;\n");
      out.write("  background-color:red;\n");
      out.write("  border-radius: 3px; \n");
      out.write("}\n");
      out.write("table th {\n");
      out.write("  font-size: 1em;\n");
      out.write("  letter-spacing: .1em;\n");
      out.write("  text-transform: uppercase;\n");
      out.write("  background-color: #000000b3;\n");
      out.write("color: #f1f1f1;\n");
      out.write("}\n");
      out.write("\n");
      out.write("@media screen and (max-width: 600px) {\n");
      out.write("  table {\n");
      out.write("    border: 0;\n");
      out.write("  }\n");
      out.write("\n");
      out.write("  table caption {\n");
      out.write("    font-size: 1.3em;\n");
      out.write("  }\n");
      out.write("  \n");
      out.write("  table thead {\n");
      out.write("    border: none;\n");
      out.write("    clip: rect(0 0 0 0);\n");
      out.write("    height: 1px;\n");
      out.write("    margin: -1px;\n");
      out.write("    overflow: hidden;\n");
      out.write("    padding: 0;\n");
      out.write("    position: absolute;\n");
      out.write("    width: 1px;\n");
      out.write("  }\n");
      out.write("  \n");
      out.write("  table tr {\n");
      out.write("    border-bottom: 3px solid #ddd;\n");
      out.write("    display: block;\n");
      out.write("    margin-bottom: .625em;\n");
      out.write("  }\n");
      out.write("  \n");
      out.write("  table td{\n");
      out.write("    border-bottom: 1px solid #141111cc;\n");
      out.write("    display: block;\n");
      out.write("    font-size: .8em;\n");
      out.write("    text-align: right;\n");
      out.write("  }\n");
      out.write("  table td a{\n");
      out.write("    border-bottom: 1px solid #ddd;\n");
      out.write("/*    float: left;\n");
      out.write("*/   margin-left: 300px;\n");
      out.write("display: block;\n");
      out.write("font-size: 2em;\n");
      out.write("text-align: center;\n");
      out.write("  }\n");
      out.write("  \n");
      out.write("  table td::before {\n");
      out.write("    /*\n");
      out.write("    * aria-label has no advantage, it won't be read inside a table\n");
      out.write("    content: attr(aria-label);\n");
      out.write("    */\n");
      out.write("    content: attr(data-label);\n");
      out.write("    float: left;\n");
      out.write("    font-weight: bold;\n");
      out.write("    text-transform: uppercase;\n");
      out.write("  }\n");
      out.write("  \n");
      out.write("  table td:last-child {\n");
      out.write("    border-bottom: 0;\n");
      out.write("  }\n");
      out.write("}\n");
      out.write("\n");
      out.write("/*-----*/\n");
      out.write("\n");
      out.write("@media (max-width: 768px) {\n");
      out.write("  nav .search-container {\n");
      out.write("    float: none;\n");
      out.write("  }\n");
      out.write("  nav a, nav input[type=text], nav .search-container button {\n");
      out.write("    float: none;\n");
      out.write("    display: block;\n");
      out.write("    text-align: left;\n");
      out.write("    width: 100%;\n");
      out.write("    margin: 0;\n");
      out.write("    padding: 14px;\n");
      out.write("  }\n");
      out.write("  nav input[type=text] {\n");
      out.write("    border: 1px solid #ccc;  \n");
      out.write("  }\n");
      out.write("}\n");
      out.write("/*--------------------------------*/\n");
      out.write("\n");
      out.write(".wrapper{\n");
      out.write("  margin:0 auto;\n");
      out.write("  padding-top:1%;\n");
      out.write("  position:relative;\n");
      out.write("}\n");
      out.write(".wrapper-2{\n");
      out.write("  width:14%;\n");
      out.write("  margin:0 auto;\n");
      out.write("  text-align:right;\n");
      out.write("}\n");
      out.write(".bus{\n");
      out.write("  width:120px;\n");
      out.write("  z-index:10;\n");
      out.write("  animation: bounce 100ms infinite alternate;\n");
      out.write("}\n");
      out.write(".road{\n");
      out.write("  position:absolute;\n");
      out.write("  bottom:2px;\n");
      out.write("  right:inherit;\n");
      out.write("  animation: road 1s ease-out infinite;\n");
      out.write("}\n");
      out.write("\n");
      out.write("@keyframes road{\n");
      out.write("  0%{\n");
      out.write("    transform: translateX(0);\n");
      out.write("  }\n");
      out.write("  75%{\n");
      out.write("    opacity:1;\n");
      out.write("  }\n");
      out.write("  100%{\n");
      out.write("    transform: translateX(-250%);\n");
      out.write("    opacity:0;\n");
      out.write("  }\n");
      out.write("  \n");
      out.write("}\n");
      out.write("\n");
      out.write("@keyframes size{\n");
      out.write("  from{\n");
      out.write("    transform: scale3d(0.75, 0.75, 0.75);\n");
      out.write("    transform: translateX(-350%);\n");
      out.write("\n");
      out.write("  }\n");
      out.write("  \n");
      out.write("  20%{\n");
      out.write("            transform: scale3d(1, 1, 1); \n");
      out.write("  }\n");
      out.write("  \n");
      out.write("  to {\n");
      out.write("       transform: scale3d(0.75, 0.75, 0.75);\n");
      out.write("       transform: translateX(-350%);\n");
      out.write("    }\n");
      out.write("}\n");
      out.write("\n");
      out.write("@keyframes bounce{\n");
      out.write("  0%{\n");
      out.write("  transform:translateY(0)\n");
      out.write("  }\n");
      out.write("  100%{\n");
      out.write("    transform:translateY(-1%)\n");
      out.write("  }\n");
      out.write("}\n");
      out.write("</style>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("\n");
      out.write("<header>\n");
      out.write("  <div class=\"wrapper\">\n");
      out.write("<div>\n");
      out.write("<img src=\"bus2.png\" alt=\"\" class=\"bus\"/>  \n");
      out.write("</div>\n");
      out.write("<div class=\"wrapper-2\">\n");
      out.write("<img src=\"road.png\" alt=\"\" class=\"road\"/>\n");
      out.write("</div>\n");
      out.write("</div>  \n");
      out.write("<h1>Bus Management System</h1>\n");
      out.write("</header>\n");
      out.write("\n");
      out.write("<nav>\n");
      out.write("    <a href=\"#\">Home</a>\n");
      out.write("    <a href=\"#\">Create Route</a>\n");
      out.write("    <a href=\"#\">Delete Route</a>\n");
      out.write("    <a href=\"#\">Update Route</a>\n");
      out.write("    <a href=\"#\">View Routes</a>\n");
      out.write("    <a class=\"active\" href=\"getAllPermission\">New Registration</a>\n");
      out.write("    <a href=\"#\">Logout</a>\n");
      out.write("</nav>\n");
      out.write("  <table>\n");
      out.write("  ");

       int i=0;
       ArrayList<Sign1> ri = (ArrayList<Sign1>)session.getAttribute("allstu");
       if(ri!=null && ri.size()!=0){
           System.out.println("out");
   
      out.write("\n");
      out.write("  <caption>New Registration</caption>\n");
      out.write("  <thead>\n");
      out.write("    <tr>\n");
      out.write("       <th scope=\"col\">S.No</th> \n");
      out.write("      <th scope=\"col\">User Id</th>\n");
      out.write("   \n");
      out.write("      <th scope=\"col\">Email</th>\n");
      out.write("         <th scope=\"col\">User Name</th>\n");
      out.write("      <th scope=\"col\">Password</th>\n");
      out.write("      <th scope=\"col\">Permission</th>\n");
      out.write("      <th scope=\"col\">Route</th>\n");
      out.write("    </tr>\n");
      out.write("  </thead>\n");
      out.write("  <tbody>\n");
      out.write("      ");

          for(i=0;i<ri.size();i++){
      
      out.write("\n");
      out.write("    <tr>\n");
      out.write("      <td data-label=\"S.No\">");
      out.print( i+1);
      out.write("</td>\n");
      out.write("      <td data-label=\"User ID\">");
      out.print((ri.get(i)).getUid() );
      out.write("</td>\n");
      out.write("      <td data-label=\"User Name\">");
      out.print( (ri.get(i)).getName() );
      out.write("</td>\n");
      out.write("      <td data-label=\"Password\">");
      out.print( (ri.get(i)).getPassword() );
      out.write("</td>\n");
      out.write("      ");

          if((ri.get(i)).getPermission().equals("NULL")){
              
              String str = (String)ri.get(0).getRoute();
      
      out.write("\n");
      out.write("      <td data-label=\"Route Name\">");
      out.print( str );
      out.write("</td>\n");
      out.write("      <td data-label=\"Status\"><a href=\"grantPermission?roll=");
      out.print( (ri.get(i)).getUid() );
      out.write("&sto=");
      out.print( (ri.get(i)).getRoute() );
      out.write("\">Accept</a><<a href=\"revokePermission?roll=");
      out.print( (ri.get(i)).getUid() );
      out.write("\" id=\"rem\">Remove</a></td>\n");
      out.write("      ");

          }
          else{
      
      out.write("\n");
      out.write("      <td data-label=\"Route Name\">");
      out.print( (ri.get(i)).getRoute() );
      out.write("</td>\n");
      out.write("      <td data-label=\"Status\"></td>\n");
      out.write("    ");

        }
    
      out.write("\n");
      out.write("    </tr>\n");
      out.write("    ");

        }
    
      out.write("\n");
      out.write("  </tbody>\n");
      out.write("  ");

    }
    else{
        
      out.write("\n");
      out.write("        <tr>\n");
      out.write("            <td>\n");
      out.write("                Nothing to display\n");
      out.write("            </td>\n");
      out.write("        </tr>\n");
      out.write("        ");

    }
   
      out.write("\n");
      out.write("</table>\n");
      out.write("\n");
      out.write("</body>\n");
      out.write("</html>\n");
      out.write("\n");
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
