<%-- 
    Document   : index
    Created on : 08/01/2020, 03:38:26 PM
    Author     : francisco
    Description: practicar el manejo y uso del 
    Enterprise Java Bean(EJB)
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Ejemplo de EJB</title>
    </head>
    <body>
        <h1>Ejemplo de Enterprise Java Bean(EJB)</h1>
        <hr>
        
        <!--
            * Uso de beans desde esta página JSP.
            Para interactuar con un bean desde una página JSP es 
            necesario primero asignarle un nombre y especificar 
            qué clase Java lo define. Una vez hecho esto, se puede 
            acceder a sus propiedades y darles nuevos valores.
            
            * Acceso al bean
            Para hacer accesible un bean a una página JSP se emplea 
            la etiqueta useBean. En su forma más simple la 
            sintaxis es:
        -->
        <jsp:useBean id="t" scope="request" class="com.francisco.jsp.modelos.testModel" />
        
        <!--
            * Acceso a las propiedades del bean
            El acceso a una propiedad se realiza mediante la etiqueta 
            jsp:getProperty. Su sintaxis es: -->
        <%--<jsp:setProperty name="t" property="nombre" value="Francisco Cuevas" />--%>
        El nombre desde el EJB es:
        <jsp:getProperty name="t" property="nombre" />
        
        El correo desde el EJB es:
        <jsp:getProperty name="t" property="correo" />
        
        El pais desde el EJB es:
        <jsp:getProperty name="t" property="pais" />
        
        El sexo desde el EJB es:
        <jsp:getProperty name="t" property="sexo" />
        
        
        
        <!--//29
        //33 -->
        
        <!-- Formulario de prueba, para practicar uso de bean -->
        <h1>Ingrese sus datos</h1>
        <form action="testController" method="post">
            <p>Nombre: <input type="text" name="nombre"/></p>
            <p>E-mail: <input type="text" name="correo"/></p>
            <p>Pais: 
                <select name="pais">
                    <option value="cl">Chile</option>
                    <option value="col">Colombia</option>
                    <option value="pe">Peru</option>
                    <option value="ve">Venezuela</option>
                    <option value="ar">Argentina</option>
                    <option value="pa" selected >Paraguay</option>
                </select>
            </p>
            <p>
                Sexo M:<input type="radio" name="sexo" value="m" />
                F:<input type="radio" name="sexo" value="F" />
            </p>
            <hr />
            <p>
                <input type="submit" value="Enviar" title="Enviar" />
            </p>
        </form> 
        
    </body>
</html>
