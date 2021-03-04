

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Despliegue de Variables </title>
    </head>
    <body>
        <h1>Despliegue de Variables!</h1>
        Variable en alcance request: ${mensaje}
        <br/>
        <br/>
        Variable en alcance session: ${mensaje}
        <br/>
        Rectangulo:
        <br/>
        Base: ${rectangulo.base}
        Altura: ${rectangulo.altura}
        Area: ${rectangulo.area}
        <br/>
        <br/>
        <a href="${pageContext.request.contextPath}/index.jsp">Link al inicio</a>

    </body>
</html>
