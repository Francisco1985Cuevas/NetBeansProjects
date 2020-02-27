<%-- 
    Document   : form2
    Created on : 07/01/2020, 03:04:44 PM
    Author     : francisco
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%
    request.setCharacterEncoding("UTF-8");
%>

<%! 
    //Scriptlet usado para hacer declaraciones...
    String input_pais;
    String desc_pais;
    
    String input_sexo;
    String desc_sexo;
%>

<!DOCTYPE html>
<html>
    <head>
        <meta charset="utf-8">
        <title>Recibiendo el Formulario</title>
    </head>
    <body>
        <h1>Recibiendo el Formulario</h1>
        <p>Tu IP es: <%=request.getRemoteAddr()%><p/>
        <p>Tu Nombre es: <%=request.getParameter("nom")%></p>
        <p>Tu Server es: <%=request.getServerName()%></p>
        <p>Tu email es: <%=request.getParameter("correo")%></p>
        <%
            //pais
            input_pais = request.getParameter("pais");
            desc_pais = "";
            
            if(input_pais.equals("ch")){
                desc_pais = "Chile";
            }else if(input_pais.equals("co")){
                desc_pais = "Colombia";
            }else if(input_pais.equals("pe")){
                desc_pais = "Peru";
            }else if(input_pais.equals("ve")){
                desc_pais = "Venezuela";
            }else{
               desc_pais = "Argentina";
            }
            
            //sexo
            input_sexo = request.getParameter("sexo");
            desc_sexo = "";
            
            if(input_sexo.equals("m")){
                desc_sexo = "Masculino";
            }else{
               desc_sexo = "Femenino";
            }    
        %>
        <p>Tu pais es: <%=request.getParameter("pais")%></p>
        <p>Tu pais es: <%=desc_pais%></p>
        <p>Tu sexo es: <%=request.getParameter("sexo")%></p>
        <p>Tu sexo es: <%=desc_sexo%></p>
        <p>Parametro pasado por URL: <%=request.getParameter("uri")%></p>
        
        <!-- ejercicio: utilizando switch case validar el campo pais
        para que se muestre el dato completo al cual pertenece
        tambien con el campo sexo
        hacerlo por scriptlet que realice esa validacion-->
    </body>
</html>
