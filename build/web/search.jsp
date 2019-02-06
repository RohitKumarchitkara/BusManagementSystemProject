

<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.Connection"%>
<%
String driver = "com.mysql.jdbc.Driver";
try {
Class.forName(driver);
} catch (ClassNotFoundException e) {
e.printStackTrace();
}
Connection connection = null;
Statement statement = null;
ResultSet resultSet = null;
 String id = request.getParameter("dID"); 
 String name = request.getParameter("dname");    
%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <style>
             .header 
          {
              height: 100px;
              background-color: black;
              color: white;
            
              
              font-size: 20px;
              width: 600px;
              position: relative;
              left: 330px;
              top: 50px;
              flex-wrap: wrap;
              border: 3px solid white;
          }
         .main
         {
             background-color: grey;
             height: 200px;
             display: flex;
             border: 2px solid black;
             flex-wrap: wrap;
             
         }
         #customers {
    font-family: "Trebuchet MS", Arial, Helvetica, sans-serif;
    border-collapse: collapse;
    width: 100%;
}

#customers td, #customers th {
    border: 3px solid black;
    padding: 20px;
}

#customers tr:nth-child(even){background-color: #f2f2f2;}

#customers tr:hover {background-color: cyan;}
#customers th:hover {background-color: green;}
#customers th {
    padding-top: 12px;
    padding-bottom: 12px;
    text-align: left;
    background-color: dodgerblue;
    color: white;
}
         </style>
    </head>
    <body>
        <div class="main">
        <div class="header">
            <h1><b><center>Record Details</center></b></h1>
        </div>
        </div>
        <div class="cont">
            <table border="3 solid black" id="customers">
<tr>
    <th><B>Driver ID</b></th>
    <th><b>Driver Name</b></th>
    <th><b>Driver Salary</b></th>
    <th><b>Driver Age</b></th>
    <th><b>Licence Number</b></th>
    
</tr>
<%
try{
connection = DriverManager.getConnection("jdbc:mysql://localhost/busman", "root", "");
statement=connection.createStatement();
 String sql = "select *from driver1 where DID='"+id+"' and DName='"
                     + name+"'";
resultSet = statement.executeQuery(sql);
while(resultSet.next()){
%>
<tr>
<td><b><%=resultSet.getString(1) %></b></td>
<td><%=resultSet.getString(2) %></td>
<td><%=resultSet.getString(3) %></td>
<td><%=resultSet.getString(4) %></td>
<td><%=resultSet.getString(5) %></td>


<%
}
connection.close();
} catch (Exception e) {
e.printStackTrace();
}
%>
</table>
            
            
        </div>
    </body>
</html>
