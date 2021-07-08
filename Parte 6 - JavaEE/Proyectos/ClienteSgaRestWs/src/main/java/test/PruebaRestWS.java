package test;

import domain.Persona;
import javax.ws.rs.client.*;
import javax.ws.rs.core.MediaType;
import org.glassfish.jersey.client.ClientConfig;
import org.glassfish.jersey.client.authentication.HttpAuthenticationFeature;

public class PruebaRestWS {
    public static void main(String[] args) {
        
        HttpAuthenticationFeature feature = HttpAuthenticationFeature.basicBuilder().nonPreemptive().credentials("admin", "admin").build();
        
        ClientConfig clientConfig = new ClientConfig();
        clientConfig.register(feature);
        
        Client cliente = ClientBuilder.newClient(clientConfig);
        
        WebTarget webTarget = cliente.target("http://localhost:8080/sga-jee-web/webservice").path("/personas");
        //Proporcionamos un idPersona valido
        Persona persona = webTarget.path("/2").request(MediaType.APPLICATION_XML).get(Persona.class);
        System.out.println("Persona recuperada:" + persona);
        
    }
}
