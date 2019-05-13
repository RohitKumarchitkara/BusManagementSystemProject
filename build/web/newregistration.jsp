 

<%@page import="model.Sign1"%>
<%@page import="model.driver"%>
<%@page import="java.util.Iterator"%>
<%@page import="org.hibernate.Query"%>
<%@page import="org.hibernate.SessionFactory"%>
<%@page import="org.hibernate.cfg.Configuration"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.Connection"%>
<%@page import="org.hibernate.Session"%>

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
            .table-dark th,.table-dark thead th,.table-dark td
            {
                    border-color: #f8f9fa;
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
#customers tr:nth-child(odd){background-color: graytext;}
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
	background-color:#0fcbea;
	color:white;
	font-size: 45px;
	height: 100px;
	padding: 5px;
}
#btn 
{
    background-color: #06e80a;
    border-radius: 10px;
    cursor: pointer;
    color: white;
    width: 100px;
    height: 40px;
    border: none;
    
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
         </style>

    </head>
    <body>
        
		<div class="head">
             <b>User Records</b>
		</div>
        <div class="nav">
	<a href="adminhome.html">HOME</a>
		<a href="driverdetail2.html">Driver</a>
		<a href="busdetails2.html">Bus</a>
		<a href="routehome1.html">Routes</a>
	        
  <a href="logout" class="abc">Logout</a>
</div>
        <br>
        <div class="cont">
<!--            <table border="3 solid black" id="customers">-->
  <table class="table table-dark table-hover">
<tr>
    <th><B>User ID</b></th>
    <th><b>User Name</b></th>
    <th><b>Password</b></th>
    <th><b>Email</b></th>
    <th><b>Route</b></th>
    <th><b>Check</b></th>
</tr>
<%
Configuration cf=new Configuration();
cf.configure("cfgpackage/hibernate1.cfg.xml");
SessionFactory sf = cf.buildSessionFactory();
  Session session1 =sf.openSession();
session1 =sf.openSession();
String SQL_QUERY ="from Sign1 where permission= :paru";
Query query = session1.createQuery(SQL_QUERY);
query.setParameter("paru","null");
Iterator it=query.iterate();
while(it.hasNext())
{
Sign1 e=(Sign1)it.next();
String id=e.getUid();
String name=e.getName();
String pass=e.getPassword(); 
String mail = e.getEmail();
String route = e.getRoute();
%>                  
<tr>
<td id='<%=id%>'><%=id%></td>
<td><%=name%></td>
<td><%=pass%></td>
<td><%=mail%></td>
<td><%=route%></td>
<td><button id="btn" onclick="submit('<%=id%>')"><b>Accept</b></button>
</tr>
<%
}
session1.close();
%>
</table>
            
            s
        </div>
    <script>
        const xhr = new XMLHttpRequest();
        function submit(submitId) {
            const id = document.getElementById(submitId).textContent;
            xhr.open("GET", "/busmanagementsystem/permission?id="+id);
            xhr.send();
        }
    </script>
    </body>
</html>
