<%-- 
    Document   : index
    Created on : 12/02/2020, 03:22:27 PM
    Author     : francisco
--%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql" %>

<%@page contentType="text/html" pageEncoding="UTF-8"%>



<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Pagina de inicio de IFPWAFCAD</title>
        <link rel="stylesheet" type="text/css" href="style.css" />
    </head>
    <body>
        
        <sql:query var="subjects" dataSource="jdbc/vt35">
            SELECT * FROM subject
        </sql:query>
            <table border="1">
                <tr>
                    <c:forEach var="columnName" items="${subjects.columnNames}">
                        <th><c:out value="${columnName}"></c:out></th>
                    </c:forEach>
                </tr>
                <c:forEach var="row" items="${subjects.rowsByIndex}">
                    <tr>
                        <c:forEach var="column" items="${row}">
                            <td> <c:out value="${column}"></c:out> </td>
                        </c:forEach>
                    </tr>
                </c:forEach>
            </table>
        
        
        
        <h1>Bienvenido a la pagina oficial de IFPWAFCAD, la International Former Professional Wrestlers' Association for Counseling and Development!</h1>

        <table border='0'>
            <thead>
                <tr>
                    <th>IFPWAFCAD ofrece asesoramiento experto en un amplio rango de campos.</th>
                </tr>
            </thead>
            <tbody>
                <tr>
                    <td>Para ver los detalles de contacto de un formador profesional certificado de wrestler en su area, seleccion un tema en la lista de abajo:</td>
                </tr>
                <tr>
                    <td>
                        <form action="response.jsp" method="get">
                            <strong>Seleccione un tema:</strong>
                            <select name="subject_id">
                                <c:forEach var="row" items="${subjects.rows}">
                                    <option value="${row.subject_id}">${row.name}</option>
                                </c:forEach>
                            </select>

                            <input type="submit" value="Enviar" name="submit" />
                        </form>
                    </td>
                </tr>
            </tbody>
        </table>

    </body>
</html>
