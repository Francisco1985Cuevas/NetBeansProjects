<!--View personas-->
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="UTF-8" />
        <!--<link rel="stylesheet" href="bootstrap-4.4.1/css/bootstrap.min.css" crossorigin="anonymous" type="text/css">
        <script src="bootstrap-4.4.1/js/bootstrap.min.js" integrity="sha384-wfSDF2E50Y2D1uUdj0O3uMBJnjuUD4Ih7YwaYd1iqfktj0Uod8GCExl3Og8ifwB6" crossorigin="anonymous"></script>-->
        <%--@include file="bootstrap-4.4.1/css/bootstrap.min.css" --%>
        <title>Personas</title>
    </head>
    <body>
        <h1>Listado de Personas!</h1>
        
        <p>
            <a href="<%=request.getContextPath()%>/agregarcontroller" class="btn btn-success">Agregar</a>
        </p>
        <table class="table table-bordered">
            <thead>
                <tr>
                    <th scope="col">#</th>
                    <th scope="col">Nombres</th>
                    <th scope="col">Apellidos</th>
                    <th scope="col">Documento Nro.</th>
                    <th scope="col">Direccion</th>
                    <th scope="col">Telefono</th>
                    <th scope="col">Correo</th>
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
                    <td><c:out value="${dato.getCorreo()}"></c:out></td>
                    <td>
                        <a href="<%=request.getContextPath()%>/editar?id=<c:out value="${dato.getId()}"></c:out>">Editar</a> - 
                        <a href="<%=request.getContextPath()%>/eliminar?id=<c:out value="${dato.getId()}"></c:out>">Borrar</a></td>
                    </tr>
                </c:forEach>
            </tbody>
        </table>
        
    </body>
</html>
