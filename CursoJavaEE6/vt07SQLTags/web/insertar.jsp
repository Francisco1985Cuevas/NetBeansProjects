<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="sql" uri="http://java.sun.com/jsp/jstl/sql"%>
<%-- 
    Document   : insertar
    Created on : 05/03/2020, 03:06:16 PM
    Author     : francisco
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Insertar JSTL</title>
    </head>
    <body>
        <h1>Insertar JSTL</h1>

        <!-- Se define un objeto de conexion -->
        <sql:setDataSource driver="com.mysql.jdbc.Driver" url="jdbc:mysql://localhost/test" user="root" password="" var="con"></sql:setDataSource>

        <sql:update var="InsertedRows" dataSource="${con}">
            INSERT INTO personas (nombres, apellidos, nro_documento, telefono, direccion, correo)
            VALUES ('lucia', 'vazquez', '5566', '4455', 'calle1', 'micorreo@hotmail.com')
        </sql:update>


        <sql:query var="result" dataSource="${con}">
            SELECT nombres, apellidos, nro_documento FROM personas
        </sql:query>

        <table border="1">
            <!-- column headers -->
            <tr>
                <c:forEach var="columnName" items="${result.columnNames}">
                    <th><c:out value="${columnName}"/></th>
                    </c:forEach>
            </tr>
            <!-- column data -->
            <c:forEach var="row" items="${result.rowsByIndex}">
                <tr>
                    <c:forEach var="column" items="${row}">
                        <td><c:out value="${column}"/></td>
                    </c:forEach>
                </tr>
            </c:forEach>
        </table>

    </body>
</html>
