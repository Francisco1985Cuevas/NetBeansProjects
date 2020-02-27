<%-- 
    Document   : index
    Created on : 13/01/2020, 04:20:38 PM
    Author     : francisco
    Description: Conexion MySQL con JSTL
    
    Vamos a ver como desarrollar un ambiente de conexión desde Java 
    a MySQL utilizando JSTL.
    En este proyecto vamos ver como conectarno y mostrar registros
    de una base de datos.
    -Lo primero que tenemos que hacer es importar(añadir/agregar) 
    la biblioteca “MySQL JDBC Driver” en nuestro proyecto.
    -Segundo paso, agregar los encabezados para los Tags de JSTL 
    core y para el SQL en nuestro archivo donde vamos a hacer uso
    -Tercer paso, agregamos la etiqueta sql:setDataSource para 
    realizar la conexion a la base de datos, iremos viendo algunos 
    parametros.
    driver:Donde indicamos la ruta de referencia al Driver con el 
    cual nosotros vamos a conectarnos(com.mysql.jdbc.Driver).
    url:el cual indicamos a Java que vamos a trabajar con 
    jdbc:mysql://localhost/test, jdbc:mysql://127.0.0.1/test, 
    si estamos trabajando con un servidor remoto poner esa 
    direccion.
    user: usuario de la base de datos.
    password: password de la base de datos
    var: nombre de la variable de instancia, obtenemos una 
    instancia de la conexión, y cuando hacemos referencia al 
    objeto de conexión lo hacemos mediante lo que tenemos 
    cargado dentro de “var”.
    -Cuarto paso, generar la consulta SQL por medio de las
    etiquetas de JSTL.
    -Quinto paso, mostrar resultados.

    taglib: uri="http://java.sun.com/jsp/jstl/core" prefix="c"
    representa una llamada al core de JSTL anhadiendole el 
    prefijo "c".
    
    taglib: uri="http://java.sun.com/jsp/jstl/sql" prefix="sql"
    se agrega para utilizar los tags de SQL de JSTL

    <c:forEach var="filas" items="${resultado_consulta.rows}">
    c:forEach var='filas' la variable "filas" que en este caso va 
    a ser la que va a recibir los parametros.
    
    c:forEach items='${resultado_consulta.rows}' Es donde le 
    vamos a indicar el item al que vamos a hacer referencia, 
    recorre a traves del forEach.. el arreglo que se llama 
    "resultado_consulta" y los va a ir recorriendo fila por 
    fila "rows" por eso se usa esta 
    nomenclatura(${resultado_consulta.rows}) y todo esto 
    lo guardamos dentro de la variable 'filas'
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
        
        <%-- Configuramos la conexion a la base de datos --%>
        <sql:setDataSource driver="com.mysql.jdbc.Driver" url="jdbc:mysql://localhost/test" user="root" password="" var="conexion" />
        
        <%-- Generar la consulta SQL--%>
        <sql:query dataSource="${conexion}" var="resultado_consulta">
            select * from personas;
        </sql:query>
        <%-- El resultado de la consulta esta guardado en 
        la variable "resultado_consulta" --%>
            
        <%-- Presentamos los datos usando JSTL en una 
        lista ordenada --%>
        <ul>
            <c:forEach var="filas" items="${resultado_consulta.rows}">
                <li>
                    ID: <c:out value="${filas.id}" />
                    Nombre: <c:out value="${filas.nombres}" />
                </li>
            </c:forEach>
        </ul>
        
        <%-- Presentamos los datos usando JSTL en una 
        tabla HTML --%>
        <table>
            <thead>
                <tr>
                    <th>#</th>
                    <th>Nombres</th>
                    <th>Apellidos</th>
                    <th>Nro. Doc.</th>
                    <th>Direccion</th>
                    <th>Telefono</th>
                    <th>Correo</th>
                </tr>
            </thead>
            <tbody>
                <c:forEach var="filas" items="${resultado_consulta.rows}">
                    <tr>
                        <td><c:out value="${filas.id}"></c:out></td>
                        <td><c:out value="${filas.nombres}"></c:out></td>
                        <td><c:out value="${filas.apellidos}"></c:out></td>
                        <td><c:out value="${filas.nro_documento}"></c:out></td>
                        <td><c:out value="${filas.direccion}"></c:out></td>
                        <td><c:out value="${filas.telefono}"></c:out></td>
                        <td><c:out value="${filas.correo}"></c:out></td>
                    </tr>
                </c:forEach>
            </tbody>
        </table>
    </body>
</html>
