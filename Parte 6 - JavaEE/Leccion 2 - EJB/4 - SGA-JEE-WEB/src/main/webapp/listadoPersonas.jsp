<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Listado de Personas</title>
    </head>
    <body>
        <h1>Listado de Personas</h1>
        <ul>
            <c:forEach items="${personas}" var="persona">
                
                <li>${persona.nombre} ${persona.apellido} </li>
                <li>${persona.email} </li>
                
            </c:forEach>
        </ul>
    </body>
</html>
