

<%@page import="java.util.List"%>
<%@page import="model.bus"%>
<%@page import="java.util.Iterator"%>
<%@page import="org.hibernate.Query"%>
<%@page import="org.hibernate.Session"%>
<%@page import="org.hibernate.SessionFactory"%>
<%@page import="org.hibernate.cfg.Configuration"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.Connection"%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
               <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
  <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"></script>
        <style>
            body 
            {
                background-image: url("oi1.jpg");
                background-repeat: no-repeat;
            }
             .header 
          {
              height: 100px;
              background-color: red;
              color: white;
            
              
              font-size: 20px;
              width: 600px;
              position: relative;
              left: 330px;
              top: 50px;
              flex-wrap: wrap;
              border: 3px solid white;
              box-shadow: 10px 10px 10px white;
          }
         .main
         {
             background-color: black;
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

#customers tr:nth-child(even){background-color: white;}

#customers tr:hover {background-color: #303952;color: white;}

#customers th {
    padding-top: 12px;
    padding-bottom: 12px;
    text-align: left;
    background-color: dodgerblue;
    color: white;
}
.head 
{
	display: flex;
	justify-content: center;
	align-items: center;
	background-color:#16d1ef;
	color:white;
	font-size: 45px;
	height: 100px;
	padding: 5px;
}
.nav{
			display: flex;
			background-color: black;

		}

		.nav a{
			text-align: center;
			text-decoration: none;
			color: #f1f1f1;
			padding: 12px 14px;
			width: 20%;

		}

		.nav a:hover{
			color: black;
			background-color: whitesmoke;
		}
                .button is-danger
                {
                    height: 45;
                }
                .abc 
{
    background-color: #f70334;
}
.table-dark td, .table-dark th, .table-dark thead th 
{
    border-color: white;
}
.table-dark th{
    background-color: black;
}
         </style>
    </head>
    <body>
        <div class="head">
             <b>Bus Record Details</b>
		</div>
        <div class="nav">
	<a href="busdetails2.html">HOME</a>
		<a href="driverdetail2.html">Driver</a>
		<a href="busdetails2.html">Bus</a>
		<a href="routehome1.html">Routes</a>
	        
  
  
  <a href="logout" class="abc">Logout</a>
</div>
        <br>
        <div class="cont">
            <table class="table table-dark table-hover">
<tr>
    <th><B>Bus ID</b></th>
    <th><B>Driver ID</b></th>
    <th><b>Driver Name</b></th>
    <th><b>Driver Contact</b></th>
    <th><b>Departure From</b></th>
    <th><b>Arrival At</b></th>
    <th><B>Arrival Time</b></th>
    
</tr>
<%
   List<bus> records =  (List<bus>)request.getAttribute("list");   
   for(bus s: records)
   {

     
%>
<tr>
<td><%=s.getBId()%></td>
<td><%=s.getDId()%></td>
<td><%=s.getName()%></td>
<td><%=s.getContact()%></td>
<td><%=s.getDeparture()%></td>
<td><%=s.getArival()%></td>
<td><%=s.getTime()%></td>
</tr>
<%
}
%>
</table>
            
            
        </div>
    </body>
</html>
