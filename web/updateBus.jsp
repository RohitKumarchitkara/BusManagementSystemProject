
<html>
<head>
  <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/bulma/0.7.4/css/bulma.min.css">
<style>
body 
{      
   background-image: url("bul.jpg");
   height:140vh;
	           
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
    width: 520px;
    height: 470px;
    background: rgba(0, 0, 0, 0.7);
    color: wheat;
    top: 50%;
    margin-top: 54px;
    box-sizing: border-box;
    font-size: 30px;
  
}
#login-box1{
    width: 320px;
    height: 470px;
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
	background-color:#2c3e50;
	color:white;
	font-size: 45px;
	height: 100px;
	padding: 5px;
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
                background-color:black;
                border: 2px solid greenyellow;
                color:white;
                border-radius: 30px;
                padding:12px 28px;
                cursor:pointer;
                font-size: 20px;
                width: 200px;
                outline: none;
             
          }
          #btn:hover 
          {
           
              
               transform: translate(0px,-5px);
                transition-duration: 1s;
         
          }
          a 
          {
              text-decoration: none;
              
          }
           .bt1
            {
                background-color:black;
                border: 2px solid greenyellow;
                color:white;
                border-radius: 30px;
               height: 45px;
               width: 250px;
               font-size: 25px;
            
              cursor: pointer;
              text-align: center;
              outline: none;
            }
            .bt1:hover
            {
             
                 transform: translate(0px,-5px);
                transition-duration: 1s;
            }
            input[type=text]
            {
                border-radius: 10px;
                height: 20px;
                outline: none;
                padding: 15px;
                width: 200px;
                left: 20px;
            }
                #btn3
            {
                background-color:black;
                border: 2px solid greenyellow;
                color:white;
                border-radius: 30px;
                padding:12px 28px;
                cursor:pointer;
                font-size: 20px;
                width: 200px;
             outline: none;
          }
          #btn3:hover 
          {
           
              
               transform: translate(0px,-5px);
                transition-duration: 1s;
         
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
.select select{
    border-radius: 20px;
    left: 50px;
}
.select select:not([multiple]) {
    padding-right: 4.8em;
}
input:focus { 
    outline: none !important;
    border-color: red;
   
}
</style>
</head>
<body>
	
	
		<div class="head">
             <b>Update Bus Details Here</b>
		</div>
    <div class="nav">
	<a href="busdetails2.html">HOME</a>
		<a href="driverdetail2.html">Driver</a>
		<a href="busdetails2.html">Bus</a>
		<a href="routehome1.html">Routes</a>
	        
  
  <a href="newregistration.jsp">New Registration</a>
  <a href="logout" class="abc">Logout</a>
</div>
	
<div class="c">
    <div class="login-box"><br>
        
                    <form action="updateBusServlet" method="post">
                        &nbsp;&nbsp; &nbsp;&nbsp; <b>Old Values &nbsp;&nbsp; &nbsp;&nbsp; &nbsp;&nbsp; &nbsp;&nbsp;&nbsp;&nbsp;New Values</b><br> 
                        &nbsp;&nbsp;<input name="id" type="text" height="100px" width="100px" border-radius="2px" placeholder="Bus ID" required>    &nbsp;&nbsp; &nbsp;&nbsp; &nbsp; <input name="id1" type="text" height="100px" width="100px" border-radius="2px" placeholder="Bus ID">  <br>          
                        &nbsp;&nbsp;<input name="dname" type="text" height="100px" width="100px" border-radius="2px" placeholder="Driver Name" required>    &nbsp;&nbsp; &nbsp;&nbsp; &nbsp; <input name="dname1" type="text" height="100px" width="100px" border-radius="2px" placeholder="Driver Name">  <br>          
                        &nbsp;&nbsp;<input name="contact" type="text" height="100px" width="100px" border-radius="2px" placeholder="Driver Contact" required>    &nbsp;&nbsp; &nbsp;&nbsp; &nbsp; <input name="contact1" type="text" height="100px" width="100px" border-radius="2px" placeholder="Driver Contact">  <br>          
                        &nbsp;&nbsp;<input name="dfrom" type="text" height="100px" width="100px" border-radius="2px" placeholder="Departure From" required>    &nbsp;&nbsp; &nbsp;&nbsp; &nbsp; <input name="dfrom1" type="text" height="100px" width="100px" border-radius="2px" placeholder="Departure From">  <br>          
                         &nbsp;&nbsp;<input name="aat" type="text" height="100px" width="100px" border-radius="2px" placeholder="Arival At" required>    &nbsp;&nbsp; &nbsp;&nbsp; &nbsp; <input name="aat1" type="text" height="100px" width="100px" border-radius="2px" placeholder="Arival at">  <br>          
                        
                      
                       
                        <br>
                        <center><button id="btn"><b>&nbsp;&nbsp;Update</b></button></center>
                        </form>
                        
                        
                    
</div>

</div>
</body>
</html>
