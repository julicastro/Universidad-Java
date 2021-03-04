package test;

import domain.Persona;
import java.util.List;
import javax.ws.rs.client.*;
import javax.ws.rs.core.*;

public class TestPersonaServiceRS {
    
    //variable a utilizar
    private static final String URL_BASE = "http://localhost:8080/sga-jee-web/webservice";
    private static Client cliente;
    private static WebTarget webTarget;
    private static Persona persona;
    private static List <Persona> personas;
    private static Invocation.Builder invocationBuilder;
    private static Response response;
    
    public static void main(String[] args) {
        
        cliente = ClientBuilder.newClient();
        
        //leer una persona (metodo get)
        webTarget = cliente.target(URL_BASE).path("/personas"); // llamada al web service
        
        // proporicionamos un idPersona valido
        persona = webTarget.path("/1").request(MediaType.APPLICATION_XML).get(Persona.class);
        System.out.println("Persona recuperada: " + persona);
        
        // Leer todas las personas (metodo get con readentity de tipo list<>)
        personas = webTarget.request(MediaType.APPLICATION_XML).get(Response.class).readEntity(new GenericType<List<Persona>>(){});
        System.out.println("\n Personas recuperadas:");
        imprimirPersonas(personas);
        
        //Agregar una persona (metodo post)
        Persona nuevaPersona = new Persona();
        nuevaPersona.setNombre("Emily");
        nuevaPersona.setApellido("Stelly");
        nuevaPersona.setEmail("esic3@mail.com");
        nuevaPersona.setTelefono("1231321549");
        
        invocationBuilder = webTarget.request(MediaType.APPLICATION_XML);
        response = invocationBuilder.post(Entity.entity(nuevaPersona, MediaType.APPLICATION_XML));
        System.out.println("");
        System.out.println(response.getStatus());
        //recuperamos la persona recien agregada para dsp modificarla y al final eliminarla
        Persona personaRecuperada = response.readEntity(Persona.class);
        System.out.println("Persona agregada: " + personaRecuperada);
        
        //Modificar la persona (metodo put)
        // persona recuperada anteriormete
        Persona personaModificar = personaRecuperada;
        personaModificar.setApellido("Peretti");
        String pathId = "/" + personaModificar.getIdPersona();
        invocationBuilder = webTarget.path(pathId).request(MediaType.APPLICATION_XML);
        response = invocationBuilder.put(Entity.entity(personaModificar, MediaType.APPLICATION_XML));
        System.out.println("");
        System.out.println("response: " + response.getStatus());
        System.out.println("Persona modificada: " + response.readEntity(Persona.class));
        
        //Eliminar una persona
        //la persona recuperada anteriormete
        Persona personaEliminar = personaRecuperada;
        String pathEliminar = "/" + personaEliminar.getIdPersona();
        invocationBuilder = webTarget.path(pathEliminar).request(MediaType.APPLICATION_XML);
        response = invocationBuilder.delete();
        System.out.println("");
        System.out.println("response: " + response.getStatus());
        System.out.println("Persona Eliminada: " + personaEliminar);
        
        
    }

    private static void imprimirPersonas(List<Persona> personas) {
        for (Persona p : personas) {
            System.out.println("Persona: " + p);
        }
    }
    
    
}
