<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
    <head>
        <title>Listado Alumnos</title>
    </head>
    <body>
        Listar Alumnos
        <br/>
        <a href="${pageContext.request.contextPath}/ServletRedireccionar">Agregar</a>
        <br/>
        <table border="1">
            <tr>
                <th>Alumno ID</th>
                <th>Nombre</th>
                <th>Domicilio</th>
                <th>Email</th>
                <th>Telefono</th>
            </tr>
            <c:forEach var="alumno" items="${alumnos}">
                <tr>
                    <td>
                        <a href="${pageContext.request.contextPath}/ServletModificar?idAlumno=${alumno.idAlumno}">
                            ${alumno.idAlumno}
                        </a>
                    </td>
                    <th>${alumno.nombre} ${alumno.apellido}</th>
                    <th>${alumno.domicilio.calle} ${alumno.domicilio.noCalle} ${alumno.domicilio.pais}</th>
                    <th>${alumno.contacto.email}</th>
                    <th>${alumno.contacto.telefono}</th>
                </tr>
            </c:forEach>
        </table>


    </body>
</html>
