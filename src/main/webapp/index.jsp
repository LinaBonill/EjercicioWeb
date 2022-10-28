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
        <link rel="stylesheet" type="text/css" href="style.css">
    </head>
    <body>
        <h1>Login</h1>

        <div class="contenedor">
            <div class="logotipo">
                <center>
                    <image src="images/leon.png" width="15%"/>
                </center>
            </div>
            <form action="" method="post">
                <i class="fa-solid fa-user"></i>
                <input type="text" name="txt_nombres" placeholder="Names" required/>
                <br>
                <i class="fa-solid fa-lock"></i>
                <input type="password" name="txt_contraseña" placeholder="Password" required/>
                <button>Login</button>
            </form>
            <a href="contacto.jsp">Sign up</a>
            
            <a class="olvido" href="#">Forgot pasword</a>
        </div> 





    </body>
</html>
