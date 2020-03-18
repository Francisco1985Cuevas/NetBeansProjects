<%-- 
    Document   : login
    Created on : 04/03/2020, 03:06:05 PM
    Author     : francisco
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Login</title>
    </head>
    <body>
        <p>
            Por favor escribe tu nombre de usuario y contraseña para
            acceder a la aplicacion
        </p>
        <!--
            En toda Pagina de Login que creemos para usar este sistema
            de autentificacion basado en formulario vamos a tener que 
            incluir un formulario HTML al que como atributos hay que
            pasarle: method="POST" action="j_security_check"
            Porque toda aplicacion compatible con los desarrollos de
            Servidor de Java EE, cuenta ya con un Servlet de seguridad
            implementado en la instalacion.
            Este Servlet es Mapeado es Asignado a la URL: j_security_check
            por tanto al incluir la action="j_security_check" su metodo
            doPost() sera ejecutado cuando el formulario sea enviado.
            
            Ademas cada Pagina de login de autentificacion basada en 
            formulario tiene tambien que incluir dos campos adicionales
            un campo de texto al que tenemos que llamar:
            <input type="text" name="j_username"/>
            y un campo de contraseña al que tenemos que llamar:
            <input type="password" name="j_password"/>
            
            El Servlet de seguridad sera el encargado de comprobar que
            estos valores coincidan con los que contenga el dominio
            de seguridad una vez que el cliente envie el formulario
            cubierto.
            
            Y desde luego el formulario tiene que tener tambien un
            boton para que puedan ser enviados los datos al Servlet.
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
        </form>-->
        
        <!-- lo que hace esta directiva include es insertar contenido
        del fragmento jsp en nuestra pagina, el valor de su atributo
        file es la ruta relativa al archivo que queremos que se 
        incluya.
        -->
        <%@include file="WEB-INF/jspf/formulariologin.jspf" %>
        
    </body>
</html>
