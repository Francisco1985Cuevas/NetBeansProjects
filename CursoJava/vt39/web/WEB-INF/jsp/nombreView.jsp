<%-- 
    Document   : nombreView
    Created on : 27/02/2020, 04:35:00 PM
    Author     : francisco
--%>

<%@taglib uri="http://www.springframework.org/tags" prefix="spring" %>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Escribe tu Nombre</title>
    </head>
    <body>
        <h1>Escribe tu Nombre:</h1>
        <spring:nestedPath path="valor">
            <form action="" method="post">
                Nombre:
                <spring:bind path="valor">
                    <input type="text" name="${status.expression}" value="${status.value}" />
                </spring:bind>
                <input type="submit" value="ok" />
            </form>            
        </spring:nestedPath>
        
    </body>
</html>
