package testclientews;

import clientews.servicio.Persona;
import clientews.servicio.PersonaServiceImplService;
import clientews.servicio.PersonaServiceWs;
import java.util.List;
import javax.xml.ws.BindingProvider;

public class TestPersonaServiceWS {
    public static void main(String[] args) {
        PersonaServiceWs personaService = new PersonaServiceImplService().getPersonaServiceImplPort();
        
        ((BindingProvider)personaService).getRequestContext().put(BindingProvider.USERNAME_PROPERTY, "admin");
        ((BindingProvider)personaService).getRequestContext().put(BindingProvider.PASSWORD_PROPERTY, "admin");
        
        System.out.println("ejecutando servicio listar personas ws");
        
        List<Persona> personas = personaService.listarPersonas();
        for(Persona persona: personas){
            System.out.println("Persona idPersona:" + persona.getIdPersona() + ", nombre:" + persona.getNombre() 
            + ", apellido:" +  persona.getApellido() + ", email:" + persona.getEmail());
        }
        System.out.println("Fin servicio listar personas ws");
    }
}
