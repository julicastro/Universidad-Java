<%@page contentType="text/html" pageEncoding="UTF-8" %>
<%@taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
    <head>
        <title><s:text name="form.titulo"/></title>
    </head>
    <body>
        <h1><s:text name="form.titulo"/></h1>
        <s:form action="validarUsuario">
            <s:textfield key="form.usuario" name="usuario" />
            <s:password key="form.password" name="password"/>
            <s:submit key="form.boton" name="submit" />
        </s:form>
    </body>
</html>
