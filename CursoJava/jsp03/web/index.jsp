<%-- 
    Document   : index
    Created on : 07/01/2020, 05:15:13 PM
    Author     : francisco
    Type       : jsp
    Description: se crea el menu de navegacion. Y cada <a> en su
    propiedad "href" apunta al Servlet que le especificamos.
    Para ello se creo el Package: com.franciscocuevas.com.servlets
    y dentro de dicho package se van creando los archivos Servlets.

--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="UTF-8">
        <link rel="stylesheet" href="css/estilos.css" media="screen" />
        <title>Trabajando con Servlet</title>
    </head>
    <body>
        <h1>Trabajando con Servlet</h1>
        
        <div id="div"><p>holl</p></div>
        
        <!-- Menu de navegacion -->
        <!-- cada "href" apunta a un Servlet-->
        <ul>
            <li><a href="nosotros">Nosotros</a></li><!--lleva al archivo: nosotros.java-->
            <li><a href="mision">Mision</a></li><!--lleva al archivo mision-->
            <li><a href="contacto">Contacto</a></li><!--lleva al archivo contacto-->
        </ul>
        
        
        <!-- Formulario -->
        <form name="loginForm" method="post" action="LoginServlet">
            Username: <input type="text" name="username"/> <br/>
            Password: <input type="password" name="password"/> <br/>
            <input type="submit" value="Login" />
        </form>
        
        
        <!--
        ejercicio: generamos navegacion desde archivos utilizando
        servlets.
        tarea: crear un formulario y recibir los datos desde
        un servlet
        -->
        
    </body>
</html>
