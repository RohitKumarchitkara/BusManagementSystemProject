<%-- 
    Document   : BusDetails
    Created on : 2 Feb, 2019, 11:25:20 PM
    Author     : ROHIT
--%>

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
              background-color: red;
              color: white;
            
              
              font-size: 20px;
              width: 600px;
              position: relative;
              left: 330px;
              top: 50px;
              flex-wrap: wrap;
              border: 3px solid white;
               box-shadow: 0px 10px 20px white;
             
          }
        
         .main
         {
             background-color: black;
             height: 200px;
             display: flex;
             border: 2px solid black;
             flex-wrap: wrap;
             
         }
            .con
         {
             background-color: powderblue;
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
                background-color:lime;
                border: none;
                color:white;
                border-radius: 10px;
               height: 45px;
               width: 130px;
               font-size: 15px;
               margin-left: 230px;
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
                background-color:lime;
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
            <h1><b><center>Add Bus Details</center></b></h1>
        </div>
        </div>
         <div class="con">
               
                <div class="A">
                  <br><br>
                    <form action="bServlet1" method="post">
                        <b>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Bus ID</b> :&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input type ="text" name="bid" required><br>
                        <br>
                        
                        <b>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Driver ID</b> :&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input type ="text" name="did" required=""><br>
                        <br>
                        
                        <b>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Driver Name</b> :&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input type ="text" name="dname" required><br>
                        <br>
                        
                        <b>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Contact</b> :&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input type ="text" name="con" required><br>
                        <br>
                        
                        <b>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Departure From</b> :&nbsp;&nbsp;&nbsp;<input type ="text" name="dfrom"><br>
                        <br>
                        
                        <b>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Arival At</b> :&nbsp;&nbsp;&nbsp;<input type ="text" name="aat"><br>
                        <br>
                        
                        <b>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Arival Time</b> :&nbsp;&nbsp;&nbsp;<input type ="text" name="at"><br>
                        <br>
                        
                        <button class="btn"><b>Add Details</b></button>
                    </form>
                </div>
                         
                
                
                    
            </div>
    </body>
</html>
