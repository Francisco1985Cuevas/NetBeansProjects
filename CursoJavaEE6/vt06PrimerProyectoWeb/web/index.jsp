<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page import="java.util.ArrayList" %>
<%@page import="com.cursojavaee.AlumnosBean.AlumnosBean" %>
<%-- 
    Document   : index
    Created on : 04/03/2020, 07:32:36 PM
    Author     : francisco
--%>

<%
    ArrayList<AlumnosBean> listaAlumnos = new ArrayList<AlumnosBean>();
    
    listaAlumnos.add(new AlumnosBean("Jaime", "Montoro"));
    listaAlumnos.add(new AlumnosBean("Antonio", "Segura"));
    listaAlumnos.add(new AlumnosBean("Carla", "Fuentes"));
%>



<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h2>Hola mundo</h2>
        
    <c:if test="${param.mostrarTextoCondicional == 'true'}" var="textoMostrado" scope="session">
        <p>
            Este texto se mostrara solo si mostrarTextoCondicional
            tiene un valor true
        </p>
    </c:if>
        <p>este parrafo se mostrara siempre</p>
        
        
        
        
        <c:choose>
            <c:when test="${param.mostrarTextoCondicional == '1'}">
                este parrafo se muestra porque el valor del parametro
                es 1
            </c:when>
            <c:when test="${param.mostrarTextoCondicional == '2'}">
                este parrafo se muestra porque el valor del parametro
                es 2
            </c:when>
            <c:otherwise>
                este parrafo se muestra porque el valor del parametro
                no es 1 ni 2
            </c:otherwise>
        </c:choose>
        
                
                <c:forEach var="alumnos" items="${sessionScope.listaAlumnos}">
                    <br>${alumnos.nombre} - ${alumnos.apellido}
                </c:forEach>
                
                
                
    </body>
</html>
