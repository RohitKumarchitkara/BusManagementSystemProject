<%-- 
    Document   : driverdetails
    Created on : 2 Feb, 2019, 12:31:50 AM
    Author     : ROHIT
--%>
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
              box-shadow: 10xpx 10px 10px black;         }
         .main
         {
             background-color: lightcyan;
             height: 200px;
             display: flex;
             border: 2px solid black;
             flex-wrap: wrap;
             
         }
         .con
         {
             background-image: url("l1_1.jpg");
             border: 4px solid black;
             height: 600px;
             display: flex;
             width: 100%;
         }
         .A
         {
             height: 500px;
             border: none;
            color: white;
            font-size: 20px;
               width: 500px;
               border: 2px solid white;
               background-color: rgba(255, 255, 255, 0.13);
               margin-top: 20px;
         }
  input[type=text]
            {
                border-radius: 20px;
                height: 20px;
                outline: none;
                padding: 10px;
                font-size: 15pt;
                width: 170px;
            }
    
     .btn
              {
                background-color:dodgerblue;
                border: none;
                color:white;
                border-radius: 10px;
               height: 45px;
               width: 130px;
               font-size: 15px;
               margin-left: 200px;
              cursor: pointer;
            
             
            }
            .btn:hover
            {
                box-shadow: 10px 10px 20px white;
            }
            .B
            {
               border: 2px solid black;
               height: 500px;
               width: 500px;
               margin-left: 0px;
            }
            .bt1
            {
                background-color:dodgerblue;
                border: none;
                color:white;
                border-radius: 10px;
               height: 45px;
               width: 250px;
               font-size: 25px;
               margin-left: 100px;
              cursor: pointer;
              text-align: center;
            }
            .bt1:hover
            {
                box-shadow: 10px 10px 20px black;
            }
             .rotating-box
            {
                width: 400px;
                height: 300px;
                margin: -70px auto;
               perspective: 800px;
            }
            .single-rb
            {
                width: 400px;
                animation: rotate 15s linear infinite;
                transform-style: preserve-3d;
                margin-top: 120px;
                
            }
            .single-rb img
            {
                height: 300px;
                width: 400px;
            }
            .single-rb div
            {
                position: absolute;
                width: 400px;
                height: 300px;
            }
            .front-side
            {
                transform: translateZ(200px);
            }
            .back-side
            {
                transform: rotateY(180deg) translateZ(200px);
            }
            
            .left-side
            {
                transform: rotateY(-90deg)
                translateX(-200px);
                transform-origin: left;
            }
             .right-side
            {
                transform: rotateY(90deg)
                translateX(200px);
                transform-origin: right;
            }
             .top-side
            {
                transform: rotateY(-90deg)
                translateY(-200px);
                transform-origin: top;
            }
             .bottom-side
            {
                transform: rotateY(90deg)
                translateY(200px);
                transform-origin: bottom;
            }
            @keyframes rotate
            {
                0%{transform:rotateY(0);}
                100%{transform:rotateY(360deg);}
            }
           .head 
{
	display: flex;
	justify-content: center;
	align-items: center;
	background-color:#0abde3;
	color:white;
	font-size: 45px;
	height: 90px;
	padding: 5px;
        width: 100%;
}

