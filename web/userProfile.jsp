

<%@page import="java.util.List"%>
<%@page import="model.Sign1"%>
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
                background-image: url("sb.jpg");
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
.table-dark
{
    background-color: rgba(0,0,0,0.3);
}
.table-dark th,.table-dark td,.table-dark thead th 
{
    border-color: white;
}
.abc 
{
    background-color: #17f108;
    width: 120px;
    outline: none;
    border-radius: 20px;
    color: white;
    height: 40px;
    border: none;
}
#login-box1{
    width: 620px;
    height: 450px;
    background: #f8f9fa12;
    color: #fff;
    top: 50%;
    margin-left: 10px;
    margin-top: 54px;
    box-sizing: border-box;
  font-size: 30px;
   color: wheat;
  display: none;
}
.a1 {
  border-collapse: collapse;
  width: 100%;
  color: white;
}

.a1 th{
  padding: 3px;
  text-align: left;
  border-bottom: greenyellow;
}
.a1 td {
  padding: 8px;
  text-align: left;
  border-bottom: 1px solid #ddd;
}

.a1 tr:hover {background-color:white;
color:black;}
.i1 
{
    height: 100px;
    width: 100px;
}
.table-dark td
{
    font-size: 25px;
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
			width: 25%;

		}

		.nav a:hover{
			color: #333;
			background-color: whitesmoke;
		}
                .abc 
{
    background-color: #f70334;
}
.abc {
    background-color: #f70334;
    width: 120px;
    outline: none;
    border-radius: 0px;
    color: white;
    height: 50px;
    border: none;
    border: none;
}	
         </style>
         <script src="jquery-3.3.1 (1).js">
    
  </script>
  <script type="text/javascript">
    $(document).ready(function(){
  $("#b").click(function(){
    $("#login-box1").toggle();
  
  });
});
  </script>
    </head>
    <body>
        <div class="head">
             <b>User Profile</b>
		</div>
      
     <div class="nav">
	<a href="UserHome.jsp">HOME</a>
		
	
		<a href="viewRouteServlet1">Routes Info</a>
	        
  <a href=""  data-toggle="modal" data-target="#modalRegisterForm">About Us</a>
  
  <a href="logout" class="abc">Logout</a>
</div>
        <br>
        <div class="cont">
            <table class="table table-dark table-hover">
<tr>
    <th>USer Profile</th>
    <th><B>User ID</b></th>
    <th><B>User Name</b></th>
    <th><b>E-mail</b></th>
    <th><b>Route Name</b></th>
    <th><b>Verification</b></th>
    <th><b>Show Time</b></th>
    
</tr>

<%
   List<Sign1> records =  (List<Sign1>)session.getAttribute("rel");   
   if(records!=null)
   {
       System.out.println("inn");
   for(Sign1 s: records)
   {

     
%>
<td><img class="i1" src="a4.png"></td>
<td><%= s.getUid()%></td>
<td><%= s.getName()%></td>
<td><%= s.getEmail()%></td>
<td><%= s.getRoute()%></td>
<td><%= s.getPermission()%></td>
<td><div id="b"><button class="abc"><b>SHOW</b></button></div></td>
<%
}}
%>
</table>
            
            
        </div>
    <center>
     <div id="login-box1">
         <table class="a1">
  <tr>
    <th>S.No.</th>
    <th>Stopages</th>
    <th>Time</th>
  </tr>
  <tr>
    <td>1.</td>
    <td>CH sec-19</td>
    <td>7:45 AM</td>
  </tr>
  <tr>
    <td>2.</td>
    <td>Old Panchkula</td>
    <td>8:00 AM</td>
  </tr>
  <tr>
    <td>3.</td>
    <td>HMT</td>
    <td>8:15 AM</td>
  </tr>
  <tr>
    <td>4.</td>
    <td>Pinjore</td>
    <td>8:30 AM</td>
  </tr>
   <tr>
    <td>5.</td>
    <td>Baddi</td>
    <td>8:50 AM</td>
  </tr>
</table>
</div>
    </center>
    </body>
</html>
