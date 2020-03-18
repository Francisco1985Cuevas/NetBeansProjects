<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="sql" uri="http://java.sun.com/jsp/jstl/sql"%>
<%-- 
    Document   : index
    Created on : 05/03/2020, 12:09:36 PM
    Author     : francisco
    Nota       : Es un proyecto que al ejecutar salta error
    de que no reconoce a la tabla solicitada, NO FUNCIONA
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>

        <sql:query var="allRows" dataSource="jdbc/test">
            SELECT nombres, apellidos, nro_documento FROM personas
        </sql:query>

        <table>
            <thead>
                <tr>
                    <th>Nombres Apellidos</th>
                    <th>Nro. Documento</th>
                </tr>
            </thead>
            <tbody>
                <c:forEach var="currentRow" items="${allRows.rows}">
                    <tr>
                        <td>${currentRow.nombres}, ${currentRow.apellidos}</td>
                        <td>${currentRow.nro_documento}</td>
                    </tr>
                </c:forEach>  
            </tbody>
        </table>

    </body>
</html>
