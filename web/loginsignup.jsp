
<html>
    <head>
        <title>TODO supply a title</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
         <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/bulma/0.7.4/css/bulma.min.css">
        <style>
            body{
                margin:0;
                color:#6a6f8c;
                background-image: url("back.jpg");
                font:600 16px/18px 'Open Sans',sans-serif;
                height:100vh;
                background-size:cover; 
                background-position: center;
                background-repeat: no-repeat;
                overflow:hidden;
            }
            *,:after,:before{box-sizing:border-box}
            .clearfix:after,.clearfix:before{content:'';display:table}
            .clearfix:after{clear:both;display:block}
            a{color:inherit;text-decoration:none}

            .login-wrap{
                width:100%;
                margin:auto;
                max-width:525px;
                min-height:670px;
                position:relative;
               
                box-shadow:0 12px 15px 0 rgba(0,0,0,.24),0 17px 50px 0 rgba(0,0,0,.19);
            }
            .login-html{
                width:100%;
                height:90%;
                position:absolute;
                padding:90px 70px 50px 70px;
                background:rgba(0, 0, 0, 0.74);
            }
            .login-html .sign-in-htm,
            .login-html .sign-up-htm{
                top:0;
                left:0;
                right:0;
                bottom:0;
                position:absolute;
                transform:rotateY(180deg);
                backface-visibility:hidden;
                transition:all .4s linear;
            }
            .login-html .sign-in,
            .login-html .sign-up,
            .login-form .group .check{
                display:none;
            }
            .login-html .tab,
            .login-form .group .label,
            .login-form .group .button{
                text-transform:uppercase;
            }
            .login-html .tab{
                font-size:22px;
                margin-right:15px;
                padding-bottom:5px;
                margin:0 15px 10px 0;
                display:inline-block;
                border-bottom:2px solid transparent;
            }
            .login-html .sign-in:checked + .tab,
            .login-html .sign-up:checked + .tab{
                color:#fff;
                border-color:#1161ee;
            }
            .login-form{
                min-height:345px;
                position:relative;
                perspective:1000px;
                transform-style:preserve-3d;
            }
            .login-form .group{
                margin-bottom:15px;
            }
            .login-form .group .label,
            .login-form .group .input,
            .login-form .group .button{
                width:100%;
                color:#fff;
                display:block;
            }
            .login-form .group .input,
            .login-form .group .button{
                border:none;
                padding:15px 20px;
                border-radius:25px;
                background:rgba(255, 255, 255, 0.28);
                outline: none;
                height: 45px;
            }
            .login-form .group input[data-type="password"]{
                text-security:circle;
                -webkit-text-security:circle;
            }
            .login-form .group .label{
                color:#aaa;
                font-size:12px;
            }
            .login-form .group .button{
                background:#1161ee;
            }
            .login-form .group label .icon{
                width:15px;
                height:15px;
                border-radius:2px;
                position:relative;
                display:inline-block;
                background:rgba(255,255,255,.1);
            }
            .login-form .group label .icon:before,
            .login-form .group label .icon:after{
                content:'';
                width:10px;
                height:2px;
                background:#fff;
                position:absolute;
                transition:all .2s ease-in-out 0s;
            }
            .login-form .group label .icon:before{
                left:3px;
                width:5px;
                bottom:6px;
                transform:scale(0) rotate(0);
            }
            .login-form .group label .icon:after{
                top:6px;
                right:0;
                transform:scale(0) rotate(0);
            }
            .login-form .group .check:checked + label{
                color:#fff;
            }
            .login-form .group .check:checked + label .icon{
                background:#1161ee;
            }
            .login-form .group .check:checked + label .icon:before{
                transform:scale(1) rotate(45deg);
            }
            .login-form .group .check:checked + label .icon:after{
                transform:scale(1) rotate(-45deg);
            }
            .login-html .sign-in:checked + .tab + .sign-up + .tab + .login-form .sign-in-htm{
                transform:rotate(0);
            }
            .login-html .sign-up:checked + .tab + .login-form .sign-up-htm{
                transform:rotate(0);
            }

            .hr{
                height:2px;
                margin:60px 0 50px 0;
                background:rgba(255,255,255,.2);
            }
            .foot-lnk{
                text-align:center;
            }
            .input
            {
                outline: none;
            }
            .select select:not([multiple]) {
    padding-right: 17.5em;
}   
.select select 
{
    border-radius: 30px;
}
        </style>
        <script>
           function myValidation1()
            {
                var flag = true;
                var uname = document.forms["myform1"]["username"];
                 var mail = document.forms["myform1"]["email"];
                var pwd= document.forms["myform1"]["password"];
                  var pwd1= document.forms["myform1"]["r_password"];
                if(uname.value==="")
                {
                    alert("Please Enter Username");
                    flag=false;
                }
                if(mail.value==="")
                {
                    alert("Please Enter E-mail");
                    flag=false;
                }
                if(pwd.value==="")
                {
                    alert("Please Enter Password"); 
                    flag=false;
                }
                  if(pwd1.value==="")
                {
                    alert("Please Enter Repeat Password"); 
                    flag=false;
                }
                
                return flag;
            }
             function myValidation()
            {
                var flag = true;
                var uname = document.forms["myform"]["username"];
                var pwd= document.forms["myform"]["password"];
                if(uname.value==="")
                {
                    alert("Please Enter Username");
                    flag=false;
                }
                if(pwd.value==="")
                {
                    alert("Please Enter Password"); 
                    flag=false;
                }
                return flag;
            }
            </script>
    </head>
    <body>

        <div class="login-wrap">
            <div class="login-html">
                <input id="tab-1" type="radio" name="tab" class="sign-in" checked><label for="tab-1" class="tab"><font color="white">Sign In</font></label>
                <input id="tab-2" type="radio" name="tab" class="sign-up"><label for="tab-2" class="tab"><font color="white">Sign Up</font></label>
                <div class="login-form">
                    <form name="myform" action="logservlet1" method="post" onsubmit="return myValidation()">
                        <div class="sign-in-htm">
                            <div class="group">
                                <label for="user" class="label"><font color="white">Username</font></label>
                                <input name="username" id="user" type="text" class="input">
                            </div>
                            <div class="group">
                               <label for="pass" class="label"><font color="white">Password</label></font>
                                <input name="password" id="pass" type="password" class="input" data-type="password">
                            </div>
