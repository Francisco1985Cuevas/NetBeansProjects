<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="UTF-8">
        <title>Agregar Usuario</title>
    </head>
    <body>
        <h1>Agregar Usuario</h1>
        
        <form name="form" method="post" action="<%=request.getContextPath() %>/agregar_post">
            <p>
                Username: <input type="text" name="username" />
            </p>
            <p>
                email: <input type="text" name="email" />
            </p>
            <button type="submit">Enviar</button>
        </form>
    </body>
</html>
