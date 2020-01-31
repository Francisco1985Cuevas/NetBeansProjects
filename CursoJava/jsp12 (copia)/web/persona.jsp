<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="UTF-8" />
        <%@include file="header.jsp" %>
        <title>Personas</title>
    </head>
    <body>
        <!-- view Personas-->
        <h1>Personas!</h1>
        <!--Cargar el listado de personas, lo vamos a colocar en una tabla-->
        
        <p><a href="<%=request.getContextPath()%>/agregar" class="btn btn-success">Agregar</a></p>
        <table class="table table-bordered">
            <thead>
                <tr>
                    <th scope="col">#</th>
                    <th scope="col">Nombres</th>
                    <th scope="col">Apellidos</th>
                    <th scope="col">Documento Nro.</th>
                    <th scope="col">Direccion</th>
                    <th scope="col">Telefono</th>
                    <th scope="col">Acciones</th>
                </tr>
            </thead>
            <tbody>
                <c:forEach items="${datos}" var="dato">
                    <tr>
                        <th scope="row"><c:out value="${dato.getId()}"></c:out></th>
                    <td><c:out value="${dato.getNombres()}"></c:out></td>
                    <td><c:out value="${dato.getApellidos()}"></c:out></td>
                    <td><c:out value="${dato.getNroDocumento()}"></c:out></td>
                    <td><c:out value="${dato.getDireccion()}"></c:out></td>
                    <td><c:out value="${dato.getTelefono()}"></c:out></td>
                    <td>
                        <a href="<%=request.getContextPath()%>/editar?id=<c:out value="${dato.getId()}"></c:out>">Editar</a> - 
                        <a href="<%=request.getContextPath()%>/eliminar?id=<c:out value="${dato.getId()}"></c:out>">Borrar</a></td>
                    </tr>
                </c:forEach>
               
            </tbody>
        </table>
        
    </body>
</html>
