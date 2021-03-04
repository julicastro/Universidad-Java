package testclientews;

import clientews.servicio.Persona;
import clientews.servicio.PersonaServiceImplService;
import clientews.servicio.PersonaServiceWs;
import java.util.List;

public class TestPersonaServiceWs {
    
    public static void main(String[] args) {
        
        PersonaServiceWs personaService = new PersonaServiceImplService().getPersonaServiceImplPort();
        
        System.out.println("Ejecutnado servicio de ejecutar PersonasWs");
        List<Persona > personas = personaService.listarPersonas();
        for (Persona persona : personas) {
            System.out.println("persona idpersona = " + persona.getIdPersona() + ", nombre = " + persona.getNombre() + ", apellido = " + persona.getApellido() + ", email = " + persona.getEmail());
        }
        System.out.println("Fin del servicio listar PersonasWs");
        
        
    }
    
    
    
}
