<%-- 
    Document   : contacto
    Created on : 29/09/2022, 04:08:13 PM
    Author     : Pc
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Cuestionario</title>
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.2.0/css/all.min.css">
        <link rel="stylesheet" type="text/css" href="estilo.css">
        <meta name="viewport" content="width=device-width, user-scalable=no,initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
        <script type="text/javascript">
           
            function mensaje() {
                alert("Registro exitoso");
            }
        </script>
    </head>
    <body>
        <h1 >Sign up</h1>
        <div class="contenedor">
            <div class="logotipo">
                <center>
                    <image class="logo" src="images/leon.png" />

                </center>
            </div>
            <form action="Control" method="post">
                <i class="fa-solid fa-user"></i>
                <input type="text" name="txt_nombres" placeholder="Names" required/>
                <br>
                <i class="fa-sharp fa-solid fa-mobile"></i>
                <input type="text" name="txt_telefono" placeholder="Number" required/>
                <br>
                <i class="fa-solid fa-envelope"></i>
                <input type="email" name="txt_email" placeholder="example@gmail.com" required/>
                <br>
                <i class="fa-solid fa-lock"></i>
                <input type="password" name="txt_contra" placeholder="Password" required/>
                <button name="accion" value="registro" onclick="mensaje();">Register</button>
            </form>
            <center>
                <a href="index.jsp">Login</a>
            </center>
            
        </div>
    </body>
</html>
