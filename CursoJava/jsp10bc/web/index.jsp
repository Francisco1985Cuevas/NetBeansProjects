<%-- 
    Document   : index
    Created on : 25/02/2020, 01:16:40 PM
    Author     : francisco
    Description: Probar/Testear el Web Service
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Web Service Cliente</title>
    </head>
    <body>
        <h1>Pagina Principal Web Service Cliente</h1>
        
        <h3>Prueba de datos con Web Service</h3>
        <hr>
        
        <p> <%=request.getAttribute("variable_nombre") %> </p>
        <br>
        <p>
            La suma es: <%=request.getAttribute("variable_suma") %>
        </p>
        <br>
        <p>
            La resta es: <%=request.getAttribute("variable_resta") %>
        </p>
        <br>
        <p>
            El producto es: <%=request.getAttribute("variable_producto") %>
        </p>
        <br>
        <p>
            La division es: <%=request.getAttribute("variable_division") %>
        </p>
    </body>
</html>
