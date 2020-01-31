<!--esta vista se cargo mediante el servlet o controlador 
controlers.index.java-->

<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="UTF-8">
        <title>..:: Hola desde Java EE MVC ::..</title>
    </head>
    <body>
        <h1>Hola desde Java EE MVC!</h1>
        <ul>
            <li>Scriptled: <%=request.getAttribute("texto") %></li>
            <li>Expresion languaje: ${texto}</li>
            <li>JSTL: <c:out value="${texto}" /> </li>
        </ul>
    </body>
</html>
