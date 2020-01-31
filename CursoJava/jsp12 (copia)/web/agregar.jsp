
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="UTF-8">
        <%@include file="header.jsp" %>
        <title>Agregar Persona</title>
    </head>
    <body>
        <!-- view agregar persona -->
        <h1>Agregar Persona!</h1>
        
        <nav aria-label="breadcrumb">
            <ol class="breadcrumb">
                <li class="breadcrumb-item"><a href="<%=request.getContextPath()%>/personas">Home</a></li>
                <li class="breadcrumb-item active" >Agregar Persona</li>
            </ol>
        </nav>
        
                
        <form name="form" action="<%=request.getContextPath() %>/agregar_post" method="post">
            <div class="form-group">
                <label for="nombres">Nombres</label>
                <input name="nombres" type="text" class="form-control" id="nombres">
            </div>
            <div class="form-group">
                <label for="apellidos">Apellidos</label>
                <input name="apellidos" type="text" class="form-control" id="apellidos">
            </div>
            <div class="form-group">
                <label for="nro_documento">Nro. Documento</label>
                <input name="nro_documento" type="text" class="form-control" id="nro_documento">
            </div>
            <div class="form-group">
                <label for="direccion">Direccion</label>
                <input name="direccion" type="text" class="form-control" id="direccion">
            </div>
            <div class="form-group">
                <label for="telefono">Telefono</label>
                <input name="telefono" type="text" class="form-control" id="telefono">
            </div>
            
            
            <button type="submit" class="btn btn-primary">Enviar</button>
        </form>
        
    </body>
</html>
