<%-- 
    Document   : logout
    Created on : 27 Mar, 2019, 11:23:44 PM
    Author     : ROHIT
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%
session.setAttribute("uname", null);
session.invalidate();
response.sendRedirect(request.getContextPath());
%>
