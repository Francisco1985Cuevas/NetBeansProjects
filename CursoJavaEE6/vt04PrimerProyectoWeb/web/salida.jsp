<%-- 
    Document   : salida
    Created on : 02/03/2020, 08:57:13 PM
    Author     : francisco
    Description: Este codigo esta formado tanto por elementos HTML 
    estaticos como expresiones y scriptles JSP.

    Nota: Al ejecutar el proyecto hecho originalmente como se muestra
    en el video me saltaba un error, ahora esta corregido y tambien
    se toma nota de una buena sugerencia con respecto al UseBean.

    Debes tener en cuenta que el nombre que pongas en el metodo 
    setAttribute del request en el Controller, es el mismo que vas 
    a llamar desde el name del getProperty, el id en el useBean, y 
    cuando lees los lenguajes de programacion desde salida.jsp.
    Por ejemplo, si en tu Controller tienes:
    request.setAttribute("lalala", datosEncuesta);
    Desde el salida.jsp debes llamar a los jsp:
    <jsp:getProperty name="lalala" property="nombreCompleto" /> // para llamar al nombre
    <jsp:useBean id="lalala" scope="request" class="com.cursojavaee.modelo.DatosEncuesta" /> // y debajo
    lalala.getProgLeng(); // donde llamas al array que te muestra los lenguajes de programacion

--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Gracias</title>
    </head>
    <body>
        <h2>Gracias por cubrir nuestra encuesta</h2>
        
        <jsp:useBean id="datosEncuesta" scope="request" class="com.cursojavaee.modelo.DatosEncuesta" />
        
        <p>
            Nos has familiarizado que estas familiarizado con los
            siguientes lenguajes de programacion:    
            
            <jsp:getProperty name="datosEncuesta" property="nombreCompleto" />
        </p>
        <ul>
            <%
                
                String[] lenguajesSeleccionados = datosEncuesta.getProgLeng();
                
                if(lenguajesSeleccionados != null){
                    for(int i = 0; i < lenguajesSeleccionados.length; i++){
                        %>
                        <li><%=lenguajesSeleccionados[i]%></li>
                        <%
                    }
                }
            %>
        </ul>
        
    </body>
</html>