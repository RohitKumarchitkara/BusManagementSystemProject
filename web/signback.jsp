<%-- 
    Document   : registration
    Created on : 2 Nov, 2018, 6:37:00 PM
    Author     : ROHIT
--%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ page import ="java.sql.*" %>
<%@ page import ="java.sql.SQLIntegrityConstraintViolationException" %>
<%
    String user = request.getParameter("username");    
    String pwd = request.getParameter("password");
    String rpwd = request.getParameter("r_password");
    String email = request.getParameter("email");
    Class.forName("com.mysql.jdbc.Driver");
    Connection con = DriverManager.getConnection("jdbc:mysql://localhost/busman","root","");
    Statement st = con.createStatement();
    try {
        st.executeUpdate("insert into signtable(uname, upassword, repeatpass, email) values ('" + user + "','" + pwd + "','" + rpwd + "','" + email + "')");
    
        //session.setAttribute("uname", user);
         //response.sendRedirect("welcome.jsp");
       out.print("<script>alert('Your Account Succesfully Created'); setTimeout(function(){window.location='loginsignup.jsp'}, 1*1000);</script>");
    } catch (SQLIntegrityConstraintViolationException e) {
        out.println("<script>alert('User already Exists'); setTimeout(function(){window.location='loginsignup.jsp'}, 1*1000);</script>");
        //response.sendRedirect("first.jsp");
    }
%>
