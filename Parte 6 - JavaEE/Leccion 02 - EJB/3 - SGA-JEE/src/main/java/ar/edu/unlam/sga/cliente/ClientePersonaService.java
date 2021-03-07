package ar.edu.unlam.sga.cliente;

import ar.edu.unlam.sga.domain.Persona;
import ar.edu.unlam.sga.servicio.PersonaServiceRemote;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.naming.*;


public class ClientePersonaService {
    public static void main(String[] args) {
        
        System.out.println("Iniciando el llamado al EJB desde el cliente\n");
        try {
            Context jndi = new InitialContext();
            PersonaServiceRemote personaService = (PersonaServiceRemote) jndi.lookup("java:global/SGA.JEE/PersonaServiceImpl!ar.edu.unlam.sga.servicio.PersonaServiceRemote");
           
            List<Persona>personas = personaService.listarPersonas();
          
            for (Persona persona : personas) {
                System.out.println(persona);
            }
            
        System.out.println("fin de la llamada al EJB desde el cliente\n");
        } catch (NamingException ex) {
            ex.printStackTrace(System.out);
        }
        
        
        
    }
}
