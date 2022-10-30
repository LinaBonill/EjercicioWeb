<%-- 
    Document   : index
    Created on : 22/09/2022, 10:42:46 AM
    Author     : Lina Bonill
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Ejercicio Web</title>
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.2.0/css/all.min.css">
        <link rel="stylesheet" type="text/css" href="estilo.css">
        <meta name="viewport" content="width=device-width, user-scalable=no,initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    </head>
    <body>
        
          
       <h1>Login</h1>
        
        <div class="contenedor">
            <div class="logotipo">
                <center>
                    
                    <image class="logo" src="images/leon.png" />
                    
                    <br>
                     <a>${registro}</a>
                </center>
               
            </div>
            <form action="Control" method="post">
                <i class="fa-solid fa-user"></i>
                <input type="text" name="txt_usuario" placeholder="Names" required/>
                <br>
                <i class="fa-solid fa-lock"></i>
                <input type="password" name="txt_password" placeholder="Password" required/>
                <button name="accion" value="login">Login</button>
            </form>
                <center>
            <a href="contacto.jsp">Sign up</a>
            <br>

            <a class="olvido" href="#">Forgot password</a>
            </center>
        </div> 
       
        





    </body>
</html>
