

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
<%
 String bid = request.getParameter("bid"); 
 String did = request.getParameter("did");    
%>
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
                background-image: url("sb.jpg");
                background-repeat: no-repeat;
            }
             .header 
          {
              height: 100px;
              background-color: red;
              color: white;
            
              box-shadow: 10px 10px 10px white;
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

#customers tr:nth-child(even){background-color:#18dcff;}

#customers tr:hover {background-color: #303952;color: white;}
#customers th:hover {background-color:  #fff200; color: black;}
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
	background-color:rgba(15, 120, 232, 0.25);
	color:white;
	font-size: 45px;
	height: 100px;
	padding: 5px;
}
#particles-js
		{
			height: 100%;
			background-color: black;
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
    background-color: white;
    color: black;
}
         </style>
    </head>
    <body>
        <div class="head">
             <b>Search Record</b>
		</div>
                     
<div class="nav">
	<a href="busdetails2.html">HOME</a>
		<a href="driverdetail2.html">Driver</a>
		<a href="busdetails2.html">Bus</a>
		<a href="routehome1.html">Routes</a>
	        
 
  <a href="logout" class="abc">Logout</a>
</div>
        <div class="cont">
            <table class="table table-dark table-hover">
<tr>
    <th><B><u>Bus ID</u></b></th>
    <th><B><u>Driver ID</u></b></th>
    <th><b><u>Driver Name</u></b></th>
    <th><b><u>Driver Contact</u></b></th>
    <th><b><u>Departure From</u></b></th>
    <th><b><u>Arrival At</u></b></th>
    <th><B><u>Arrival Time</u></b></th>
</tr>
<%
Configuration cf=new Configuration();
cf.configure();
SessionFactory sf = cf.buildSessionFactory();
  Session session1 =sf.openSession();
session1 =sf.openSession();
String SQL_QUERY ="from bus where bid='"+bid+"' and did='"+did+"'";
Query query = session1.createQuery(SQL_QUERY);
Iterator it=query.iterate();
while(it.hasNext())
{
bus e=(bus)it.next();
String id1=e.getBId();
String id2=e.getDId();
String name=e.getName();
String contact=e.getContact(); 
String dep = e.getDeparture();
String ar = e.getArival();
String time=e.getTime();
%> 
<tr>
<td><%=id1%></td>
<td><%=id2%></td>
<td><%=name%></td>
<td><%=contact%></td>
<td><%=dep%></td>
<td><%=ar%></td>
<td><%=time%></td>
</tr>
<%
}
session1.close();
%>
</table>
            
            
        </div>
	<div id="particles-js">
            <script type="text/javascript" src="particles.js"></script>
     <script type="text/javascript" src="app1.js"></script>
</div>
    </body>
</html>
