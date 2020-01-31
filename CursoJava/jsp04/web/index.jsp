<%-- 
    Document   : index
    Created on : 08/01/2020, 10:40:31 AM
    Author     : francisco
este archivo actua como view
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="UTF-8">
        <title>Ejemplo de EJB</title>
    </head>
    <body>
        <h1>Ejemplo de EJB</h1>
        
        
        <!-- importamos o creamos los Beans -->
        <!-- asignamos valores al EJB, value="Francisco Cuevas"-->
        <jsp:useBean id="t" scope="request" class="com.franciscocuevas.jsp.modelos.testModel" />
        
        <jsp:setProperty name="t" property="nombre" value="Francisco Cuevas" />
        El nombre desde el EJB es: 
        <jsp:getProperty name="t" property="nombre" />
        
        <hr>
        <jsp:setProperty name="t" property="correo" value="fcuevas@gmail.com" />
        El correo desde el EJB es: 
        <jsp:getProperty name="t" property="correo" />
        
        <!-- ejercicio: crear un formulario y enviar datos
        todo lo que tenga que ver con calculos y procesos hacerlos
        desde el controlador, y todo lo que tenga que ver con conexiones
        a base de datos o proceso de carga de datos tiene hacerlo
        desde el modelo, acordarse de separar por paquetes los modelos
        y controladores-->
    </body>
</html>
