<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="UTF-8">
        <title>Ejemplo de Hibernate</title>
    </head>
    <body>
        <h1>Ejemplo de Hibernate!</h1>
        <p>hay: <c:out value="${datos.size()}"/> </p>
        <ul>
            <c:forEach var="dato" items="${datos.rows}">
                <li>
                    ID: <c:out value="${dato.id}" />
                    Nombre: <c:out value="${dato.nombres}" />
                </li>
            </c:forEach>
        </ul>
    </body>
</html>
