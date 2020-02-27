<%-- 
    Document   : newjsp
    Created on : 21/02/2020, 09:52:34 AM
    Author     : francisco
    Description: inicio al JSTL 
    -Para trabajar con esta libreria(JSTL), lo primero que vamos a
    necesitar es la etiqueta "taglib". Siempre tiene que estar en 
    la primera linea de nuestra pagina JSP, si vamos a usar JSTL.
    Con esta etiqueta lo que hacemos es indicarle a nuestro programa
    que esta preparado para utilizar Tags para JSTL.
--%>

<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="UTF-8">
        <title>JSTL</title>
    </head>
    <body>
        <h1>JSTL</h1>
        
        <%-- Tags JSTL --%>
        <c:out value="Hola mundo desde JSTL"></c:out>
        <%-- 
        -En la Etiqueta "taglib" se agregan dos atributos:
        prefix, uri
        prefix lo que hace es darle un "alias" a cada uno de
        los Tags que nosotros vamos a utilizar, por default
        se usa la letra "c".
        -c:out= nos permite tener un resultado de un texto
        en pantalla.
        -c:foreach= El foreach usamos para manejar recorrido de
        arreglos. Podemos hacer conexiones a bases de datos y
        podemos cargar los datos de esa misma conexion a traves
        de este Tag de JSTL.
        --%>
        <hr>
        <%-- Impresion en pantalla usando Scriptles --%>
        <%="Hola mundo desde un Scriptlet"%>
        <%-- Se puede usar cualquiera de las dos opciones hasta
        aqui conocidas, Scriptlet o JSTL es importante conocer
        ambas para elegir con cual trabajar. --%>
        <hr>
        
        <%-- declarando y asignando un valor a una variable JSTL --%>
        <c:set var="dato" value="1" />
        <c:if test="${dato=='1'}" var="d">
            <c:out value="Texto dentro de la Aplicación"></c:out>
        </c:if>
        
        <%-- validacion usando choose --%>    
        <c:set var="dato2" value="5" />    
        <c:choose>
            <c:when test="${dato2=='-1'}">
                <p>el valor seteado es menos uno</p>
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
        
        <%-- 
        Mostramos datos obtenidos desde EJB usando JSTL.
        -Primero: debemos crear un package que va a contener
        el EJB que vamos a crear(com.francisco.jsp.beans)
        -Segundo: dentro del nuevo paquete... crear el archivo
        bean(EJB) en el cual vamos a crear la Clase
        con el ArrayList y le agregaremos algunos valores de prueba
        -Tercero: mostramos los datos obtenidos en este archivo
        index.jsp, los presentamos dentro de una lista ordenada
        de HTML <ul>, leemos el ArrayList que creamos usando
        etiquetas bean.
        --%>
        
        <%-- Llamamos al archivo EJB usando etiquetas bean --%>
        <jsp:useBean id="l" scope="session" class="com.francisco.jsp.beans.Lista" />
        <%-- Mostramos los datos obtenidos utilizando JSTL --%>
        <ul>
            <c:forEach var="valor" items="${l.listadeNombres}">
                <li><c:out value="${valor}" /></li>
            </c:forEach>
        </ul>
        <%--Resumiendo: Creamos un archivo desde donde vamos a leer 
        una lista, un ArrayList que vamos a crear dentro de un EJB. 
        - Leemos la lista(ArrayList) que creamos desde el EJB
        com.francisco.jsp.beans:Lista.java--%>
        
    </body>
</html>
