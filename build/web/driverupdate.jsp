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
             background-color: black;
             border: 4px solid black;
             height: 500px;
             display: flex;
         }
         .A
         {
             height: 500px;
             border: 2px solid black;
            color: white;
            font-size: 20px;
               width: 500px;
         }
         input[type=text] {
  width: 200px;
  padding: 5px 20px;
 
  box-sizing: border-box;
  border: 2px solid black;
  outline: none;
  box-shadow: 10px 10px 10px white;
  background-color: cyan;
}
    input[type=text]:hover
    {
        box-shadow: 10px 10px 10px black;
        border: 10px solid white;
    }
     .btn
              {
                background-color:chartreuse;
                border: none;
                color:black;
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