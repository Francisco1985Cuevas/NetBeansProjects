<%-- 
    Document   : form
    Created on : 07/01/2020, 02:32:46 PM
    Author     : francisco
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="utf-8">
        <title>Trabajo con formularios</title>
    </head>
    <body>
        <h1>Ingrese sus datos</h1>
        <form action="form2.jsp?uri=hola" method="post" name="form">
            <p>Nombre: <input type="text" name="nom"/></p>
            <p>E-mail: <input type="text" name="correo"/></p>
            <p>Pais: 
                <select name="pais">
                    <option value="cl">Chile</option>
                    <option value="col">Colombia</option>
                    <option value="pe">Peru</option>
                    <option value="ve">Venezuela</option>
                    <option value="ar">Argentina</option>
                </select>
            </p>
            <p>
                Sexo M:<input type="radio" name="sexo" value="m" />
                F:<input type="radio" name="sexo" value="F" />
            </p>
            <p>
                <hr />
                <input type="submit" value="Enviar" title="Enviar">
            </p>
        </form>
    </body>
</html>
