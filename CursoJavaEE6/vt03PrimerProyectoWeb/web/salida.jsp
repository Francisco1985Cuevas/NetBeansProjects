<%-- 
    Document   : salida
    Created on : 02/03/2020, 08:57:13 PM
    Author     : francisco
    Description: Este codigo esta formado tanto por elementos HTML 
    estaticos como expresiones y scriptles JSP.
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
        
        <p>
            <%=request.getParameter("nombreCompleto") %>,
            Nos has familiarizado que estas familiarizado con los
            siguientes lenguajes de programacion:
        </p>
        <ul>
            <%
                String[] lenguajesSeleccionados = request.getParameterValues("progLeng");
                
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
