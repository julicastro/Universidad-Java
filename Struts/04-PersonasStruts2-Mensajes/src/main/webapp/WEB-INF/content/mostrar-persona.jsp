<%@page contentType="text/html" pageEncoding="UTF-8" %>
<%@taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
    <head>
        <title><s:property value="titulo" /></title>
    </head>
    <body>
        <h1><s:property value="titulo"/></h1>
        <s:form>
            <s:textfield name="nombre" />
            <s:submit key="persona.boton" name="submit" />
        </s:form>
        <div>
            <s:property value="valor"/> : 
            <s:property value="nombre" />
        </div>
    </body>
</html>