<!--                            <div class="group">
                                <input id="check" type="checkbox" class="check" checked>
                                <label for="check"><span class="icon"></span><font color="white"> Keep me Signed in</font></label>
                            </div>-->
                            <div class="group">
                                <input type="submit" class="button" value="Sign In">
                            </div>
                            <div class="hr"></div>
                         
                        </div>
                    </form>
                    <form name="myform1" action="signServlet1" method="post" onsubmit="return myValidation1()">
                        <div class="sign-up-htm">
                            <div class="group">
                                <label for="user" class="label"><font color="white">Username</font></label>
                                <input name="username" id="user" type="text" class="input">
                            </div>
                            <div class="group">
                                <label for="pass" class="label"><font color="white">User ID</font></label>
                                <input name="uid" id="pass" type="text" class="input">
                            </div>
                            <div class="group">
                                <label for="pass" class="label"><font color="white">Password</font></label>
                                <input name="password" id="pass" type="password" class="input" data-type="password">
                            </div>
                            <div class="group">
                                <label for="pass" class="label"><font color="white">Email Address</font></label>
                                <input name="email" id="pass" type="text" class="input">
                            </div>
                            
                            <div class="control">
                               <div class="select">
                                   <select id="rt" name="rt">
                                     <option>PickUp-Point</option>
                                     <option>CHANDIGARH</option>
                                     <option>MOHALI</option>
                                     <option>PANCHKULA</option>
                                     <option>PARWANOO</option>
                                     <option>PINJORE</option>
                                     <option>RAJPURA</option>
                                     
                                  </select>
                              </div>
                            </div>
                            <br><br>
                              <div class="group">
                                <input type="submit" class="button" value="Sign In">
                            </div>
                            <div class="hr"></div>
                           
                        </div>
                    </form>
                </div>
            </div>
        </div>
    </body>
</html>
