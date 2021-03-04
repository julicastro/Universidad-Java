<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>EL y Varaibles Implicitas</title>
    </head>
    <body>
        <h1>EL y Varaibles Implicitas</h1>
        <<ul>
            <li>Nombre de la applicacion: ${pageContext.request.contextPath}</li>
            <li>Navegador del cliente: ${header["User-Agent"]}</li>
            <li>ID de la sesion: ${cookie.JSESSIONID.value}</li>
            <li>Web Servlet: ${pageContext.servletContext.serverInfo}</li>
            <li>Valor parametro: ${param.usuario}</li>
            <li>Valor parametro: ${param["usuario"]}</li>
            <br/>
            <br/><!-- comment -->
            <a href="index.jsp">Regresar al inicio</a>
        </ul>

    </body>
</html>
