<%-- 
    Document   : loginerror
    Created on : 04/03/2020, 03:31:22 PM
    Author     : francisco
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Error de Login</title>
    </head>
    <body>
        Se ha producido un error al hacer login. Intentelo de nuevo,
        por favor
        <br />
        <!--
            Si un usuario escribe credenciales incorrectas al intentar
            hacer login en nuestra aplicacion, automaticamente sera
            redirigido a esta Pagina.
        -->
        
        <!--<form method="POST" action="j_security_check">
            <table>
                <tr>
                    <td>Nombre Usuario:</td>
                    <td><input type="text" name="j_username"/></td>
                </tr>
                <tr>
                    <td>Contraseña:</td>
                    <td><input type="password" name="j_password"/></td>
                </tr>
                <tr>
                    <td></td>
                    <td><input type="submit" value="Login"/></td>
                </tr>
            </table>
        </form> -->
        
        <%@include file="WEB-INF/jspf/formulariologin.jspf" %>
        
    </body>
</html>
