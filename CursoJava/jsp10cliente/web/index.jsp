<%-- 
    Document   : index
    Created on : 14/01/2020, 10:41:18 AM
    Author     : francisco

    View del proyecto
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="UTF-8">
        <title>Web Service desde Java EE</title>
    </head>
    <body>
        <h1>index(cliente)Web Service desde Java EE!</h1>
        
        <%-- Usando Scriptlet mostramos el resultado del
        Web Service en esta pagina.--%>
        <p><%=request.getAttribute("mensaje") %></p>
    </body>
</html>

