<%-- 
    Document   : adminLandPage
    Created on : 28 Jan, 2019, 10:35:23 PM
    Author     : ROHIT
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Admin Land Page</title>
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
       @media(max-width:800px)
                {
                    .main
                    {
                        flex-direction: column;
                    }
                }
             .container
             {
                 height: 400px;
                 background-color: gray;
                 
             }
             .cont1
             {
                 height: 350px;
               
                 background-color: white;
               display: flex;
               border: 2px solid black;
                
             }
             .A
             {
                 width: 300px;
                 background-color: black;
                 margin-left: 100px;
                 margin-top: 20px;
                 height: 330px;
               box-shadow: 20px 20px 20px black;
             }
              .B
             {
                 width: 300px;
                 background-color: black;
                 margin-left: 50px;
                 margin-top: 20px;
                 height: 330px;
                  box-shadow: 20px 20px 20px black;
             }
              .C
             {
                 width: 300px;
                 background-color: black;
                  box-shadow: 20px 20px 20px black;
                 margin-left: 50px;
                 margin-top: 20px;
                 height: 330px;
                 
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
               margin-top: 10px;
              cursor: pointer;
            }
            .btn:hover
            {
                box-shadow: 10px 0px 20px white;
            }
        </style>
    </head>
    <body>
        <div class="main">
        <div class="header">
            <h1><b><center>Admin Portal</center></b></h1>
        </div>
    </div>
        <div class="container">
            <div class="cont1">
            <div class="A">
                <a href="driverdetails.jsp"><img src="bd1.jpg" height="250px" width="300px"></a>
                <center><a href="driverdetails.jsp"><button class="btn"><b>Driver Record</b></button></a></center>
            </div>
            <div class="B">
                <img src="d2.jpg" height="250px" width="300px">
                <a href="BusDetails.jsp"><center><button class="btn"><b>Bus Details</b></button></center></a>
            </div>
            <div class="C">
                <img src="bi.jpg" height="250px" width="300px">
                <center><button class="btn"><b>Income Details</b></button></center>
            </div>
            </div>
        </div>
    </body>
</html>
