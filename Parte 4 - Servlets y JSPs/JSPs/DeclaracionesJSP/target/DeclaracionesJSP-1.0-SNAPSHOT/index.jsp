<%-- Agregamos declaracion de JSP--%>
<%! 
    //Declaramos var con su metodo get
    private String usuario = "Alberto";
    private String getUsuario(){
    return this.usuario;
}
    //Declaramos contador visitas
    private int contadorVisitas = 1;


%>



<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Uso de declaraciones JSP</title>
    </head>
    <body>
        <h1>Uso de declaraciones JSP</h1>
        Valor usuario por medio del atributo: <%= this.usuario %>
        <br>
        Valor usuario por medio del metodo: <%= this.getUsuario()%>
        <br><!-- comment -->
        Contador de visitas: <%= this.contadorVisitas++%>
    </body>
</html>
