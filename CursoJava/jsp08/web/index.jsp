<%-- 
    Document   : index
    Created on : 13/01/2020, 04:20:38 PM
    Author     : francisco

    taglib: uri="http://java.sun.com/jsp/jstl/core" prefix="c"
    representa una llamada al core de JSTL anhadiendole el 
    prefijo "c".
    
    taglib: uri="http://java.sun.com/jsp/jstl/sql" prefix="sql"
    se agrega para utilizar los tags de SQL de JSTL
    
--%>

<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql" %>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="UTF-8">
        <title>Conexion MySQL con JSTL</title>
    </head>
    <body>
        <h1>Conexion MySQL con JSTL</h1>
        
        
        <sql:setDataSource driver="com.mysql.jdbc.Driver" url="jdbc:mysql://localhost/test" user="root" password="" var="con" />
        
        <!--generar la consulta-->
        <sql:query dataSource="${con}" var="resultados">
            select * from personas;
        </sql:query>
        
        
        <ul>
            <c:forEach var="filas" items="${resultados.rows}">
                <li>
                    ID: <c:out value="${filas.id}" />
                    Nombre: <c:out value="${filas.nombres}" />
                </li>
            </c:forEach>
        </ul>
    </body>
</html>
