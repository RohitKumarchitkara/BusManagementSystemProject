

<%@page import="model.route"%>
<%@page import="model.driver"%>
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
 String name = request.getParameter("rname"); 
 String code = request.getParameter("rcode");    
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
            image{
                height: 100vh;
                width: 100%;
            }
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
         #particles-js
		{
			height: 100%;
			background-color: black;
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

#customers tr:nth-child(even){background-color: #18dcff;}



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
	background-color:#15c1dc;
	color:white;
	font-size: 45px;
	height: 100px;
	padding: 5px;
}
.table-dark td, .table-dark th, .table-dark thead th
{
   border-color: black;
    background-color: whitesmoke;
    color: black;
}
.nav{
			display: flex;
			background-color: black;
			justify-content: left;
			align-items: left;
		}

		.nav a{
			text-align: center;
			text-decoration: none;
			color: #f1f1f1;
			padding: 12px 14px;
			width: 20%;

		}
                                .abc 
{
    background-color: #f70334;
}

		.nav a:hover{
			color: #333;
			background-color: gainsboro;
		}

         </style>
    </head>
    <body>
        	<div class="head">
             <b>Search Record</b>
		</div>
           	<div class="nav">
	<a href="routehome1.html">HOME</a>
		<a href="driverdetail2.html">Driver</a>
		<a href="busdetails2.html">Bus</a>
		<a href="routehome1.html">Routes</a>
	        
  <a href="logout" class="abc">Logout</a>
</div>
        <div class="cont">
            <table class="table table-dark table-hover">
<tr>
    <th><B>Route Code</b></th>
    <th><b>Route Name</b></th>
    <th><b>Destination</b></th>
    <th><b>Driver Name</b></th>
    <th><b>Pick-Up-Point</b></th>
    <th><b>Time</b></th>
</tr>
<%
Configuration cf=new Configuration();
cf.configure();
SessionFactory sf = cf.buildSessionFactory();
  Session session1 =sf.openSession();
session1 =sf.openSession();
String SQL_QUERY ="from route where rcode='"+code+"' and rname='"
                     + name+"'";
Query query = session1.createQuery(SQL_QUERY);
Iterator it=query.iterate();
while(it.hasNext())
{
route e=(route)it.next();
String code1=e.getRcode();
String name1=e.getRname();
String point=e.getPpoint(); 
String des = e.getDestination();
String time = e.getTime();
String dname = e.getDname();
%>                  
<tr>
<td><%=code1%></td>
<td><%=name1%></td>
<td><%=des%></td>
<td><%=dname%></td>
<td><%=point%></td>
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

