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
        <link href="style.css" rel="stylesheet" type="text/css">
    </head>
    <body>
        <h1>Hello mundo cruel</h1>
        <a href="Control"> Verificar Servlet objeto response</a>
        <form action="Control" method="get">
            <label>
                Nombres:
            </label>
            <input type="text" name="txt_nombres" required/>
            <label>
                Apelidos:
            </label>
            <input type="text" name="txt_apellidos" required/>
            <input type="submit" name="btn_registrar" value="Registrar"/>
        </form>
    </body>
</html>
