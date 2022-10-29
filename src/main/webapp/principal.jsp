<%-- 
    Document   : principal
    Created on : 27/10/2022, 08:23:13 PM
    Author     : Pc
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Homepage</title>
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.2.0/css/all.min.css">
        <link rel="stylesheet" type="text/css" href="style.css">
    </head>
    <body>
        <header>
            <div class="logotipo">
                <p class="plataforma"><image src="images/leon.png" width="30px" height="30px"/>Plataforma</p>    
            </div>
            <nav>
                <ul class="menu_horizontal">
                    <li>
                        <a href="#">Cuenta</a>
                        <ul class="menu_vertical">
                            <a href="#">${usuario}</a>
                            <a href="index.jsp">Sing off</a>
                        </ul>
                    </li>
                </ul>
            </nav>
        </header>
        <p>Bienvenid@ ${usuario}</p>
        <p>Estos son tus datos</p>
        <p>Nombres:${usuario} </p>
        <p>Telefono:${telefono} </p>
        <p>Correo:${correo} </p>
        <p>Clave:${contra} </p>

    </body>
</html>