.ab 
{
    background-color: #f53a02;
    pointer:cursor;
    color: white;
    position: absolute;
    left:10px;
     border-radius: 10px;
     outline: none;
     border: none;
    height: 40px;
    width: 100px;
    top: 65px;
    
}
        </style>
        <script>
            function myValidation()
            {
                var flag=true;
                var id=document.forms["myform"]["dID"];
                var name=document.forms["myform"]["dname"];
                var sal=document.forms["myform"]["dsalary"];
                var age=document.forms["myform"]["dage"];
                var ln=document.forms["myform"]["dln"];
                if(id.value==="")
                {
                     alert("Please Enter Driver Id");
                      
                    flag=false;
          
                }
                if(name.value==="")
                {
                     alert("Please Enter Driver Name");
                    
                    flag=false;
                }
                if(sal.value==="")
                {
                     alert("Please Enter Driver Salary");
                    
                    flag=false;
                }
                if(age.value==="")
                {
                     alert("Please Enter Driver Age");
                     
                    flag=false;
                }
                if(ln.value==="")
                {
                     alert("Please Enter Driver License number");
                  
                    flag=false;
                }
                return flag;
            }
        </script>
        
    </head>
    <body>
        <div class="head">
            <b>Add Driver Details</b><br><br>
             <a href="driverdetail2.html"><button class="ab"><b>Back</b></button>
             </a>
		</div>
        
            <div class="con">
                
                <div class="A">
                  <br><br>
                  <form name="myform" action="driverServlet" method="post" onsubmit="return myValidation()">
                        <b>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Driver ID</b> :&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input type ="text" name="dID"><br>
                        <br>
                        <br>
                        <b>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Driver Name</b> :&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input type ="text" name="dname"><br>
                        <br>
                        <br>
                        <b>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Driver Salary</b> :&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input type ="text" name="dsalary"><br>
                        <br>
                        <br>
                        <b>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Driver Age</b> :&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input type ="text" name="dage"><br>
                        <br>
                        <br>
                        <b>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Driver Licence No.</b> :&nbsp;&nbsp;&nbsp;<input type ="text" name="dln"><br>
                        <br>
                        <br>
                        <button class="btn"><b>Add Details</b></button>
                    </form>
                </div>
               
         <div class="rotating-box">
            <div class="single-rb">
                <div class="front-side">
                    <img src="ak.jpg">
                </div>
                <div class="back-side">
                    <img src="ak.jpg">
                </div>
                <div class="left-side">
                    <img src="r1.jpg">
                </div>
                <div class="right-side">
                    <img src="r2.jpg">
                </div>
                                <div class="top-side"></div>
                                    <div class="bottom-side"></div>
                              
            </div>
        </div>
                     
            </div>
      
    </body>
</html>









<%--
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
         .con
         {
             background-color: white;
             border: 4px solid black;
             height: 500px;
             display: flex;
         }
         .A
         {
             height: 500px;
             border: 2px solid black;
               margin-left: 350px;
               width: 500px;
         }
         input[type=text] {
  width: 200px;
  padding: 5px 20px;
 
  box-sizing: border-box;
  border: 2px solid black;
  outline: none;
}
    input[type=text]:hover
    {
        box-shadow: 10px 10px 10px black;
        border: 10px solid dodgerblue;
    }
     .btn
              {
                background-color:dodgerblue;
                border: none;
                color:white;
                border-radius: 10px;
               height: 45px;
               width: 130px;
               font-size: 15px;
               margin-left: 200px;
              cursor: pointer;
            
             
            }
            .btn:hover
            {
                box-shadow: 10px 10px 20px black;
            }
            .B
            {
               border: 2px solid black;
               height: 500px;
               width: 500px;
               margin-left: 0px;
            }
            .bt1
            {
                background-color:dodgerblue;
                border: none;
                color:white;
                border-radius: 10px;
               height: 45px;
               width: 250px;
               font-size: 25px;
               margin-left: 100px;
              cursor: pointer;
              text-align: center;
            }
            .bt1:hover
            {
                box-shadow: 10px 10px 20px black;
            }
        </style>
    </head>
    <body>
        <div class="main">
        <div class="header">
            <h1><b><center>Add Driver Record</center></b></h1>
        </div>
        </div>
            <div class="con">
               
                <div class="A">
                  <br><br>
                    <form action="driverServlet" method="post">
                        <b>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Driver ID</b> :&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input type ="text" name="dID" required><br>
                        <br>
                        <br>
                        <b>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Driver Name</b> :&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input type ="text" name="dname" required=""><br>
                        <br>
                        <br>
                        <b>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Driver Salary</b> :&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input type ="text" name="dsalary" required><br>
                        <br>
                        <br>
                        <b>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Driver Age</b> :&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input type ="text" name="dage" required><br>
                        <br>
                        <br>
                        <b>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Driver Licence No.</b> :&nbsp;&nbsp;&nbsp;<input type ="text" name="dln"><br>
                        <br>
                        <br>
                        <button class="btn"><b>Add Details</b></button>
                    </form>
                </div>
           
<!--                <div class="B">
                    <br><br><br>
                    <button class="bt1"><b>New Record</b></button><br><br><br>
                    <button class="bt1"><b>Update Record</b></button><br><br><br>
                    <button class="bt1"><b>View Record</b></button><br><br><br>
                    <button class="bt1"><b>Delete Record</b></button><br><br><br>
                    <button class="bt1"><b>Add Record</b></button><br><br><br>
                </div>-->
                
                 
                    
            </div>
      
    </body>
</html>
--%>