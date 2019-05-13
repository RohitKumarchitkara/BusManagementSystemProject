 <%-- 
    Document   : UserHome
    Created on : 26 Mar, 2019, 2:55:03 PM
    Author     : ROHIT
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>

<html>
<head>
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/bulma/0.7.4/css/bulma.min.css">
<style>
body 
{      
   background-image: url("uc.jpg");
   height:110vh;
	           
    background-size:cover; 
    background-position: center;       
    margin: 0;
    padding: 0;
 }
.c {
display: flex;
justify-content: center;
align-items: center;
flex-wrap: wrap;
}
.a {
width:300px;
height:300px;
background: green;
}
.b {
width:300px;
height:300px;
background: blue;
padding-left: 20px;
}
.login-box{
    width: 320px;
    height: 500px;
    background: rgba(0, 0, 0, 0.5);
    color: wheat;
    top: 50%;
    margin-top: 54px;
    box-sizing: border-box;
    font-size: 20px;
     
}
#login-box1{
    width: 320px;
    height: 500px;
    background: rgba(0, 0, 0, 0.7);
    color: #fff;
    top: 50%;
    margin-left: 10px;
    margin-top: 54px;
    box-sizing: border-box;
  font-size: 30px;
   color: wheat;
  display: none;
}
.main 
{
	display: flex;
justify-content: center;
align-items: center;
}
.head 
{
	display: flex;
	justify-content: center;
	align-items: center;
	background-color:#0abde3;
	color:white;
	font-size: 45px;
	height: 100px;
	padding: 5px;
}
.nav{
			display: flex;
			background-color: #333;
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

		.nav a:hover{
			color: #333;
			background-color: #fff200;
		}
		.img1
		{
                 background-image: url("l3.jpg");
	             height:100vh;
	             background-repeat: no-repeat;
                background-size:cover; 
                background-position: center;
		}
                #btn
            {
                background-color:#0abde3;
                border: none;
                color:white;
                border-radius: 30px;
                padding:8px 16px;
                cursor:pointer;
                font-size: 20px;
                outline: none;
         
          }
          
          a 
          {
              text-decoration: none;
              
          }
           .bt1
            {
                background-color:#ff4757;
                border: none;
                color:white;
                border-radius: 30px;
               height: 45px;
               width: 250px;
               font-size: 25px;
            
              cursor: pointer;
              text-align: center;
              outline: none;
            }
         
            input[type=text]
            {
                border-radius: 20px;
                height: 20px;
                outline: none;
                padding: 11px;
                font-size: 15pt;
                width: 220px;
                font-family: "Times New Roman";
            }
            a 
            {
                width: 150px;
            }
                   .nav{
			display: flex;
			background-color: #333;
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

		.nav a:hover{
			color: #333;
			background-color: whitesmoke;
		}
                .abc 
{
    background-color: #f70334;
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
    <script type="text/javascript">
          function myValidation()
            {
                var flag = true;
                var rname = document.forms["myform"]["rname"];
                var rcode= document.forms["myform"]["rcode"];
                if(rname.value==="")
                {
                    alert("Please Enter Route Name");
                    flag=false;
                }
                if(rcode.value==="")
                {
                    alert("Please Enter Route Code"); 
                    flag=false;
                }
                return flag;
            }
      </script>
</head>
<body>
	
	
	
                <div class="head">
                    <b>Bus Management System</b>
                   
		</div>
		
   <div class="nav">
	<a href="front1.html">HOME</a>
		<a href="userProfile.jsp">Profile</a>
	
		<a href="viewRouteServlet1">Routes Info</a>
	        
  <a href=""  data-toggle="modal" data-target="#modalRegisterForm">About Us</a>
  
  <a href="logout" class="abc">Logout</a>
</div>
<div class="c">
   
    <div class="login-box">
        <center><img src="a1.png" height="100px" width="100px"></center><br>
                    <form action="searchServlet" name="myform" method="post" onsubmit="return myValidation()">
                        
                        <center><b>Route Name</b> <br><input type ="text" name="rname"></center><br>
                        
                      
                        <center><b>Route Code</b> :<br><input type ="text" name="rcode"></center><br>
                
                      
                       
             
                        <center><button id="btn"><b>Search</b></button></center>
                    </form>
         <center> <div id="b"><a class="button is-danger">More</a></div></center>
</div>
<div id="login-box1">
   <%
       String sid = (String) session.getAttribute("name");
       System.out.println(sid);
   %>
    <center>
        <img src="a1.png" height="100px" width="100px"><br><br><b>User</b>
        <br><br>
        <a href="viewProfile?rd=<%= sid %>"> <button class="bt1"><b>Profile</b></button></a><br><br>
    <a href="viewRouteServlet1"> <button class="bt1"><b>Routes Information</b></button></a><br><br>
                    
                    
    </center>
</div>

</body>
</html>

