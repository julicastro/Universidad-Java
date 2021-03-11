<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
    <head>
        <title>Listado Alumnos</title>
    </head>
    <body>
        
        <table border="1">
            <caption>Listar Alumnos</caption>
            <tr>
                <th>Alumno ID</th>
                <th>Nombre</th>
                <th>Domicilio</th>
                <th>Email</th>
                <th>Telefono</th>
            </tr>
            <c:forEach var="alumno" items="${alumnos}">
                <tr>
                    <th>${alumno.idAlumno}</th>
                    <th>${alumno.nombre} ${alumno.apellido}</th>
                    <th>${alumno.domicilio.calle} ${alumno.domicilio.noCalle} ${alumno.domicilio.pais}</th>
                    <th>${alumno.contacto.email}</th>
                    <th>${alumno.contacto.telefono}</th>
                </tr>
            </c:forEach>
        </table>


    </body>
</html>
