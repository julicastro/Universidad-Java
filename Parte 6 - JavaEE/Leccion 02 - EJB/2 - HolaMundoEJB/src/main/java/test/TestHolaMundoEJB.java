package test;

import beans.HolaMundoEjbRemote;
import javax.naming.*;

public class TestHolaMundoEJB {
    public static void main(String[] args) {
        System.out.println("Iniciando llamada al EJB desde el cliente\n");
        try{
            Context jndi = new InitialContext();
            // Ubicamos componente EJB
            HolaMundoEjbRemote holaMundoEJB = (HolaMundoEjbRemote) jndi.lookup("java:global/HolaMundoEJB-1.0/HolaMundoEjbImpl");
            // LOOKUP permite ubicar nuestro componente EJB del lado del servidor
            int resultado = holaMundoEJB.sumar(5, 3);
            System.out.println("Resultado EJB suma 5+3:" + resultado);
        }
        catch(NamingException e){
            e.printStackTrace(System.out);
        }
    }
}
