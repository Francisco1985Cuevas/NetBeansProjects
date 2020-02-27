<%-- 
    Document   : index
    Created on : 07/01/2020, 11:55:24 AM
    Author     : francisco
    
    Type       : jsp
    Description: la codificacion en este archivo es distinta
    a un archivo HTML, porque este archivo tiene varios 
    elementos, varios trozos de codigo que van dandole 
    indicaciones al Servidor.
    
    ¿Como se llaman estos trozos de codigo?
    - Su nombre tecnico es: Scriptlets

    Scriptlet: Es el código que se embebe dentro del HTML 
    utilizando Java.

    En programación o desarrollo de páginas web, embeber 
    significa insertar (incrustar) código de un lenguaje 
    dentro de otro lenguaje. 
    
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>

<%! 
    //Scriptlet usado para hacer declaraciones...
    String datos;
    //datos = "Hola mundo desde mi scriptles";
%>

<%
    //Scriptlet simple, no tiene ningun simbolo delante
    //de la apertura...
    //Scriptlet usado para hacer asignacion a variables...
    //por ejemplo a las variables que declaramos en el scriptlet
    //de arriba aqui les asignamos valores
    datos = "Hola mundo desde mi scriptles";
%>

<!DOCTYPE html>
<html>
    <head>
        <meta charset="UTF-8">
        <title>Primer Ejemplo de JSP</title>
    </head>
    <body>
        <h1>Hola Mundo desde JSP!</h1>
        <p><%=datos%></p>
        <br>
        <p>Prueba con Acéntos, Ñandú, ñandú</p>
        
        <br />
        <br />
        <%
            java.util.Date date = new java.util.Date();
            
            //Este Scriptlet genera salida HTML
            out.println("Fecha: "+String.valueOf(date));
        %>
    </body>
</html>
