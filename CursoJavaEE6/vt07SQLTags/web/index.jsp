<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="sql" uri="http://java.sun.com/jsp/jstl/sql"%>
<%-- 
    Document   : index
    Created on : 05/03/2020, 12:40:46 PM
    Author     : francisco
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
        
        <!-- Se define un objeto de conexion -->
        <sql:setDataSource driver="com.mysql.jdbc.Driver" url="jdbc:mysql://localhost/test" user="root" password="" var="con"></sql:setDataSource>
        
        <sql:query var="resultados" dataSource="${con}">
            SELECT nombres, apellidos, nro_documento FROM personas;
        </sql:query>
            
            <table>
                <thead>
                    <tr>
                        <th>Nombres Apellidos</th>
                        <th>Nro. Documento</th>
                    </tr>
                </thead>
                <tbody>
                <c:forEach var="filas" items="${resultados.rows}">
                    <tr>
                        <td>
                            <c:out value="${filas.nombres}"></c:out>, <c:out value="${filas.apellidos}"></c:out>
                        </td>
                        <td><c:out value="${filas.nro_documento}"></c:out></td>
                    </tr>
                </c:forEach>
                </tbody>
            </table>
    </body>
</html>
