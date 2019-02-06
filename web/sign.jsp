<%-- 
    Document   : signup
    Created on : 17 Jan, 2019, 11:10:48 AM
    Author     : ROHIT
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <form action="servlet6" method="post">
        <b> <center><h2>SIGNUP</h2><br></center></b>
    <center>
        <b>
            <h4>
                Name&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;     :&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input type="text" name="name" placeholder="Enter your Name" required=""><br><br>
                Password :&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input type="password" name="pwd" placeholder="Enter Password" required=""><br><br>
                Email     :&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input type="email" name="email" placeholder="EMAIL" required=""><br><br>
                Address  :&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input type="text" placeholder="Address" required="" name="add"><br><br>
                Phone    :&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; <input type="number" placeholder="Phone Number" name="num"><br><br>
            <button>SUBMIT</button>
            </h4>
        </b>
    </center>
        </form>
    </body>
</html>
