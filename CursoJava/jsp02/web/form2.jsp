<%-- 
    Document   : form2
    Created on : 07/01/2020, 03:04:44 PM
    Author     : francisco
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%
    request.setCharacterEncoding("UTF-8");
%>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="utf-8">
        <title>Recibiendo el Formulario</title>
    </head>
    <body>
        <h1>Recibiendo el Formulario</h1>
        <p>Tu IP es: <%=request.getRemoteAddr()%><p/>
        <p>Tu Nombre es: <%=request.getParameter("nom")%></p>
        <p>Tu Server es: <%=request.getServerName()%></p>
        <p>Tu email es: <%=request.getParameter("correo")%></p>
        <p>Tu pais es: <%=request.getParameter("pais")%></p>
        <p>Tu sexo es: <%=request.getParameter("sexo")%></p>
        <p>Parametro pasado por URL: <%=request.getParameter("uri")%></p>
        
        <!-- ejercicio: utilizando switch case validar el campo pais
        para que se muestre el dato completo al cual pertenece
        tambien con el campo sexo
        hacerlo por scriptlet que realice esa validacion-->
    </body>
</html>
