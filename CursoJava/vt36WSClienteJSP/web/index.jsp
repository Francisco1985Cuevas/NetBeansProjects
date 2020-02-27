<%-- 
    Document   : index
    Created on : 26/02/2020, 01:47:35 PM
    Author     : francisco
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
        
        <%-- start web service invocation --%>
        <hr/>
        <%
            try {
                com.cursojava.ws.CalculadoraWS_Service service = new com.cursojava.ws.CalculadoraWS_Service();
                com.cursojava.ws.CalculadoraWS port = service.getCalculadoraWSPort();
                 // TODO initialize WS operation arguments here
                int i = 4;
                int j = 8;
                // TODO process result here
                int result = port.add(i, j);
                out.println("Result = "+result);
            } catch (Exception ex) {
                // TODO handle custom exceptions here
            }
        %>
        <%-- end web service invocation --%>
        <hr/>

        
    </body>
</html>
