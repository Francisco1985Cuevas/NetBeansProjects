<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="UTF-8">
        <title>Usuarios</title>
    </head>
    <body>
        <h1>Usuarios</h1>
        
        <p><a href="<%=request.getContextPath() %>/agregar">Agregar</a></p>
        <table>
            <thead>
                <th>id</th>
                <th>Username</th>
                <th>email</th>
                <th>Acciones</th>
            </thead>
            <tbody>
                <c:forEach items="${datos}" var="dato">
                    <tr>
                        <td>
                            <c:out value="${dato.getId()}"></c:out>
                        </td>
                        <td>
                            <c:out value="${dato.getUsername()}"></c:out>
                        </td>
                        <td>
                            <c:out value="${dato.getEmail()}"></c:out>
                        </td>
                        <td>
                            <a href="<%=request.getContextPath() %>/editar?id=<c:out value="${dato.getId()}"></c:out>">Editar</a> - <a href="<%=request.getContextPath() %>/eliminar?id=<c:out value="${dato.getId()}"></c:out>">Eliminar</a>
                        </td>
                    </tr>
                </c:forEach>
            </tbody>
        </table>
    </body>
</html>
