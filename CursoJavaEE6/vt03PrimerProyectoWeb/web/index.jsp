<%-- 
    Document   : index
    Created on : 02/03/2020, 08:05:55 PM
    Author     : francisco
    Description: vamos a crear una aplicacion web totalmente
    operativa, la aplicacion es una simple encuesta, preguntando
    a los desarrolladores de software que indiquen cuales son los
    lenguajes de programacion con los que estan mas familiarizados.

    La aplicacion consta de dos paginas, se desarrolla la pagina de
    entrada(index.jsp) en la que el usuario va a poder incluir una 
    informacion y al pulsar sobre el boton enviar, tenemos la otra 
    pagina(salida.jsp) la de salida... que sirve como pagina de 
    confirmacion de que el usuario ha realmente enviado los datos 
    que queria enviar.
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Encuesta entre desarrolladores</title>
    </head>
    <body>
        <h1>Bienvenido a la encuesta para desarrolladores</h1>
        <p>
            Indica los lenguajes de programacion con los que estas
            familiarizado
        </p>
        
        <form action="salida.jsp">
            <table border="0">
                <tbody>
                    <tr>
                        <td>Nombre Completo</td>
                        <td>
                            <input type="text" name="nombreCompleto" />
                        </td>
                    </tr>
                    <tr>
                        <td>Java</td>
                        <td><input type="checkbox" name="progLeng" value="java" /></td>
                    </tr>
                    <tr>
                        <td>PHP</td>
                        <td><input type="checkbox" name="progLeng" value="PHP" /></td>
                    </tr>
                    <tr>
                        <td>Ruby</td>
                        <td><input type="checkbox" name="progLeng" value="Ruby" /></td>
                    </tr>
                    <tr>
                        <td>Python</td>
                        <td><input type="checkbox" name="progLeng" value="Python" /></td>
                    </tr>
                    <tr>
                        <td></td>
                        <td><input type="submit" value="Enviar" /></td>
                    </tr>
                </tbody>
            </table>
        </form>
        
    </body>
</html>
