<%-- 
    Document   : index
    Created on : 07/01/2020, 05:15:13 PM
    Author     : francisco
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="UTF-8">
        <title>Trabajando con Servlet</title>
    </head>
    <body>
        <h1>Trabajando con Servlet</h1>
        <!--
        ejercicio: generamos navegacion desde archivos utilizando
        servlets.
        tarea: crear un formulario y recibir los datos desde
        un servlet
        -->
        <ul>
            <li><a href="nosotros">Nosotros</a></li><!--lleva al archivo nosotros-->
            <li><a href="mision">Mision</a></li><!--lleva al archivo mision-->
            <li><a href="contacto">Contacto</a></li><!--lleva al archivo contacto-->
        </ul>
        
        <form name="loginForm" method="post" action="LoginServlet">
            Username: <input type="text" name="username"/> <br/>
            Password: <input type="password" name="password"/> <br/>
            <input type="submit" value="Login" />
        </form>
        
    </body>
</html>
