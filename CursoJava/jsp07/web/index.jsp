<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%@page contentType="text/html" pageEncoding="UTF-8"%>

<%--
    String dato;
--%>

<!DOCTYPE html>
<html>
    <head>
        <meta charset="UTF-8">
        <title>JSTL</title>
    </head>
    <body>
        <h1>JSTL</h1>
        <!--tags JSTL-->
        <c:out value="Hola mundo desde JSTL"></c:out>
        
        <hr>
        <!--scriptles-->
        <%="Hola desde un scriptlet"%>
        <%--
            dato="1";
        --%>
        
        
        <!--tags JSTL-->
        <c:set var="dato" value="1" />
        <c:if test="${dato=='1'}" var="d">
            <hr />
            <p>texto dentro de la aplicación</p>
        </c:if>
        
        
        <c:set var="dato2" value="5" />    
        <c:choose>
            <c:when test="${dato2=='-1'}">
                <p>el valor seteado es menos uno cero</p>
            </c:when>
            <c:when test="${dato2=='0'}">
                <p>el valor seteado es cero</p>
            </c:when>
            <c:when test="${dato2=='1'}">
                <p>el valor seteado es uno</p>
            </c:when>
            <c:when test="${dato2=='100'}">
                <p>el valor seteado es cien</p>
            </c:when>
            <c:otherwise>
                <p>valor por default</p>
            </c:otherwise>
        </c:choose>
         
                
        
                
        <!-- Leemos una lista(ArrayList) que creamos
        desde un EJB
        com.francisco.jsp.beans:Lista.java-->
        
        <!--llamamos al EJB-->
        <jsp:useBean id="l" scope="session" class="com.francisco.jsp.beans.Lista" />
        <!--Mostramos los datos utilizando JSTL-->
        <ul>
            <c:forEach var="valor" items="${l.listadeNombres}">
                <li><c:out value="${valor}" /></li>
            </c:forEach>
        </ul>
    </body>
</html>
