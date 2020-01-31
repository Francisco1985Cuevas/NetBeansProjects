<%-- 
    Document   : index
    Created on : 07/01/2020, 11:55:24 AM
    Author     : francisco
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>

<%! 
String datos;
//datos = "Hola mundo desde mi scriptles";
%>

<%
    datos = "Hola mundo desde mi scriptles";
%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Primer ejemplo de JSP</title>
    </head>
    <body>
        <h1>Hola Mundo! desde JSP</h1>
        <p><%=datos%></p>
    </body>
</html>
